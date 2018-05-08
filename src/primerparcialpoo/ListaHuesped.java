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
public class ListaHuesped {

    private static ListaHuesped listaHuesped;
    private ArrayList <Huesped> datosHuesped = null;

    public static ListaHuesped getInstance() {
        if (listaHuesped == null) {
            listaHuesped = new ListaHuesped();
        }

        return listaHuesped;
    }

    private ListaHuesped() {
        datosHuesped = new ArrayList<>();
    }
    // retrieve array from anywhere

    public ArrayList<Huesped> getArray() {
        return this.datosHuesped;
    }
    //Add element to array

    public void addToArray(Huesped value) {
        datosHuesped.add(value);
    }
    
    public void mostrarDatos(){
        for (Huesped host : datosHuesped) {
            System.out.println(host.toString());
        }
    }
    
    public void encontrarDatos(){
        
        Scanner buscar = new Scanner(System.in);
        ListaHuesped.getInstance().getArray(); 
        
        System.out.println("Ingrese el ID del huesped a buscar: ");
        String id = buscar.nextLine();

        int cont = 0, cont1 = 0;

         for (Huesped huesped : datosHuesped) {
            if (huesped.getIdHuesped().equals(id) && cont == 0) {
                System.out.println("Este huesped existe: " + "Nombre= " + huesped.getNombre() + " ; ID Huesped=" + huesped.getIdHuesped() +  " ; DUI= " + huesped.getDUI() + " ; Tarjeta de Cred.= " + huesped.getTarjeta() + " ; Correo= " + huesped.getCorreo() + " ; Telefono= " + huesped.getTelefono());
            } else if (huesped.getIdHuesped().equals(id) && cont != 0) {
                System.out.println("Este huesped existe: " + "Nombre= " + huesped.getNombre() + " ; ID Huesped=" + huesped.getIdHuesped() + " ; DUI= " + huesped.getDUI() + " ; Tarjeta de Cred.= " + huesped.getTarjeta() + " ; Correo= " + huesped.getCorreo() + " ; Telefono= " + huesped.getTelefono());
            } else if (huesped.getIdHuesped().equals(id) == false) {
                cont1++;
                if (datosHuesped.size() == cont1) {
                    System.out.println("No existe este ID en el registro o el huesped aun  no ha sido registrado");
                }
            }
            cont++;
        }
    }
}
