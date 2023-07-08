package com.alvaro2;

import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1:  ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese numero 2:  ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        for (int i = numero1; i <= numero2 * 2; i += numero1) {
            System.out.println(i);
        }
    }
}
