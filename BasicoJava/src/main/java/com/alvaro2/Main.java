package com.alvaro2;

import com.alvaro.Universidad;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Ingrese numero:  ");
        int numero = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}
