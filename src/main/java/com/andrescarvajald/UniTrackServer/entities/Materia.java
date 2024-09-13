package com.andrescarvajald.UniTrackServer.entities;

import jakarta.persistence.*;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "materia_id")
    private Integer id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
