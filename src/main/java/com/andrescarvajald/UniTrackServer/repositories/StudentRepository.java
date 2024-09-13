package com.andrescarvajald.UniTrackServer.repositories;

import com.andrescarvajald.UniTrackServer.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Estudiante, Integer> {
    Estudiante findByCedula(int cedula);
}
