package com.alvaro2;

import java.util.Scanner;

public class Ejercicio4 {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:  ");
        int numero = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(numero + " no es primo ");
            }return;

        }
    }
}