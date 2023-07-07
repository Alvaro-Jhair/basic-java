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

        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(al.getDni())) {
                System.out.println("Alumno ya está registrado ");
                return; //para salir y no continuar con el resto del CÓDIGO
            }
        }
        this.alumnos.add(al);
    }


    public void mostrarAlumnosRegistradosSegunRegion(String region) {
        System.out.println("Carrera : " + nombre);
        for (Alumno alumno : this.alumnos) {
            if (alumno.getRegion().equals(region)) {
                System.out.println("Nombre:  " + alumno.getNombre());
                System.out.println("Dni: " + alumno.getDni());
                System.out.println("Edad: " + alumno.getEdad());
                System.out.println("Region: " + alumno.getRegion());
                System.out.println("________________________________");

            }
        }
    }

    boolean estaMatriculado(String Alumno){
        for (){

        }
    }
}

