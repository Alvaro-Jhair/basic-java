package com.alvaro2;

import java.util.Scanner;

public class Ejercicio2 {
    public  static Scanner scanner;

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:  ");
        int numero = Integer.parseInt(scanner.nextLine());

        for (int i = numero; i >= 1; i--){
            System.out.println(i);
        }
    }
}
