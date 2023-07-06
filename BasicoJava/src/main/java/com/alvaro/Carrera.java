package com.alvaro;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrera {
    private String nombre;
    private List<Alumno> alumnos;
    private Scanner scanner;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {

        return nombre;
    }

    private void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        System.out.println("Alumno agregado correctamente.");
        System.out.println("________________________________");
    }

    public void matricularAlumno(Alumno al) {
        this.alumnos.add(al);

        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals())
                System.out.println("Ya estas oe ");
        }
    }


    public void mostrarAlumnosRegistrados() {
        System.out.println("Carrera : " + nombre);
        for (Alumno alumno : this.alumnos) {
            System.out.println("Nombre:  " + alumno.getNombre());
            System.out.println("Dni: " + alumno.getDni());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("________________________________");
        }
    }
}

