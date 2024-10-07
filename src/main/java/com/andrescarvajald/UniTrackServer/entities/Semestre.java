package com.andrescarvajald.UniTrackServer.entities;

import jakarta.persistence.*;

@Entity
public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semestre_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    private int nivel;
    private String periodo;
    private Double promedioPeriodo;
    private Double promedioFinal;
    private int cantidadAsignaturas;
    private int cantidadCreditos;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getPromedioPeriodo() {
        return promedioPeriodo;
    }

    public void setPromedioPeriodo(Double promedioPeriodo) {
        this.promedioPeriodo = promedioPeriodo;
    }

    public Double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(Double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public int getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }
}
