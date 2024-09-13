package com.andrescarvajald.UniTrackServer.entities;

import jakarta.persistence.*;

@Entity
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "historial_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "semestre_id", nullable = false)
    private Semestre semestre;

    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

    @Column //(name = "nota_materia")
    private Double notaMateria;

    private String estadoMateria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNotaMateria() {
        return notaMateria;
    }

    public void setNotaMateria(Double notaMateria) {
        this.notaMateria = notaMateria;
    }

    public String getEstadoMateria() {
        return estadoMateria;
    }

    public void setEstadoMateria(String estadoMateria) {
        this.estadoMateria = estadoMateria;
    }
}
