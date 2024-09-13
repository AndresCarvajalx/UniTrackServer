package com.andrescarvajald.UniTrackServer.dto;

public class EstudianteMateriaPerdidaDTO {
//    SELECT e.estudiante_id,
//    e.nombres,
//    e.apellidos,
//    MAX(s.nivel) AS nivel,
//    m.nombre AS materia_nombre,
//    COUNT(*) AS veces_perdida
//    FROM historial h
//    JOIN estudiante e ON h.estudiante_id = e.estudiante_id
//    JOIN materia m ON h.materia_id = m.materia_id
//    JOIN semestre s ON h.semestre_id = s.semestre_id
//    WHERE h.estado_materia = 'PERDIDA'
//    GROUP BY e.estudiante_id, m.nombre
//    ORDER BY e.estudiante_id, m.nombre;
    private int estudianteId;
    private Long cedula;
    private String estudianteNombre;
    private String estudianteApellido;
    private int semestreNivel;
    private String materiaNombre;
    private String jornada;
    private String estado;
    private Long vecesPerdida;

    public EstudianteMateriaPerdidaDTO(int estudianteId, Long cedula, String jornada, String estado, String estudianteNombre, String estudianteApellido, int semestreNivel, String materiaNombre, Long vecesPerdida) {
        this.estudianteId = estudianteId;
        // TODO CHANGE CEDULA TYPE TO LONG
        this.cedula = cedula;
        this.estudianteNombre = estudianteNombre;
        this.estudianteApellido = estudianteApellido;
        this.semestreNivel = semestreNivel;
        this.materiaNombre = materiaNombre;
        this.vecesPerdida = vecesPerdida;
        this.estado = estado;
        this.jornada = jornada;
    }

    public int getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getEstudianteNombre() {
        return estudianteNombre;
    }

    public void setEstudianteNombre(String estudianteNombre) {
        this.estudianteNombre = estudianteNombre;
    }

    public String getEstudianteApellido() {
        return estudianteApellido;
    }

    public void setEstudianteApellido(String estudianteApellido) {
        this.estudianteApellido = estudianteApellido;
    }

    public int getSemestreNivel() {
        return semestreNivel;
    }

    public void setSemestreNivel(int semestreNivel) {
        this.semestreNivel = semestreNivel;
    }

    public String getMateriaNombre() {
        return materiaNombre;
    }

    public void setMateriaNombre(String materiaNombre) {
        this.materiaNombre = materiaNombre;
    }

    public Long getVecesPerdida() {
        return vecesPerdida;
    }

    public void setVecesPerdida(Long vecesPerdida) {
        this.vecesPerdida = vecesPerdida;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }


    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
