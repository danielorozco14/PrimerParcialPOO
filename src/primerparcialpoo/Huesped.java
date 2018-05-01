/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Huesped { //extends Tarjeta{

    public String contacto;
    private int idHuesped;

    private ArrayList<String> contactos;
    private ArrayList<Integer> IDHuesped;

    public Huesped() {
        contactos = new ArrayList<>(); //Inicializando el ArrayList que contendra los contactos en el constructor
        IDHuesped = new ArrayList<>(); //Inicializando el ArrayList que contendra los ID en el constructor
    }

    public String obtenerContacto() {

        Scanner infoContacto = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("\t\t----- Ingresar Datos de Contacto ----- ");

            System.out.print("Ingrese su correo electronico: ");
            contacto = infoContacto.nextLine();
            contactos.add(contacto);

            System.out.print("Ingrese su numero de telefono: ");
            contacto = infoContacto.nextLine();
            contactos.add(contacto);
        }
        String a = "hola";

        return a;

    }

    public void mostrarContactos() {
        System.out.println();
        int cont = 1;
        int size = contactos.size();
        for (int i = 0; i < size; i++) {
            System.out.println("\t\t---Huesped " + (cont) + "---");
            System.out.println("Correo Electronico: " + contactos.get(i) + "\nTelefono: " + contactos.get(++i));
            cont++;
            //System.out.println("Telefono: "+contactos.get(i+1));
        }
    }

    public static String crearUUID() {

        return java.util.UUID.randomUUID().toString();
    }
}
