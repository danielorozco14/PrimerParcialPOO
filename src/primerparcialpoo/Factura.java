/*
Clase Factura contendra el total monetario de de los servicios adquiridos por el huesped.

 */
package primerparcialpoo;


import java.util.Objects;
import java.util.UUID; //ESTA IMPORTACION NOS AYUDARA PARA GENERAR DE MANERA RANDOM EL ID DE FACTURA,
//YA QUE GENERA CODIGOS ALFANUMERICOS.

/**
 * @author karicha <00002517@uca.edu.sv>
 */

//CLASE FACTURA
public class Factura {

    //ATRIBUTOS
    private  Habitacion servicios;
    private  String idFactura;
    private double TotalAPagar;

    //CONSTRUCTOR DE FACTURA
    
    public Factura() {
        
    }

    public Factura(Habitacion servicios) {
        //GENERANDO DE FORMA RANDOM EL ID DE FACTURA
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
        this.servicios = servicios;
    }

    //GETTER AND SETTER
    public String getIdFactura() {
        return idFactura;
    }

    public double getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(double TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }

    //SACANDO TOTAL 
    public void TotalPagar() {
        //SUMANDO LOS SERVICIOS PARA SACAR UN TOTAL A PAGAR POR CUENTA DEL HUESPED
        this.TotalAPagar += this.servicios.getPrecioHabitacion()+this.servicios.getVariacionTemporada();

    }
    
    /*
    Este método viene a complementar al método equals 
    y sirve para comparar objetos de una forma más rápida 
    en estructuras Hash ya que únicamente nos devuelve un número entero. 
    Cuando Java compara dos objetos en estructuras de tipo hash (HashMap, HashSet etc) 
    primero invoca al método hashcode y luego el equals.
    */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idFactura);
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
        final Factura other = (Factura) obj;
        if (!Objects.equals(this.idFactura, other.idFactura)) {
            return false;
        }
        return true;
    }

}
