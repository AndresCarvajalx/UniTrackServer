package com.andrescarvajald.UniTrackServer.repositories;

import com.andrescarvajald.UniTrackServer.dto.EstudianteMateriaPerdidaDTO;
import com.andrescarvajald.UniTrackServer.entities.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistorialRepository extends JpaRepository<Historial, Integer> {
    @Query("SELECT new com.andrescarvajald.UniTrackServer.dto.EstudianteMateriaPerdidaDTO(" +
            "e.id, " +
            "e.cedula, " +
            "e.jornada, " +
            "e.estado, " +
            "e.nombres, " +
            "e.apellidos, " +
            "MAX(s.nivel), " +
            "m.nombre, " +
            "COUNT(h) " +
            ") " +
            "FROM Historial h " +
            "JOIN h.estudiante e " +
            "JOIN h.materia m " +
            "JOIN h.semestre s " +
            "WHERE h.estadoMateria = 'PERDIDA' " +
            "GROUP BY e.id, m.nombre " +
            "ORDER BY e.id, m.nombre")
    List<EstudianteMateriaPerdidaDTO> findEstudiantesLosingSubjects();
}
