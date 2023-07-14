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


    public void matricularAlumno(Alumno al) {
        this.alumnos.add(al);

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(al.getNombre())) {
                System.out.println("Alumno ya esta matriculado correctamente en la carrera de " + getNombre());
            } else {
                System.out.println("El alumno ya esta matriculado en la carrera de " + getNombre());
                return;
            }
        }
    }


    public void mostrarAlumnosRegistradosSegunRegion(String region) {
        System.out.println("Carrera : " + nombre);
        for (Alumno alumno : this.alumnos) {
            if (alumno.getRegion().equals(region)) {
                System.out.println("Nombre:  " + alumno.getNombre());
                System.out.println("Apellido Paterno: " + alumno.getApellidopaterno());
                System.out.println("Apellido Materno: " + alumno.getApellidomaterno());
                System.out.println("Dni: " + alumno.getDni());
                System.out.println("Edad: " + alumno.getEdad());
                System.out.println("Region: " + alumno.getRegion());
                System.out.println("________________________________");


            }
        }
    }

    public boolean existeMatricula(String dni) {

        for (Alumno a : this.alumnos) {
            if (a.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }


}

