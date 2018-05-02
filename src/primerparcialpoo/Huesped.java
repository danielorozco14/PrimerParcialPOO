/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID; //Esta madre sirve para generar codigos alfa numericos aleatorios

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Huesped { //extends Tarjeta{

    private String correo,telefono;    
    private String idHuesped;

    private ArrayList<Huesped> contactos;//ARRAY QUE CONTIENE EL TELEFONO Y EL CORREO DEL HUESPED
    private ArrayList<String> IDHuesped;//ARRAY QUE CONTIENE LOS ID DE LOS HUESPEDES GENERADOS

    public Huesped() {
        contactos = new ArrayList<>(); //Inicializando el ArrayList que contendra los contactos en el constructor
        IDHuesped = new ArrayList<>(); //Inicializando el ArrayList que contendra los ID en el constructor
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Huesped{" + "correo=" + correo + ", telefono=" + telefono + ", idHuesped=" + idHuesped  + '}';
    }

    
    public void obtenerContacto() {
        Huesped añadirDatos=new Huesped();
        Scanner infoContacto = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("\t\t----- Ingresar Datos de Contacto ----- ");

            System.out.print("Ingrese su correo electronico: ");
            añadirDatos.setCorreo(infoContacto.nextLine());
            
            System.out.print("Ingrese su numero de telefono: ");
            añadirDatos.setTelefono(infoContacto.nextLine());
           
            contactos.add(añadirDatos);
        }
        
    }

    public void generarIDHuesped() {

        for (int i = 0; i < contactos.size(); i++) {
            String iDHuesped = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
            IDHuesped.add(iDHuesped);

        }

    }

    public void mostrarContactos() {
        System.out.println("\t\t----- Mostrando Contactos -----");
        for (Huesped e : contactos) {
            System.out.println(e.toString());
        }
        System.out.println("CANTIDAD DE ID'S: "+IDHuesped.size());
    }

    public void encontrarContactos() {
        Scanner idhuesped = new Scanner(System.in);
        System.out.println("\nIngrese el ID del huesped: ");
        String ID = idhuesped.nextLine();
        int cont = 0;

        for (String huesped : IDHuesped) {
            
            if (huesped.equals(ID)) {
                System.out.println("\t\t---Huesped " + (cont) + "---");
                //System.out.println("Correo Electronico: " + contactos.get() + "\nTelefono: " + contactos.get(++i));
                break;
            }

        }
    }

}


