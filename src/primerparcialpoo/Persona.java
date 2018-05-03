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
    //ATRIBUTOS
    protected String Nombre;
    protected String FechaNacimiento; //ESTA WEA VA SERVIR PARA EL METODO DE FECHA 
    protected String DUI;
    protected ArrayList<Persona> Datos;
    
    //CONSTRUCTOR PERSONA
    public Persona() {
        Datos = new ArrayList<>(); //INCIALIZAMOS LA LISTA DATOS

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

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", DUI=" + DUI + '}';
    }
    //OBTENER DATOS DE PERSONA Y GUARDARLOS
    public void ObtenerDatos() {
        Validaciones validar = new Validaciones();
        Persona datosPersona = new Persona();
        Scanner obtenerDatos = new Scanner(System.in);

        System.out.println("Ingrese su nombre por favor: ");
        datosPersona.setNombre(obtenerDatos.nextLine());

        System.out.println("-----------------------------");

        System.out.println("Ingrese su Fecha de Nacimiento por favor: ");
        String fechaNacimiento = obtenerDatos.nextLine();
        if (validar.ValidarDui(fechaNacimiento) == true) {
            System.out.println("AGREGACION EXITOSA");
            datosPersona.setDUI(fechaNacimiento);

        } else {
            do {
                System.out.print("Ingrese su fecha de nacimiento correctamente por favor: ");
                fechaNacimiento = obtenerDatos.nextLine();
            } while ((validar.ValidarFecha(fechaNacimiento)) != true);

            datosPersona.setFechaNacimiento(fechaNacimiento);
        }
        
        
        
        System.out.println("------------------------------");
        System.out.println("Ingrese su documento único de identidad DUI por favor: ");
        String dui = obtenerDatos.nextLine();
        if (validar.ValidarDui(dui) == true) {
            System.out.println("AGREGACION EXITOSA");
            datosPersona.setDUI(dui);

        } else {
            do {
                System.out.print("Ingrese su documento único de identidad DUI correctamente por favor: ");
                dui = obtenerDatos.nextLine();
            } while ((validar.ValidarDui(dui)) != true);

            datosPersona.setDUI(dui);
        }

        Datos.add(datosPersona);

    }

    //MOSTRAR DATOS 
    public void mostrarDatos() {
        System.out.println("----- Mostrando datos de persona -----");
        for (Persona pers : Datos) {
            System.out.println(pers.toString());
        }

    }
}

