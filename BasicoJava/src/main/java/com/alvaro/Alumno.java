package com.alvaro;

public class Alumno {
    private String nombre;
    private int edad;

    private String dni;

    private String region;

    private String apellidopaterno;

    private String apellidomaterno;

    public Alumno(String nombre, int edad, String dni, String region, String apellidopaterno, String apellidomaterno) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.region = region;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
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

    public String getApellidopaterno(){
        return apellidopaterno;
    }

    public String getApellidomaterno(){
        return apellidomaterno;
    }
}




















