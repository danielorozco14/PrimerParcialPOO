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
        System.out.println("3. Salir");
    }

    public void mostrar() {
        int opcion = 4;
        Scanner leer = new Scanner(System.in);
        Huesped huesped = new Huesped();

        while (opcion != 3) {
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
                        System.out.println("Adios :(");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }
}
