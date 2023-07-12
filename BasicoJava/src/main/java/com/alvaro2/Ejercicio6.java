package com.alvaro2;

import com.alvaro.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static Scanner scanner;
    public static  void main(String[] args){
        scanner = new Scanner(System.in);

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 25, "01234", "Lima", "Jimenez", "Paredes"));
        alumnos.add(new Alumno("Pedro", 52, "21234", "Chiclayo", "Gutierres" ,"Rodriguez"));
        alumnos.add(new Alumno("Manuel", 18, "31234", "Piura", "Cajan","Diaz" ));
        alumnos.add(new Alumno("Felipe", 30, "41234", "lima", "Cacho","Gonzalez" ));
        alumnos.add(new Alumno("Jesus", 18, "51234", "Trujillo", "Casas","Sanchez" ));
        alumnos.add(new Alumno("Javier", 34, "61234", "lima", "Ruiz","Ruiz" ));
        alumnos.add(new Alumno("Martin", 37, "71234", "Chiclayo", "Cajan","Silva" ));
        alumnos.add(new Alumno("Manuel", 77, "81234", "lima", "Cajan","Gomez" ));
        alumnos.add(new Alumno("Piero", 55, "91234", "Trujillo", "Paredes","Flores" ));
        alumnos.add(new Alumno("Francisco", 44, "11234", "Piura","Casas","Torres" ));

        System.out.print("Ingresar edad del Alumno a buscar:  ");
        int buscaredad = scanner.nextInt();
        for (Alumno alumno : alumnos){
            if (alumno.getEdad() == buscaredad){
                System.out.println("Nombre:  " + alumno.getNombre());
                System.out.println("Dni: " + alumno.getDni());
                System.out.println("Edad: " + alumno.getEdad());
                System.out.println("Region: " + alumno.getRegion());
                System.out.println("________________________________");
            }
        }
    }
}






