/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
//Hay que validar si la habitacion esta ocupada o no
import java.util.ArrayList;
        
public class Habitacion {
    
    private String TipoHabitacion,EstadoHabitacion;
    private float PrecioHabitacion;
    private int VariacionTemporada;//Los precios varian por temporadas seria en porcentages
    private ArrayList<Habitacion> HabitacionA;
    
    public Habitacion(){
        HabitacionA = new ArrayList<>();
    }
    
    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public String getEstadoHabitacion() {
        return EstadoHabitacion;
    }

    public float getPrecioHabitacion() {
        return PrecioHabitacion;
    }

    public int getVariacionTemporada() {
        return VariacionTemporada;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public void setEstadoHabitacion(String EstadoHabitacion) {
        this.EstadoHabitacion = EstadoHabitacion;
    }

    public void setPrecioHabitacion(float PrecioHabitacion) {
        this.PrecioHabitacion = PrecioHabitacion;
    }

    public void setVariacionTemporada(int VariacionTemporada) {
        this.VariacionTemporada = VariacionTemporada;
    }
    
}
