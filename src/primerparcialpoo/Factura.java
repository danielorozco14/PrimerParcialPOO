/*
Clase Factura que tendra los atributos:
1. idFactura
2.Total 
Y contará con los metodos:
1.Total a pagar
2. Generarle un ID a la factura
 */
package primerparcialpoo;
// borrar cuando se suba

import java.util.Objects;
import java.util.UUID;

/**
 * @author karicha <00002517@uca.edu.sv>
 */

//CLASE FACTURA
public class Factura {

    //ATRIBUTOS
    private  Reservaciones reservacion;
    private  String idFactura;
    private double TotalAPagar;

    //CONSTRUCTOR DE FACTURA
    
    public Factura() {
        
    }

    public Factura(Reservaciones reservacion) {
        //GENERANDO DE FORMA RANDOM EL ID DE FACTURA
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
        this.reservacion = reservacion;
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
        this.TotalAPagar += this.reservacion.getPrecioHabitacion();

    }

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
