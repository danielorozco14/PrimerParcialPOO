/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author karicha <00002517>
 */

//CLASE RESERVACIONES
public class Reservaciones {
    private float PrecioHabitacion;
    private String Paquete;
    private String TipoHabitacion;
    private String ServiciosIndividuales;
    private char[] NumeroHabitacion = new char[2];
    
    
    //CONSTRUCTOR RESERVACIONES
    
    
    public Reservaciones (){
    }

    public Reservaciones(float PrecioHabitacion, String Paquete, String TipoHabitacion, String ServiciosHabitacion, char[] NumeroHabitacion) {
        this.PrecioHabitacion = PrecioHabitacion;
        this.Paquete = Paquete;
        this.TipoHabitacion = TipoHabitacion;
        this.ServiciosIndividuales = ServiciosHabitacion;
        this.NumeroHabitacion = NumeroHabitacion;
    }
    
    //GETTER AND SETTER
    public float getPrecioHabitacion() {
        return PrecioHabitacion;
    }

    public void setPrecioHabitacion(float PrecioHabitacion) {
        this.PrecioHabitacion = PrecioHabitacion;
    }

    public String getPaquete() {
        return Paquete;
    }

    public void setPaquete(String Paquete) {
        this.Paquete = Paquete;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public String getServiciosIndividuales() {
        return ServiciosIndividuales;
    }

    public void setServiciosIndividuales(String ServiciosIndividuales) {
        this.ServiciosIndividuales = ServiciosIndividuales;
    }

    public char[] getNumeroHabitacion() {
        return NumeroHabitacion;
    }

    public void setNumeroHabitacion(char[] NumeroHabitacion) {
        this.NumeroHabitacion = NumeroHabitacion;
    }
    
}
