/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/*
 *
 * @author Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
//Hay que validar si la habitacion esta ocupada o no
import java.util.ArrayList;
import java.util.Scanner;
        
public class Habitacion {
    
    private String TipoHabitacion,EstadoHabitacion;
    private float PrecioHabitacion;
    private float VariacionTemporada;//Los precios varian por temporadas seria en porcentages
    private final ArrayList<Habitacion> HabitacionA;
    
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

    public float getVariacionTemporada() {
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

    public void setVariacionTemporada(float VariacionTemporada) {
        this.VariacionTemporada = VariacionTemporada;
    }
    
    public void VariacionTemporada(){
        Habitacion var = new Habitacion();//INSTANCIANDO LA CLASE HABITACION
        
        System.out.println("Ingrese temporada del año en la que se encuentra la reservacion");
        Scanner Variacion = new Scanner(System.in);
        String Temporada = Variacion.nextLine();
        if ("Verano".equals(Temporada)){
            var.setVariacionTemporada(15);
        }
        else{
            var.setVariacionTemporada(0);
        }
    }
    public void PrecioHabitacion(){//precios por noche
        float Total;
        float Variacion;
        float PrecioF;
        System.out.println("Ingrese un precio para su habitacion");
        Scanner Precio = new Scanner(System.in);
        PrecioF = Precio.nextFloat();
        VariacionTemporada();
        Variacion = getVariacionTemporada();
        Total = PrecioF + ((Variacion/100) * PrecioF);
    }
}
