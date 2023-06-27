package com.alvaro;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private List<Alumno> alumnos;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void matricularAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarAlumnosRegistrados() {
        System.out.println("Alumnos registrados en la carrera " + nombre + ":");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());
        }
    }

}

