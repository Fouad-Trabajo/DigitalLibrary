package com.iesam.digitallibrary.feature.user.domain;

public class User {
    public final String id, nombre, apellido, dni, fechaInscripcion;


    public User(String id, String nombre, String apellido, String dni, String fechaInscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaInscripcion = fechaInscripcion;
    }


}
