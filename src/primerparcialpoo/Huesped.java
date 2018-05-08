/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */

public class Huesped extends Persona {

    public String contacto;
    private String idHuesped;
    
    protected String fechaRegistro;

    private ArrayList<String> contactos;
    private ArrayList<String> IDHuesped;

    public Huesped() {
        super();//CON SUPER SE INICIALIZA LA CLASE PADRE Y YA SE PUEDE ACCEDER A TODOS LOS ATRIBUTOS O METODOS
        contactos = new ArrayList<>(); //Inicializando el ArrayList que contendra los contactos en el constructor
        IDHuesped = new ArrayList<>(); //Inicializando el ArrayList que contendra los ID en el constructor
        //DatosHuesped = new ArrayList<>();
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

    public void generarIDHuesped() {  
        for(int i=0;i<contactos.size();i+=2){
            String iDHuesped = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
            IDHuesped.add(iDHuesped);
        }
    }
        
    public void ObtenerDatosHuesped() {

        Validaciones Validar = new Validaciones();
        Huesped addDatos = new Huesped();
        Scanner infoHuesped = new Scanner(System.in);

        System.out.println("\t\t----- Ingresar Datos de Huesped ----- ");

        System.out.print("INGRESE SU NOMBRE: ");
        String nombre = infoHuesped.nextLine();
        //addDatos.setNombre(nombre);
        if (Validar.ValidarNombre(nombre) == true) {
            addDatos.setNombre(nombre);
        } else {
            do {
                System.out.print("Ingrese su nombre correctamente: ");
                nombre = infoHuesped.nextLine();
            } while (Validar.ValidarNombre(nombre) != true);

            addDatos.setNombre(nombre);

        }
        System.out.print("INGRESE SU FECHA DE NACIMIENTO: ");
        String fechaNac = infoHuesped.nextLine();
        //addDatos.setFechaNacimiento(fechaNac);
        if (Validar.ValidarFecha(fechaNac) == true) {
            addDatos.setFechaNacimiento(fechaNac);
        } else {
            do {
                System.out.print("Ingrese su fecha de nacimiento correctamente: ");
                fechaNac = infoHuesped.nextLine();
            } while (Validar.ValidarFecha(fechaNac) != true);

            addDatos.setFechaNacimiento(fechaNac);

        }

        System.out.print("INGRESE SU DUI: ");
        String Dui = infoHuesped.nextLine();
        //addDatos.setDUI(Dui);
        if (Validar.ValidarDui(Dui) == true) {
            addDatos.setDUI(Dui);
        } else {
            do {
                System.out.print("Ingrese su DUI correctamente: ");
                Dui = infoHuesped.nextLine();
            } while (Validar.ValidarDui(Dui) != true);

            addDatos.setDUI(Dui);

        }

        System.out.print("INGRESE SU TARJETA DE CREDITO: ");
        String Tarjeta = infoHuesped.nextLine();
        addDatos.setTarjeta(Tarjeta);
//        if (Validar.ValidarTarjeta(Tarjeta) == true) {
//            addDatos.setTarjeta(Tarjeta);
//        } else {
//            do {
//                System.out.print("Ingrese su tarjeta de credito correctamente: ");
//                Tarjeta = infoHuesped.nextLine();
//            } while (Validar.ValidarTarjeta(Tarjeta) != true);
//
//            addDatos.setTarjeta(Tarjeta);
//
//        }

        System.out.print("INGRESE SU TELEFONO: ");
        String Telefono = infoHuesped.nextLine();
        //addDatos.setTelefono(Telefono);
        if (Validar.ValidarTelefono(Telefono) == true) {
            addDatos.setTelefono(Telefono);
        } else {
            do {
                System.out.print("Ingrese su telefono correctamente: ");
                Telefono = infoHuesped.nextLine();
            } while (Validar.ValidarTelefono(Telefono) != true);

            addDatos.setTelefono(Telefono);

        }

        System.out.print("INGRESE SU CORREO ELECTRONICO: ");
        String Correo = infoHuesped.nextLine();
        //addDatos.setCorreo(Correo);
        if (Validar.ValidarCorreo(Correo) == true) {
            addDatos.setCorreo(Correo);
        } else {
            do {
                System.out.print("Ingrese su correo electronico correctamente: ");
                Correo = infoHuesped.nextLine();
            } while (Validar.ValidarCorreo(Correo) != true);

            addDatos.setCorreo(Correo);

        }
        addDatos.setIdHuesped(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        addDatos.setFechaRegistro(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));//SE AGREGA LA FECHA DEL REGISTRO DEL HUESPED
        
        ListaHuesped.getInstance().addToArray(addDatos);// SE AGREGAN TODOS LOS VALORES A LA CLASE LISTA HUESPED.


    }

    public void mostrarContactos() {
        System.out.println("\t\t----- Mostrando Contactos -----");
        ListaHuesped.getInstance().mostrarDatos();
    }

    public void encontrarContactos() {
        //Huesped Search = new Huesped();
        System.out.println("\t\t----- ENCONTRANDO DATOS -----");
        ListaHuesped.getInstance().encontrarDatos();
    }  
}
