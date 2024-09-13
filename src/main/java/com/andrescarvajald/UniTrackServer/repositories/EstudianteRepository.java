package com.andrescarvajald.UniTrackServer.repositories;

import com.andrescarvajald.UniTrackServer.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    Estudiante findByCedula(int cedula);
}
