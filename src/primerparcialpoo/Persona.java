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
 * @author karic <00002517>
 */
//CLASE PERSONA
public class Persona {

    protected String Nombre;
    protected String FechaNacimiento; //ESTA WEA VA SERVIR PARA EL METODO DE FECHA. AUN NO ES NECESARIA!!
    protected String DUI;
    protected String Tarjeta;
    protected String Correo;
    protected String Telefono;
    
    //CONSTRUCTOR PERSONA

    public Persona() {
        
    }

    //GETTER AND SETTER

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    

    
    //OBTENER DATOS DE PERSONA Y GUARDARLOS
//    public void ObtenerDatos() {
//        Validaciones validar = new Validaciones();
//        Persona datosPersona = new Persona();
//        Scanner obtenerDatos = new Scanner(System.in);
//
//        System.out.println("Ingrese su nombre por favor: ");
//        datosPersona.setNombre(obtenerDatos.nextLine());
//
//        System.out.println("-----------------------------");
//
//        System.out.println("Ingrese su Fecha de Nacimiento por favor: ");
//        datosPersona.setFechaNacimiento(obtenerDatos.nextLine());
//
//        System.out.println("------------------------------");
//        System.out.println("Ingrese su documento único de identidad DUI por favor: ");
//        String dui = obtenerDatos.nextLine();
//        if (validar.ValidarDui(dui) == true) {
//            System.out.println("AGREGACION EXITOSA");
//            datosPersona.setDUI(dui);
//
//        } else {
//            do {
//                System.out.print("Ingrese su documento único de identidad DUI correctamente por favor: ");
//                dui = obtenerDatos.nextLine();
//            } while ((validar.ValidarDui(dui)) != true);
//
//            datosPersona.setDUI(dui);
//        }
//
//        Datos.add(datosPersona);
//
//    }
//
//    //METODO MOSTRAR DATOS 
//    public void mostrarDatos() {
//        System.out.println("----- Mostrando datos de persona -----");
//        for (Persona pers : Datos) {
//            System.out.println(pers.toString());
//        }
//
//    }
}

