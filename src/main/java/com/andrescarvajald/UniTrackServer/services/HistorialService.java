package com.andrescarvajald.UniTrackServer.services;

import com.andrescarvajald.UniTrackServer.dto.EstudianteMateriaPerdidaDTO;
import com.andrescarvajald.UniTrackServer.entities.Historial;
import com.andrescarvajald.UniTrackServer.repositories.HistorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialService implements Crud<Historial> {

    @Autowired
    private HistorialRepository historialRepository;

    @Override
    public Historial create(Historial historial) {
        return historialRepository.save(historial);
    }

    @Override
    public Historial update(int id, Historial historial) {
        return null;
    }

    @Override
    public List<Historial> getAll() {
        return historialRepository.findAll();
    }

    @Override
    public void delete(Historial historial) {
        historialRepository.delete(historial);
    }

    public List<EstudianteMateriaPerdidaDTO> getEstudiantesPerdiendoMaterias() {
        return historialRepository.findEstudiantesLosingSubjects();
    }

}
