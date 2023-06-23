package com.alvaro;

import jdk.dynalink.beans.StaticClass;

import java.util.*;

public class universidad {
class Alumno {
    private String nombre;
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
  }
  class Carrera {
    private String nombre;
    private List<Alumno> alumnos;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }
    public void matricularAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public void mostrarAlumnosRegistrados(){
        System.out.println("Alumnos registrados en la carrera"+ nombre + ":");
        for(Alumno alumno : alumnos){
            System.out.println(alumno.getNombre());
        }
    }
  }
  public class Main{
    private static Map<String, Carrera> carreras = new HashMap<>();
    private static List<Alumno> alumnos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextByte();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarAlumno();
                    break;
                case 2:
                    agregarCarrera();
                    break;
                case 3:
                    matricularAlumno();
                    break;
                case 4:
                    mostrarAlumnosEnCarrera();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
                    break;
            }
        }while (opcion != 5);
    }
  }

  private static void mostrarMenu(){
      System.out.println("\n--- Menú ---");
      System.out.println("1. Agregar Alumno");
      System.out.println("2. Agregar Carrera");
      System.out.println("3. Matricular Alumno en Carrera");
      System.out.println("4. Mostrar Alumnos en Carrera");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
  }

  private static void agregarAlumno(){
   System.out.print("Ingresar el nombre del alumno: ");
   String nombre =scanner.nextLine();
   Alumno alumno = new Alumno(nombre);
   alumnos.add(alumno);
   System.out.println("Alumno agregado correctamente.");
  }

  private static void agregarCarrera(){
    System.out.print("Ingrese el nombre d ela carrera: ");
    String nombre = scanner.nextLine();
    Carrera carrera = new Carrera(nombre);
    carreras.put(nombre, carerra);
    System.out.println("Carrera agregada correctamente. ");
  }

private static void matricularAlumno(){
    System.out.print("Ingrese el nombre del alumno: ");
    String nombreAlumno = scanner.nextLine();

    Carrera carrera = carreras.get(nombreCarrera);
    if(carrera != null){
        Alumno alumno = buscarAlumno(nombreAlumno);
        if (alumno != null){
            carrera.matricularAlumno(alumno);
            System.out.println("Alumno matriculado en la carrera correctamente.");
        }else {
            System.out.println("El alumno no existe. Por favor, agreguelo antes de matricularlo.");
        }else {
            System.out.println("La carrera no existe. Por favor, agreguela antes de matricular alumnos");
        }
    }
}

private static void mostrarAlumnosEnCarrera(){
    System.out.print("Ingrese el nombre de la carrera: ");
    String nombreCarrera = scanner.nextLine();

    Carrera carrera = carrera.get(nombreCarrera);
    if (carrera != null){
        carrera.mostrarAlumnosRegistrados();
    }else {
        System.out.println("La carrera no existe. Por favor, agreguela antes de mostrar los alumnos");
    }
}
 private static Alumno  buscarAlumno(String nombreAlumno){
    for (Alumno alumno ; alumnos){
        if (alumno.getNombre().equals(nombreAlumno)) {
            return alumno;
        }
    }
    return null;
 }

























}

