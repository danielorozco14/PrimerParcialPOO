/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.Scanner;

/**
 *
 * @author karic <00002517>
 */
//CLASE PERSONA
public class Persona {

    protected String Nombre;
    protected String FechaNacimiento;
    protected String DUI;

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

    public void ObtenerDatos() {
        Validaciones validar = new Validaciones();

        Persona reservar = new Persona();
        Scanner obtenerDatos = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor: ");
        reservar.setNombre(obtenerDatos.nextLine());

        System.out.println("-----------------------------");

        System.out.println("Ingrese su Fecha de Nacimiento por favor: ");
        reservar.setFechaNacimiento(obtenerDatos.nextLine());

        System.out.println("------------------------------");
        System.out.println("Ingrese su documento único de identidad DUI por favor: ");
        String dUI = obtenerDatos.nextLine();
        char[] DUIS = dUI.toCharArray();
        if (validar.ValidarDui(DUIS) == true) {
            System.out.println("AGREGACION EXITOSA");
        } else {
            do {
                System.out.println("Ingrese su documento único de identidad DUI por favor: ");
                dUI = obtenerDatos.nextLine();
            } while (validar.ValidarDui(DUIS) != true);
            DUIS = dUI.toCharArray();
        }
    }

}
