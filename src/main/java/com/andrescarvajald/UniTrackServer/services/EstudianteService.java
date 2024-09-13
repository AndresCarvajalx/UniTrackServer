package com.andrescarvajald.UniTrackServer.services;

import com.andrescarvajald.UniTrackServer.entities.Estudiante;
import com.andrescarvajald.UniTrackServer.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService implements Crud<Estudiante> {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> getAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante create(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante update(int id, Estudiante estudiante) {
        Estudiante est = estudianteRepository.findById(id).orElseThrow(RuntimeException::new);
        est.setNombres(estudiante.getNombres());
        est.setApellidos(estudiante.getApellidos());
        est.setJornada(estudiante.getJornada());
        est.setEstado(estudiante.getEstado());
        est.setCedula(estudiante.getCedula());
        return estudianteRepository.save(est);
    }

    @Override
    public void delete(Estudiante estudiante) {
        estudianteRepository.delete(estudiante);
    }
}
