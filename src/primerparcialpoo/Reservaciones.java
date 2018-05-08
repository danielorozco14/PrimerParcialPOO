/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Roxana
 */
public class Reservaciones extends Persona{
    private String tipoHab;
    private String numeroHab;
    private boolean paquete;
    private String tipoPaquete;
    private String fechaIng;
    private String fechaSal;

    public Reservaciones(){}

    public Reservaciones(String nombre, String apellido, String telefono, String dui, String tipoHab,String numeroHab, boolean paquete, String tipoPaquete, String fechaIng, String fechaSal) {
        
        super(nombre, apellido, telefono, dui);
        
        this.tipoHab = tipoHab;
        this.numeroHab = numeroHab;
        this.paquete = paquete;
        this.tipoPaquete = tipoPaquete;
        this.fechaIng = fechaIng;
        this.fechaSal = fechaSal;
        
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public String getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(String numeroHab) {
        this.numeroHab = numeroHab;
    }

    public boolean isPaquete() {
        return paquete;
    }

    public void setPaquete(boolean paquete) {
        this.paquete = paquete;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }
    
    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(String fechaSal) {
        this.fechaSal = fechaSal;
    }
    
    
    
    
    
}
