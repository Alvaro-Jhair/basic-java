package com.alvaro4;


import java.util.Scanner;

//Objetivo: crear un cajero.
// Requerimientos:
// 1. Programa escrito para consola (sin interfaz gráfica).
// 2. El usuario puede realizar retiros y depósitos.
// 3. El usuario empieza con un saldo de 1000 soles.
// 4. El usuario para ingresar al cajero debe ingresar su clave PIN 5555.
// 5. EL usuario tiene 3 intentos para para ingresar la clave correcta sino el programa debe terminar con algún mensaje.
// 6. Luego de ingresar la clave correcta el usuario puede hacer tantos depósitos o retiros que el saldo le permita sin terminar el programa.
public class Banco2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        int intentos = 3;

        System.out.println("Bienvendo al Cajero Causa");
        while (intentos > 0){
            System.out.print("Ingrese PIN: ");
            int pin = scanner.nextInt();

            if (pin == 555){
                System.out.println("Clave correcta");
                while(true){
                    System.out.println("su saldo es " + saldo + " soles");
                    System.out.println("1. Realizar deposito");
                    System.out.println("2. Realizar retiro");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opcion: ");
                    int opcion = scanner.nextInt();

                    if(opcion == 1){
                        System.out.print("Ingresar la cantidad a despositar: ");
                        int deposito = scanner.nextInt();
                        saldo += deposito;
                        System.out.println("Deposito exitoso - (Saldo " + saldo + " soles )");
                    } else if (opcion == 2) {
                        System.out.print("ingresar dinero a retirar: ");
                        int retiro = scanner.nextInt();
                        if (retiro <= saldo){
                            saldo -= retiro;
                            System.out.println("Retiro exitoso - (Saldo " + saldo + " soles )");
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    }
                    else if(opcion == 3) {
                        System.out.println("Gracias");
                        break;
                    }else {
                        System.out.println("Opcion invalida");
                    }
                }break;
            }
                else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Clave incorecta ( " + intentos + " intentos restantes )");
                } else {
                    System.out.println("Te quedaste sin intentos");
                }
            }
        }
    }
}































