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

    private String correo, telefono, idHuesped;

    private ArrayList<Huesped> contactos;//ARRAY QUE CONTIENE EL TELEFONO Y EL CORREO DEL HUESPED

    public Huesped() {
        contactos = new ArrayList<>(); //Inicializando el ArrayList que contendra los contactos en el constructor
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

    public String getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(String idHuesped) {
        this.idHuesped = idHuesped;
    }

    @Override
    public String toString() {
        return "Huesped{" + "correo=" + correo + ", telefono=" + telefono + ", idHuesped=" + idHuesped + '}';
    }

    public void obtenerContacto() {
        Huesped añadirDatos = new Huesped();
        Validaciones Validar = new Validaciones();
        Scanner infoContacto = new Scanner(System.in);

        System.out.println("\t\t----- Ingresar Datos de Contacto ----- ");

        System.out.print("Ingrese su correo electronico: ");
        String Correo = infoContacto.nextLine();

        if (Validar.ValidarCorreo(Correo) == true) {
            añadirDatos.setCorreo(Correo);
        } 
        else {
            do 
            {
                System.out.print("Ingrese su correo electronico: ");
                Correo = infoContacto.nextLine();
            } while (Validar.ValidarCorreo(Correo)!=true);
            
            añadirDatos.setCorreo(Correo);

        }
        System.out.print("Ingrese su numero de telefono: ");
        String Telefono= infoContacto.nextLine();
        
        if(Validar.ValidarTelefono(Telefono)== true){
            añadirDatos.setTelefono(Telefono);
        }
        else{
            do{
                System.out.print("Ingrese su numero de telefono: ");
                Telefono= infoContacto.nextLine();
            }while(Validar.ValidarTelefono(Telefono)!=true);
            añadirDatos.setTelefono(Telefono);
        }

        añadirDatos.setIdHuesped(UUID.randomUUID().toString().toUpperCase().substring(0, 6));

        contactos.add(añadirDatos);
    }

    public void mostrarContactos() {
        System.out.println("\t\t----- Mostrando Contactos -----");
        for (Huesped Contactos : contactos) {
            System.out.println(Contactos.toString());
        }

    }

    public void encontrarContactos() {
        Huesped Search = new Huesped();
        Scanner buscar = new Scanner(System.in);

        System.out.println("Ingrese el ID del huesped a buscar: ");
        String id = buscar.nextLine();

        int cont = 0, cont1 = 0;

        for (Huesped huesped : contactos) {
            Scanner cambiar = new Scanner(System.in);
            if (huesped.getIdHuesped().equals(id) && cont == 0) {

                System.out.println("Este huesped existe: " + "Correo: " + huesped.getCorreo() + " " + "Telefono: " + huesped.getTelefono());

            } else if (huesped.getIdHuesped().equals(id) && cont != 0) {
                System.out.println("Este huesped existe: " + "Correo: " + huesped.getCorreo() + " " + "Telefono: " + huesped.getTelefono());

            } else if (huesped.getIdHuesped().equals(id) == false) {
                cont1++;
                if (contactos.size() == cont1) {
                    System.out.println("No existe este ID en el registro o el huesped aun  no ha sido registrado");
                }
            }
            cont++;
        }
    }

}
