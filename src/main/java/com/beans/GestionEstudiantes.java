package com.beans;
import java.util.*;

public class GestionEstudiantes {
    public static void main(String[] args) {
        // Paso 1: Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario la cantidad de estudiantes a registrar
        System.out.print("¿Cuántos estudiantes desea registrar? ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Paso 3: Crear una lista para almacenar los nombres de los estudiantes
        List<String> estudiantes = new ArrayList<>();

        // Paso 4: Solicitar los nombres de los estudiantes
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            estudiantes.add(nombre);
        }

        // Paso 5: Mostrar la lista completa de estudiantes
        System.out.println("\n📋 Lista completa de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        // Paso 6: Ordenar los nombres en orden alfabético y mostrarlos
        Collections.sort(estudiantes); // Ordena la lista alfabéticamente
        System.out.println("\n📋 Lista de estudiantes ordenada alfabéticamente:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        // Paso 7: Permitir que el usuario busque si un estudiante está en la lista
        System.out.print("\n¿Desea buscar un estudiante? (si/no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nombre del estudiante que desea buscar: ");
            String nombreBuscar = scanner.nextLine();

            if (estudiantes.contains(nombreBuscar)) {
                System.out.println("✅ El estudiante '" + nombreBuscar + "' está en la lista.");
            } else {
                System.out.println("❌ El estudiante '" + nombreBuscar + "' NO está en la lista.");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}