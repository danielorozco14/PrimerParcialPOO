/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Roxana
 */
public class Administrador extends Reservaciones{
    private String usuario;
    private String password;

    public Administrador(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Administrador(String usuario, String password, String nombre, String apellido, String telefono, String dui, String tipoHab, String numeroHab, boolean paquete, String fechaIng, String fechaSal) {
        super(nombre, apellido, telefono, dui, tipoHab, numeroHab, paquete, fechaIng, fechaSal);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.usuario);
        hash = 29 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
        return true;
    }
    
    public void Login(){
     Scanner read = new Scanner(System.in);
        String usuario, pass;
        
        System.out.println("Ingrese el usuario.");
        usuario= read.nextLine();
        
        System.out.println("Ingrese el password.");
        pass = read.nextLine();
        
        if(usuario.equals("admi") && pass.equals("root"))
        {
        
        }
        else
        {
            System.out.println("Datos invalidos.");
        }
    }
    
}
