/*
Clase Factura contendra el total monetario de de los servicios adquiridos por el huesped.

 */
package primerparcialpoo;

import java.text.SimpleDateFormat;
import java.util.Date; //NOS SERVIRA PARA EL MANEJO DE FECHAS.
import java.util.Scanner;
import java.util.UUID; //ESTA IMPORTACION NOS AYUDARA PARA GENERAR DE MANERA RANDOM EL ID DE FACTURA,
//YA QUE GENERA CODIGOS ALFANUMERICOS.

/**
 * @author karicha <00002517@uca.edu.sv>
 */
//CLASE FACTURA
public class Factura {

    //ATRIBUTOS
    protected Reservaciones reservacion;
    protected String idFactura;
    protected double TotalAPagar;

    //CONSTRUCTOR DE FACTURA
    public Factura() {

        //this.reservacion = reservacion;
    }

    //GETTER AND SETTER
    public void setIdFactura(String idFactura) {
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

    //SACANDO TOTAL 
    public double TotalPagar() {
        //SUMANDO LOS SERVICIOS PARA SACAR UN TOTAL A PAGAR POR CUENTA DEL HUESPED
        return this.TotalAPagar += this.reservacion.getPrecioHabitacion() + this.reservacion.getVariacionTemporada();

    }

    public void Generar() {
        Scanner buscar = new Scanner(System.in);
        ListaHuesped.getInstance().getArray();

        System.out.println("Ingrese el ID del huesped a buscar: ");
        String id = buscar.nextLine();

        int cont = 0, cont1 = 0;

        for (Huesped huesped : ListaHuesped.getInstance().getArray()) {
            if (huesped.getIdHuesped().equals(id) && cont == 0) {
                System.out.println("\t\t***** FACTURA *****" + "\nID Factura: " + UUID.randomUUID().toString().toUpperCase().substring(0, 6) + " \t\tFecha: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
                System.out.println("\t\tCliente: " + huesped.getNombre());
                System.out.println("\t\tID Huesped: " + huesped.getIdHuesped());
            } else if (huesped.getIdHuesped().equals(id) && cont != 0) {
                System.out.println("\t\t***** FACTURA *****" + "\nID Factura: " + UUID.randomUUID().toString().toUpperCase().substring(0, 6) + " \t\tFecha: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
                System.out.println("\t\tCliente: " + huesped.getNombre());
                System.out.println("\t\tID Huesped: " + huesped.getIdHuesped());
            } else if (huesped.getIdHuesped().equals(id) == false) {
                cont1++;
                if (ListaHuesped.getInstance().getArray().size() == cont1) {
                    System.out.println("No existe este ID en el registro o el huesped aun  no ha sido registrado");
                }
            }
            cont++;
        }

        
    }

    }


