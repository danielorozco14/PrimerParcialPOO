/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID; //Esta madre sirve para generar codigos alfa numericos aleatorios
import java.util.Date; //Esta madre sirve para obtener la fecha del 

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Huesped extends Persona {

    protected String tipoHab;

    protected String numeroHab;
    protected boolean paquete;

    protected String tipoPaquete;
    protected String fechaIng;

    protected String fechaSal;
    protected String fechaRegistro;

    //GETTERS AND SETTERS
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

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(String idHuesped) {
        this.idHuesped = idHuesped;
    }

    public Huesped() {
        super();//CON SUPER SE INICIALIZA LA CLASE PADRE Y YA SE PUEDE ACCEDER A TODOS LOS ATRIBUTOS O METODOS
    }

    @Override
    public String toString() {

        return "\t\t*********** Huesped ***********" 
                +"\n\t\tNombre= " + super.getNombre() 
                +"\n\t\tID Huesped=" + idHuesped
                + "\n\t\tFecha de Registro= " + fechaRegistro 
                + "\n\t\tDUI= " + super.getDUI()
                + "\n\t\tTarjeta de Cred.= " + super.getTarjeta() 
                + "\n\t\tCorreo= " + super.getCorreo()
                + "\n\t\tTelefono= " + super.getTelefono() 
                + "\n\t\tNumero de Habitacion= " + numeroHab 
                + "\n\t\tTipo de Paquete= " + tipoPaquete +"\n";
    }

    public void ObtenerDatosHuesped() {

        Validaciones Validar = new Validaciones();
        Huesped addDatos = new Huesped();
        Scanner infoHuesped = new Scanner(System.in);

        System.out.println("\t\t----- Ingresar Datos de Huesped ----- ");

        System.out.print("INGRESE SU NOMBRE: ");
        String nombre = infoHuesped.nextLine();
        if (Validar.ValidarNombre(nombre) == true) {
            addDatos.setNombre(nombre);
        } else {
            do {
                System.out.print("Ingrese su nombre correctamente: ");
                nombre = infoHuesped.nextLine();
            } while (Validar.ValidarNombre(nombre) != true);

            addDatos.setNombre(nombre);

        }


        System.out.print("INGRESE SU DUI: ");
        String Dui = infoHuesped.nextLine();
        if (Validar.ValidarDui(Dui) == true) {
            addDatos.setDUI(Dui);
        } else {
            do {
                System.out.print("Ingrese su DUI correctamente: ");
                Dui = infoHuesped.nextLine();
            } while (Validar.ValidarDui(Dui) != true);

            addDatos.setDUI(Dui);

        }

        System.out.print("INGRESE SU TARJETA DE CREDITO: ");
        String Tarjeta = infoHuesped.nextLine();
        //addDatos.setTarjeta(Tarjeta);
        if (Validar.ValidarTarjeta(Tarjeta) == true) {
            addDatos.setTarjeta(Tarjeta);
        } else {
            do {
                System.out.print("Ingrese su tarjeta de credito correctamente: ");
                Tarjeta = infoHuesped.nextLine();
            } while (Validar.ValidarTarjeta(Tarjeta) != true);

            addDatos.setTarjeta(Tarjeta);

        }

        System.out.print("INGRESE SU TELEFONO: ");
        String Telefono = infoHuesped.nextLine();
        //addDatos.setTelefono(Telefono);
        if (Validar.ValidarTelefono(Telefono) == true) {
            addDatos.setTelefono(Telefono);
        } else {
            do {
                System.out.print("Ingrese su telefono correctamente: ");
                Telefono = infoHuesped.nextLine();
            } while (Validar.ValidarTelefono(Telefono) != true);

            addDatos.setTelefono(Telefono);

        }

        System.out.print("INGRESE SU CORREO ELECTRONICO: ");
        String Correo = infoHuesped.nextLine();
        //addDatos.setCorreo(Correo);
        if (Validar.ValidarCorreo(Correo) == true) {
            addDatos.setCorreo(Correo);
        } else {
            do {
                System.out.print("Ingrese su correo electronico correctamente: ");
                Correo = infoHuesped.nextLine();
            } while (Validar.ValidarCorreo(Correo) != true);

            addDatos.setCorreo(Correo);

        }

        System.out.println("\t\t****** ELIJA LA HABITACION QUE DESEE ****** ");
        System.out.print("\t\tHabitacion: ");
        String Habitacion = infoHuesped.nextLine();
        addDatos.setNumeroHab(Habitacion);

        System.out.println("\t\t****** ELIJA EL PAQUETE QUE DESEE ****** ");
        System.out.println("\t\t1. BASICO \t2.PREMIUM \t3. NINGUNO");
        
        try{
        
        String paquete = infoHuesped.nextLine();

        switch (paquete) {
            case "1":
                addDatos.setTipoPaquete("BASICO");
                break;
            case "2":
                addDatos.setTipoPaquete("PREMIUM");
                break;
            case "3":
                addDatos.setTipoPaquete("NINGUNO");
                break;
            default:
                System.out.println("Ingrese Solamente Numeros!");
                break;
        }
        }catch(InputMismatchException e){
            System.err.println("Por favor, Ingrese un número");
            infoHuesped.nextLine();
        }

        addDatos.setIdHuesped(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        addDatos.setFechaRegistro(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));//SE AGREGA LA FECHA DEL REGISTRO DEL HUESPED

        ListaHuesped.getInstance().addToArray(addDatos);// SE AGREGAN TODOS LOS VALORES A LA CLASE LISTA HUESPED.
    }

    public void modificarReserva() {
        Huesped mod = new Huesped();
        Scanner buscar = new Scanner(System.in);
        ListaHuesped.getInstance().getArray();

        System.out.println("\t\t****** MODIFICANDO RESERVACION *******");

        System.out.println("Ingrese el ID del huesped a MODIFICAR: ");
        String id = buscar.nextLine();

        int cont = 0, cont1 = 0;

        for (Huesped huesped : ListaHuesped.getInstance().getArray()) {
            if (huesped.getIdHuesped().equals(id) && cont == 0) {
                
                
                                
                System.out.println("\t\t****** ELIJA LA HABITACION QUE DESEE ****** ");
                System.out.print("\t\tHabitacion: ");
                String Habitacion = buscar.nextLine();
                mod.setNumeroHab(Habitacion);
                

                System.out.println("\t\t****** ELIJA EL PAQUETE QUE DESEE ****** ");
                System.out.println("\t\t1. BASICO \t2.PREMIUM \t3. NINGUNO");
                String paquete = buscar.nextLine();

                switch (paquete) {
                    case "1":
                        mod.setTipoPaquete("BASICO");
                        break;
                    case "2":
                        mod.setTipoPaquete("PREMIUM");
                        break;
                    case "3":
                        mod.setTipoPaquete("NINGUNO");
                        break;
                    default:
                        System.out.println("Ingrese Solamente Numeros!");
                        break;
                }
                
                mod.setNombre(huesped.getNombre());
                mod.setCorreo(huesped.getCorreo());
                mod.setDUI(huesped.getDUI());
                mod.setFechaRegistro((new SimpleDateFormat("dd-MM-yyyy").format(new Date())));
                mod.setIdHuesped(huesped.getIdHuesped());
                mod.setTarjeta(huesped.getTarjeta());
                mod.setTelefono(huesped.getTelefono());
                
                ListaHuesped.getInstance().getArray().set(cont,mod);
                
            } else if (huesped.getIdHuesped().equals(id) && cont != 0) {
            System.out.println("\t\t****** ELIJA LA HABITACION QUE DESEE ****** ");
                System.out.print("\t\tHabitacion: ");
                String Habitacion = buscar.nextLine();
                mod.setNumeroHab(Habitacion);

                System.out.println("\t\t****** ELIJA EL PAQUETE QUE DESEE ****** ");
                System.out.println("\t\t1. BASICO \t2.PREMIUM \t3. NINGUNO");
                String paquete = buscar.nextLine();

                switch (paquete) {
                    case "1":
                        mod.setTipoPaquete("BASICO");
                        break;
                    case "2":
                        mod.setTipoPaquete("PREMIUM");
                        break;
                    case "3":
                        mod.setTipoPaquete("NINGUNO");
                        break;
                    default:
                        System.out.println("Ingrese Solamente Numeros!");
                        break;
                }
                
                mod.setNombre(huesped.getNombre());
                mod.setFechaRegistro((new SimpleDateFormat("dd-MM-yyyy").format(new Date())));
                mod.setCorreo(huesped.getCorreo());
                mod.setDUI(huesped.getDUI());
                mod.setIdHuesped(huesped.getIdHuesped());
                mod.setTarjeta(huesped.getTarjeta());
                mod.setTelefono(huesped.getTelefono());
                
                ListaHuesped.getInstance().getArray().set(cont,mod);
                
            } else if (huesped.getIdHuesped().equals(id) == false) {
                cont1++;
                if (ListaHuesped.getInstance().getArray().size() == cont1) {
                    System.out.println("No existe este ID en el registro o el huesped aun  no ha sido registrado");
                }
            }
            cont++;
        }
        
    }
    
    
    public void cancelarReservacion(){
        Scanner buscar = new Scanner(System.in);
        Huesped mod = new Huesped();
        ListaHuesped.getInstance().getArray(); 
        
        System.out.println("Ingrese el ID del huesped a buscar: ");
        String id = buscar.nextLine();

        int cont = 0, cont1 = 0;

         for (Huesped huesped : ListaHuesped.getInstance().getArray()) {
            if (huesped.getIdHuesped().equals(id) && cont == 0) {
              System.out.println("¿Desea eliminar la reservacion y todos los datos del huesped? S/N?");
                String opcion = buscar.nextLine();

                if (opcion.equals("S") || opcion.equals("s")) {
                    ListaHuesped.getInstance().getArray().remove(cont);
                    System.out.println("\t\tReservacion Eliminada");
                } else {
                    System.out.println("\t\tSaliendo de Eliminacion");
                }
                break;
            } else if (huesped.getIdHuesped().equals(id) && cont != 0) {

                System.out.println("¿Desea eliminar la reservacion y todos los datos del huesped? S/N?");
                String opcion = buscar.nextLine();

                if (opcion.equals("S") || opcion.equals("s")) {
                    ListaHuesped.getInstance().getArray().remove(cont);
                    System.out.println("\t\tReservacion Eliminada");
                } else {
                    System.out.println("\t\tSaliendo de Eliminacion");
                }
                break;
            } else if (huesped.getIdHuesped().equals(id) == false) {
                cont1++;
                if (ListaHuesped.getInstance().getArray().size() == cont1) {
                    System.out.println("No existe este ID de Huesped en el registro o la reservacion no ha sido realizada");
                }
            }
            cont++;
         }
    }
         
    
    public void mostrarContactos() {
        System.out.println("\t\t----- Mostrando Contactos -----");
        ListaHuesped.getInstance().mostrarDatos();
    }

    public void encontrarContactos() {
        //Huesped Search = new Huesped();
        System.out.println("\t\t----- ENCONTRANDO DATOS -----");
        ListaHuesped.getInstance().encontrarDatos();
    }
}
