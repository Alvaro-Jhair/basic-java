package com.alvaro4;

import com.alvaro2.Main;

import java.util.Scanner;

public class Cronograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double interesmensual = 0.025;

        System.out.print("Ingresar Monto de prestamo: ");
        int monto = scanner.nextInt();

        System.out.print("Ingresar numero de cuotas: ");
        int cuotas = scanner.nextInt();
        double cuotamensual = (monto * interesmensual * Math.pow(1 + interesmensual, cuotas)) / (Math.pow(1 + interesmensual, cuotas) - 1);

        int i = 0;
        while (i < cuotas) {
            double interes = interesmensual * monto;
            double amortizacion = cuotamensual - interes;
            double saldofinal = monto - amortizacion;

            System.out.println("Cuota: " + (i + 1) + " Saldo final: " + (int) saldofinal + " Interes: " + (int) interes + " cuota mensual: " + (int) cuotamensual);
            monto = (int) saldofinal;
            i++;

        }
    }
}














