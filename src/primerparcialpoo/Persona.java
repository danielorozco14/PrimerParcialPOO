/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Roxana
 */
public class Persona {
    //arreglar esto para el merge
    private String nombre;
    private String apellido;
    private String telefono;
    private String dui;
    
    //y esto
    protected String Nombre;
    protected String FechaNacimiento; //SERVIRA PARA EL METODO DE FECHA. 
    protected String DUI;
    protected String idHuesped;
    protected String Tarjeta;
    protected String Correo;
    protected String Telefono;
    //protected ArrayList<Huesped> DatosHuesped=new ArrayList<>();
    
    //CONSTRUCTOR PERSONA

    public Persona(String nombre, String apellido, String telefono, String dui) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dui = dui;
    }
    
    //GETTER AND SETTER

    public String getIdHuesped() {
        return idHuesped;
    }

    
    public void setIdHuesped(String idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
}
