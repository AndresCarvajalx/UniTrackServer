package com.andrescarvajald.UniTrackServer.services;

import com.andrescarvajald.UniTrackServer.entities.Materia;
import com.andrescarvajald.UniTrackServer.entities.Semestre;
import com.andrescarvajald.UniTrackServer.repositories.SemestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemestreService implements Crud<Semestre> {
    @Autowired
    private SemestreRepository semestreRepository;

    @Override
    public List<Semestre> getAll() {
        return semestreRepository.findAll();
    }

    @Override
    public Semestre create(Semestre semestre) {
        return semestreRepository.save(semestre);
    }

    @Override
    public Semestre update(int id, Semestre materia) {
        //Materia materia1 = semestreRepository.findById(id).orElseThrow(RuntimeException::new);
        //materia1.setNombre(materia.getNombre());
        return null;
    }

    @Override
    public void delete(Semestre semestre) {
        semestreRepository.delete(semestre);
    }

}
