package com.andrescarvajald.UniTrackServer.exceptions;

public class EstudianteNotFound extends Exception{
    public EstudianteNotFound(int id){
        super("Estudiante con el identificador <" + id + "> no encontrado");
    }
}
