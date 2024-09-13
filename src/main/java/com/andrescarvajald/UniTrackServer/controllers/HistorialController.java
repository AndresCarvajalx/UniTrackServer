package com.andrescarvajald.UniTrackServer.controllers;

import com.andrescarvajald.UniTrackServer.dto.EstudianteMateriaPerdidaDTO;
import com.andrescarvajald.UniTrackServer.entities.Historial;
import com.andrescarvajald.UniTrackServer.services.HistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/historial/")
public class HistorialController {
    @Autowired
    private HistorialService historialService;

    @GetMapping()
    public List<Historial> getHistorial() {
        return historialService.getAll();
    }

    @GetMapping("perdiendo-materias/")
    public List<EstudianteMateriaPerdidaDTO> getPerdiendoMaterias() {
        return historialService.getEstudiantesPerdiendoMaterias();
    }

    @PostMapping
    public Historial addHistorial(@RequestBody Historial historial) {
        return historialService.create(historial);
    }

    public void deleteHistorial(@RequestBody Historial historial) {
        historialService.delete(historial);
    }

    // TODO UPDATE
}
