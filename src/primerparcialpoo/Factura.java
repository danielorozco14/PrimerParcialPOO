/*
Clase Factura contendra el total monetario de de los servicios adquiridos por el huesped.

 */
package primerparcialpoo;

import java.text.SimpleDateFormat;
import java.util.Date; //NOS SERVIRA PARA EL MANEJO DE FECHAS.
import java.util.UUID; //ESTA IMPORTACION NOS AYUDARA PARA GENERAR DE MANERA RANDOM EL ID DE FACTURA,
//YA QUE GENERA CODIGOS ALFANUMERICOS.

/**
 * @author karicha <00002517@uca.edu.sv>
 */
//CLASE FACTURA
public class Factura extends Huesped {

    //ATRIBUTOS
    protected Reservaciones reservacion;
    protected String idFactura;
    protected double TotalAPagar;
    protected boolean TienePaquete;

  
    //CONSTRUCTOR DE FACTURA
    public Factura() {
        super();
        this.reservacion = reservacion;
    }

    //GETTER AND SETTER
    public void setIdFactura(String idFactura){
       this.idFactura = idFactura;
    }
    
    
    public String getIdFactura() {
        return idFactura;
    }

    public double getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(double TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
    public boolean isTienePaquete() {
        return TienePaquete;
    }

    public void setTienePaquete(boolean TienePaquete) {
        this.TienePaquete = TienePaquete;
    }
    
    
    //PREGUNTANDO SI EL HUESPED HA ADQUIRIDO ALGUN PAQUETE Y SI ES ASI SUMARSELO A FACTURA
    public void TienePaquete (){
        
        
    } 
    
    
    //SACANDO TOTAL 
    public double TotalPagar() {
        //SUMANDO LOS SERVICIOS PARA SACAR UN TOTAL A PAGAR POR CUENTA DEL HUESPED
        return this.TotalAPagar += this.reservacion.getPrecioHabitacion()+this.reservacion.getVariacionTemporada();

    }
    
    public void GenerandoFactura(){
        Reservaciones reservacion = new Reservaciones();
        Habitacion habitacion = new Habitacion();
        Factura factura =new Factura();
        
        super.encontrarContactos();        
        
        System.out.println("\t\t***** FACTURA ***" +"\n\t\t ID Factura: "+UUID.randomUUID().toString().toUpperCase().substring(0, 6)+ "\n\t\tFecha: "+new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        System.out.println("\tCliente: "+super.getNombre());
        System.out.println("\tID Huesped: "+super.getIdHuesped());
        //System.out.println("\tHabitacion: "+Arrays.toString(reservacion.getNumeroHabitacion()));
        System.out.println("\tTOTAL A PAGAR: "+ TotalPagar());
        
        
    }
    
    

}