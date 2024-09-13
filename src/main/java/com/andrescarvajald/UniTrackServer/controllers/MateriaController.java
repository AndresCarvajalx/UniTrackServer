package com.andrescarvajald.UniTrackServer.controllers;

import com.andrescarvajald.UniTrackServer.entities.Materia;
import com.andrescarvajald.UniTrackServer.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/materias/")
@RestController
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getAll() {
        return materiaService.getAll();
    }

    @PostMapping
    public Materia create(@RequestBody Materia materia) {
        return materiaService.create(materia);
    }

    @PutMapping("{id}")
    public Materia update(@PathVariable int id, @RequestBody Materia materia) {
        return materiaService.update(id, materia);
    }

    @DeleteMapping
    public void delete(@RequestBody Materia materia) {
        materiaService.delete(materia);
    }
}
