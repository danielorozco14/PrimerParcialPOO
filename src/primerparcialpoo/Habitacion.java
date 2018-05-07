/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/*
 *
 *  @author Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */

import java.util.Scanner;
import java.util.ArrayList;
        
public class Habitacion {
    
    private String TipoHabitacion;
    private ArrayList<String> Reservada = new ArrayList();
    private float PrecioHabitacion;
    private float VariacionTemporada;//Los precios varian por temporadas seria en porcentages

    public Habitacion() {
    
    }
    
    public Habitacion(String TipoHabitacion, float PrecioHabitacion, float VariacionTemporada) {
        this.TipoHabitacion = TipoHabitacion;
        this.PrecioHabitacion = PrecioHabitacion;
        this.VariacionTemporada = VariacionTemporada;
    }
    
    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public ArrayList<String> getReservada() {
        return Reservada;
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

    public void setReservada(ArrayList<String> Reservada) {
        this.Reservada = Reservada;
    }

    public void setPrecioHabitacion(float PrecioHabitacion) {
        this.PrecioHabitacion = PrecioHabitacion;
    }

    public void setVariacionTemporada(float VariacionTemporada) {
        this.VariacionTemporada = VariacionTemporada;
    }
    /*
    //Es String o boolean solo he dejado el void para que no de errores, esta vacia porque la tengo en proceso de hacer aun
    public void EstadoHabitacion(String Habitacion){
        
    }*/
    
    public void VariacionTemporada(){
        Habitacion var = new Habitacion();//INSTANCIANDO LA CLASE HABITACION
        
        System.out.println("Ingrese temporada del año en la que se encuentra la reservacion");
        Scanner Variacion = new Scanner(System.in);
        String Temporada = Variacion.nextLine();
        if ("Verano".equals(Temporada)){
            var.setVariacionTemporada(15/100);
        }
        else{
            var.setVariacionTemporada(0);
        }
    }
    
    public float VariacionParImpar(char[] NumHabitacion){//nomenclaturqa para habitaciones A1, B2 los numeros siempre iran en el 2do caracter
        Habitacion var = new Habitacion();
        Validaciones validar = new Validaciones();
        float Precio, aux;
        validar.HabitacionReservada(NumHabitacion);//nos aseguramos que exista la habitacion
        Precio = var.getPrecioHabitacion();
        for (int i = 0; i <6; i++){
            if (NumHabitacion[1] == (2*i)){//Si es doble o sea par costara un 10% mas
                aux = (10/100);
                aux = Precio * aux;
                Precio = Precio + aux;
                return Precio;
            }
        }
        return Precio;
    }
    
    public float VariacionPiso(float Precio, char[] NumHabitacion){
        if (NumHabitacion[0] == 'E' || NumHabitacion[0] == 'F'){//Si es de los ultimos pisos vale 10% mas aun
            float aux = (10/100);
            aux = (Precio * aux);
            Precio = (Precio + aux);
            return Precio;
        }
        return Precio;
    }
    
    public void AgregarReservada(char[] NumHabitacion){
        Habitacion var = new Habitacion();
        Validaciones Validar = new Validaciones();
        String Habitacion;
        ArrayList<String> Reservadas;
        Reservadas = var.getReservada();
        Habitacion = new StringBuilder().append(NumHabitacion[0]).append(NumHabitacion[1]).toString();
        if (Validar.HabitacionesReservadas(Habitacion, Reservadas)== true){
            Reservadas.add(Habitacion);
            var.setReservada(Reservadas);
        }
        else{
            Reservaciones Reservacion = new Reservaciones();
            System.out.println("Usted no puede reservar una habitacion ya reservada");
            //Reservacion.Inicio por ejemplo, aqui ira el metodo que iniciara denuevo una reservacion
        }
    }

    public float TotalNoche(char[] NumHabitacion){//Retornamos el total por noche
        Habitacion var = new Habitacion();
        var.VariacionTemporada();
        float Precio = var.VariacionParImpar(NumHabitacion);
        Precio = var.VariacionPiso(Precio, NumHabitacion);
        float PrecioFinalNoche = Precio * var.getVariacionTemporada();
        var.AgregarReservada(NumHabitacion);
        return PrecioFinalNoche;
    }
    
    public void PrecioBaseHabitacion(){//precios por noche
        Habitacion var = new Habitacion();
        float PrecioF;
        System.out.println("Ingrese un precio para su habitacion");
        Scanner Precio = new Scanner(System.in);
        PrecioF = Precio.nextFloat();
        var.setPrecioHabitacion(PrecioF);
    }
}
