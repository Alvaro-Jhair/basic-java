package com.alvaro3;

public class Cliente {
    private String nombre;
    private String tarjeta;
    private String clave;

    public Cliente(String nombre, String tarjeta, String clave) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public String getClave() {
        return clave;
    }
}
