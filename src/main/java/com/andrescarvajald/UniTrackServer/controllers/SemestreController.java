package com.andrescarvajald.UniTrackServer.controllers;

import com.andrescarvajald.UniTrackServer.entities.Materia;
import com.andrescarvajald.UniTrackServer.entities.Semestre;
import com.andrescarvajald.UniTrackServer.services.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/semestre/")
@RestController
public class SemestreController {
    @Autowired
    private SemestreService semestreService;

    @GetMapping
    public List<Semestre> getAll() {
        return semestreService.getAll();
    }

    @PostMapping
    public Semestre create(@RequestBody Semestre semestre) {
        return semestreService.create(semestre);
    }

    @PutMapping("{id}")
    public Semestre update(@PathVariable int id, @RequestBody Semestre semestre) {
        return semestreService.update(id, semestre);
    }

    @DeleteMapping
    public void delete(@RequestBody Semestre semestre) {
        semestreService.delete(semestre);
    }
}
