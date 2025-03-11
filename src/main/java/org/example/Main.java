package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Auto> autos = new ArrayList<>();
    boolean true = true;

    while (true) {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Agregar Auto");
        System.out.println("2. Mostrar Detalles de un Auto");
        System.out.println("3. Actualizar Kilometraje");
        System.out.println("4. Verificar si un Auto es Antiguo");
        System.out.println("5. Verificar si necesita Mantenimiento");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese la marca: ");
                String marca = scanner.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Ingrese el año: ");
                int anio = scanner.nextInt();
                System.out.print("Ingrese el kilometraje: ");
                double kilometraje = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer
                System.out.print("Ingrese el estado: ");
                String estado = scanner.nextLine();

                autos.add(new Auto(marca, modelo, anio, kilometraje, estado));
                System.out.println("Auto agregado exitosamente.");
            }

            case 2 -> {
                if (autos.isEmpty()) {
                    System.out.println("No hay autos registrados.");
                    break;
                }
                System.out.print("Ingrese la marca del auto: ");
                String buscarMarca = scanner.nextLine();
                System.out.print("Ingrese el modelo del auto: ");
                String buscarModelo = scanner.nextLine();

                autos.stream()
                        .filter(auto -> auto.getMarca().equalsIgnoreCase(buscarMarca) &&
                                auto.getModelo().equalsIgnoreCase(buscarModelo))
                        .findFirst()
                        .ifPresentOrElse(Auto::mostrarDetalles, () -> System.out.println("Auto no encontrado."));
            }

            case 3 -> {
                if (autos.isEmpty()) {
                    System.out.println("No hay autos registrados.");
                    break;
                }
                System.out.print("Ingrese la marca del auto: ");
                String buscarMarca = scanner.nextLine();
                System.out.print("Ingrese el modelo del auto: ");
                String buscarModelo = scanner.nextLine();

                autos.stream()
                        .filter(auto -> auto.getMarca().equalsIgnoreCase(buscarMarca) &&
                                auto.getModelo().equalsIgnoreCase(buscarModelo))
                        .findFirst()
                        .ifPresentOrElse(auto -> {
                            System.out.print("Ingrese el nuevo kilometraje: ");
                            double nuevoKm = scanner.nextDouble();
                            auto.actualizarKilometraje(nuevoKm);
                        }, () -> System.out.println("Auto no encontrado."));
            }

            case 4 -> {
                if (autos.isEmpty()) {
                    System.out.println("No hay autos registrados.");
                    break;
                }
                System.out.print("Ingrese la marca del auto: ");
                String buscarMarca = scanner.nextLine();
                System.out.print("Ingrese el modelo del auto: ");
                String buscarModelo = scanner.nextLine();

                autos.stream()
                        .filter(auto -> auto.getMarca().equalsIgnoreCase(buscarMarca) &&
                                auto.getModelo().equalsIgnoreCase(buscarModelo))
                        .findFirst()
                        .ifPresentOrElse(auto ->
                                        System.out.println("¿Es antiguo? " + auto.esAntiguo()),
                                () -> System.out.println("Auto no encontrado."));
            }

            case 5 -> {
                if (autos.isEmpty()) {
                    System.out.println("No hay autos registrados.");
                    break;
                }
                System.out.print("Ingrese la marca del auto: ");
