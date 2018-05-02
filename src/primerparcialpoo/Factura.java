/*
Clase Factura que tendra los atributos:
1. idFactura
2.Total 
Y contará con los metodos:
1.Total a pagar
2. Generarle un ID a la factura
*/
package primerparcialpoo;


/**
 @author karic <00002517@uca.edu.sv>
 */

//CLASE FACTURA
public class Factura extends Reservaciones {
    //ATRIBUTOS
    private String idFactura;
    public double TotalAPagar;
    
    //CONSTRUCTOR FACTURA
    public Factura(String IDFACTURA, double totalApagar){
        this.idFactura = IDFACTURA;
        this.TotalAPagar = totalApagar;
    }
    
    //INSTANCIANDO OBJETO 
    //Factura factura = new Factura();
}




