package com.alvaro3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Cliente> listaCliente;
    private Scanner scanner;

    public Banco() {
        this.listaCliente = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cajero() {
        System.out.print("Ingresar el numero de tarjeta : ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresar clave de tarjeta: ");
        String clave = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, clave);
        this.listaCliente.add(cliente);

    }

    public void agregarDinero() {

    }

    public void retirarDinero() {

    }
}
