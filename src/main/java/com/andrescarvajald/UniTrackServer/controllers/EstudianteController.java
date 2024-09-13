package com.andrescarvajald.UniTrackServer.controllers;

import com.andrescarvajald.UniTrackServer.entities.Estudiante;
import com.andrescarvajald.UniTrackServer.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/estudiantes/")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return estudianteService.getAll();
    }

    @PostMapping
    Estudiante addEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.create(estudiante);
    }

    @DeleteMapping
    void deleteEstudiante(@RequestBody Estudiante estudiante) {
        estudianteService.delete(estudiante);
    }

    @PutMapping("{id}")
    void updateEstudiante(@PathVariable Integer id, @RequestBody Estudiante estudiante) {
        estudianteService.update(id, estudiante);
    }
}
