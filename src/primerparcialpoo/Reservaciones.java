//solo la hice de prueba para ver si funcionaba la clase FACTURA, cuando ya este la verdadera se borrara esta
package primerparcialpoo;

/**
 *
 * @author Roxana
 */
//CLASE RESERVACIONES
public class Reservaciones extends Habitacion {

    private float PrecioHabitacion;
    private String Paquete;
    private String TipoHabitacion;
    private String ServiciosIndividuales;
    private char[] NumeroHabitacion = new char[2];
    private String tipoHab;
    private String numeroHab;
    private boolean paquete;
    private String fechaIng;
    private String fechaSal;

    //CONSTRUCTOR RESERVACIONES
    public Reservaciones() {

    }

    public Reservaciones(String nombre, String apellido, String telefono, String dui, String tipoHab, String numeroHab, boolean paquete, String fechaIng, String fechaSal) {

        super();

        this.tipoHab = tipoHab;
        this.numeroHab = numeroHab;
        this.paquete = paquete;
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
