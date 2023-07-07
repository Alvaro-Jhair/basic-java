package com.alvaro;

public class Alumno {
    private String nombre;
    private int edad;

    private String dni;

    private String region;

    public Alumno(String nombre, int edad, String dni, String region) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.region = region;
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {

        return dni;
    }

    public String getRegion(){
        return region;
    }
}




















