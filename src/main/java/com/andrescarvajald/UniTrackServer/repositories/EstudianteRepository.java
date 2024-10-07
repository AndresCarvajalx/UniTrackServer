package com.andrescarvajald.UniTrackServer.repositories;

import com.andrescarvajald.UniTrackServer.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    @Query("SELECT s FROM Estudiante s WHERE s.cedula = :cedula")
    Estudiante findByCedula(@Param("cedula") Long cedula);
}
