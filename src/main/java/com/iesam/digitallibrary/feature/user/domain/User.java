package com.iesam.digitallibrary.feature.user.domain;

public class User {
    public final String id;
    public final String nombre;
    public final String apellido;
    public final String dni;

    public User(String id, String nombre, String apellido, String dni, String fechaInscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaInscripcion = fechaInscripcion;
    }

    public final String fechaInscripcion;
}
