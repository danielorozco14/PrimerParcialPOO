/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opciones() {
        System.out.println("----- Menu -----");
        System.out.println("1. Agregar Huesped");
        System.out.println("2. Mostrar Huespedes");
        System.out.println("3. Encontrar Huespedes");
        System.out.println("4. Añadir persona");
        System.out.println("5. Mostrar persona");
        System.out.println("6. Salir");
    }

    public void mostrar() {
        int opcion = 7;
        Scanner leer = new Scanner(System.in);
        Huesped huesped = new Huesped();
        Persona persona = new Persona();
        while (opcion != 6) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        huesped.obtenerContacto();
                        break;
                    case 2:
                        huesped.mostrarContactos();
                        break;
                    case 3:
                        huesped.encontrarContactos();
                        break;
                    case 6:
                        System.out.println("\t\tPROGRAMA FINALIZADO");
                        break;
                    case 4:
                        persona.ObtenerDatos();
                        break;
                    case 5:
                        persona.mostrarDatos();
                        break;
                          
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número: ");
                leer.nextLine();
            }
        }
    }
}
