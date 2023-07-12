package com.alvaro2;

import java.util.Scanner;

public class Ejercicio5 {
    public static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);

        System.out.print("Ingrese numero:  ");
        int n = Integer.parseInt(scanner.nextLine());

        int n1 = 0;
        int n2 = 1;


        for (int i = 1; i <= n; i++){

            int n3 = n1 + n2;
            n1 = n2 ;
            n2 = n3;

        }

    }
}
