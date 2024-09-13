package com.andrescarvajald.UniTrackServer.services;

import com.andrescarvajald.UniTrackServer.entities.Estudiante;
import com.andrescarvajald.UniTrackServer.entities.Materia;
import com.andrescarvajald.UniTrackServer.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService implements Crud<Materia> {
    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public List<Materia> getAll() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia create(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia update(int id, Materia materia) {
        Materia materia1 = materiaRepository.findById(id).orElseThrow(RuntimeException::new);
        materia1.setNombre(materia.getNombre());
        return materiaRepository.save(materia1);
    }

    @Override
    public void delete(Materia materia) {
        materiaRepository.delete(materia);
    }
}
