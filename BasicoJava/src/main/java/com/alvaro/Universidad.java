package com.alvaro;

import java.util.*;
import com.alvaro.Alumno;
import com.alvaro.Carrera;
public class Universidad {

    private List<Alumno> listaAlumnos;
    private List<Carrera> listaCarreras;

    private Scanner scanner;

    public Universidad() {
        this.listaAlumnos = new ArrayList<>();
        this.listaCarreras = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void correr() {
        // mostrar las opciones
        // ejecutar la opción elegida por el usuario
    }

    private void agregarAlumno() {
        System.out.print("Ingresar el nombre del alumno: ");
        String nombre = scanner.nextLine();
        Alumno alumno = new Alumno(nombre);
        this.listaAlumnos.add(alumno);
        System.out.println("Alumno agregado correctamente.");
    }




}



//    public static void main(String[] args) {
//        Map<String, Carrera> carreras = new HashMap<>();
//        List<Alumno> alumnos = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        int opcion;
//        do {
//            mostrarMenu();
//            opcion = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (opcion) {
//                case 1:
//                    agregarAlumno(alumnos, scanner);
//                    break;
//                case 2:
//                    agregarCarrera(carreras, scanner);
//                    break;
//                case 3:
//                    matricularAlumno(carreras, alumnos, scanner);
//                    break;
//                case 4:
//                    mostrarAlumnosEnCarrera(carreras, scanner);
//                    break;
//                case 5:
//                    System.out.println("¡Hasta luego!");
//                    break;
//                default:
//                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
//                    break;
//            }
//        } while (opcion != 5);
//
//        scanner.close();
//    }
//
//    private static void mostrarMenu() {
//        System.out.println("\n--- Menú ---");
//        System.out.println("1. Agregar Alumno");
//        System.out.println("2. Agregar Carrera");
//        System.out.println("3. Matricular Alumno en Carrera");
//        System.out.println("4. Mostrar Alumnos en Carrera");
//        System.out.println("5. Salir");
//        System.out.print("Elige una opción: ");
//    }
//
//    private static void agregarAlumno(List<Alumno> alumnos, Scanner scanner) {
//        System.out.print("Ingresar el nombre del alumno: ");
//        String nombre = scanner.nextLine();
//        Alumno alumno = new Alumno(nombre);
//        alumnos.add(alumno);
//        System.out.println("Alumno agregado correctamente.");
//    }
//
//    private static void agregarCarrera(Map<String, Carrera> carreras, Scanner scanner) {
//        System.out.print("Ingrese el nombre de la carrera: ");
//        String nombre = scanner.nextLine();
//        Carrera carrera = new Carrera(nombre);
//        carreras.put(nombre, carrera);
//        System.out.println("Carrera agregada correctamente.");
//    }
//
//    private static void matricularAlumno(Map<String, Carrera> carreras, List<Alumno> alumnos, Scanner scanner) {
//        System.out.print("Ingrese el nombre del alumno: ");
//        String nombreAlumno = scanner.nextLine();
//        System.out.print("Ingrese el nombre de la carrera: ");
//        String nombreCarrera = scanner.nextLine();
//
//        Carrera carrera = carreras.get(nombreCarrera);
//        if (carrera != null) {
//            Alumno alumno = buscarAlumno(alumnos, nombreAlumno);
//            if (alumno != null) {
//                carrera.matricularAlumno(alumno);
//                System.out.println("Alumno matriculado en la carrera correctamente.");
//            } else {
//                System.out.println("El alumno no existe. Por favor, agréguelo antes de matricularlo.");
//            }
//        } else {
//            System.out.println("La carrera no existe. Por favor, agréguela antes de matricular alumnos.");
//        }
//    }
//
//    private static void mostrarAlumnosEnCarrera(Map<String, Carrera> carreras, Scanner scanner) {
//        System.out.print("Ingrese el nombre de la carrera: ");
//        String nombreCarrera = scanner.nextLine();
//
//        Carrera carrera = carreras.get(nombreCarrera);
//        if (carrera != null) {
//            carrera.mostrarAlumnosRegistrados();
//        } else {
//            System.out.println("La carrera no existe. Por favor, agréguela antes de mostrar los alumnos.");
//        }
//    }
//
//    private static Alumno buscarAlumno(List<Alumno> alumnos, String nombreAlumno) {
//        for (Alumno alumno : alumnos) {
//            if (alumno.getNombre().equals(nombreAlumno)) {
//                return alumno;
//            }
//        }
//        return null;
//    }