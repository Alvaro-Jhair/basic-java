package com.alvaro;

import java.util.*;

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
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
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
                    mostrarAlumnosRegistradosSegunRegion();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar Alumno");
        System.out.println("2. Agregar Carrera");
        System.out.println("3. Matricular Alumno en Carrera");
        System.out.println("4. Mostrar Alumnos en Carrera");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");


    }

    private void agregarAlumno() {
        System.out.print("Ingresar el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingresar dni del alumno: ");
        String dni = scanner.nextLine();

        System.out.println("Ingresar edad del alumno: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresar region del alumno: ");
        String region = scanner.nextLine();

        System.out.println("Ingresar apellido del alumno: ");
        String apellido = scanner.nextLine();

        Alumno alumno = new Alumno(nombre, edad, dni, region, apellido);
        this.listaAlumnos.add(alumno);

        System.out.println("Alumno agregado correctamente.");
        System.out.println("________________________________");
    }

    private void agregarCarrera() {
        System.out.print("Ingrese el nombre de la carrera: ");
        String nombre = scanner.nextLine();
        Carrera carrera = new Carrera(nombre);
        this.listaCarreras.add(carrera);
        System.out.println("Carrera agregada correctamente.");
        System.out.println("________________________________");
    }

    private void matricularAlumno() {

        System.out.print("Ingrese el dni: ");
        String dniAlumno = scanner.nextLine();

        Alumno alumno = buscarAlumnoporDni(dniAlumno);
        if (alumno == null) {
            System.out.println("Alumno no matriculado");
            System.out.println("________________________________");
            return;
        }

        System.out.print("Ingrese el nombre de la carrera: ");
        String nombreCarrera = scanner.nextLine();

        Carrera miCarrera = buscarCarrera(nombreCarrera);
        if (miCarrera == null) {
            System.out.println("Carrera no encontrada");
            System.out.println("________________________________");
            return;
        }

        miCarrera.matricularAlumno(alumno);
    }

    private Alumno buscarAlumnoporDni(String dniAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getDni().equals(dniAlumno))
                return alumno;
        }
        return null;
    }




    private void mostrarAlumnosRegistradosSegunRegion() {
        System.out.println("Ingrese la region de los alumno que desea buscar: ");
        String regionAlumno = scanner.nextLine();

        for(Carrera car: this.listaCarreras) {
            car.mostrarAlumnosRegistradosSegunRegion(regionAlumno);
        }
    }



    private Carrera buscarCarrera(String nombreCarrera) {
        for (Carrera carrera : this.listaCarreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                return carrera;
            }
        }
        return null;
    }

    
}