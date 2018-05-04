/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID; //Esta madre sirve para generar codigos alfa numericos aleatorios
import java.util.Date; //Esta madre sirve para obtener la fecha del sistema :v
/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Huesped extends Persona{

    protected String idHuesped;
    protected String fechaRegistro;
    protected ArrayList<Huesped> DatosHuesped;

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
        DatosHuesped = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Huesped{" + "Nombre= " + super.getNombre() + ";ID Huesped=" + idHuesped + ";Fecha de Registro " + fechaRegistro + ";DUI= " + super.getDUI() + ";Tarjeta de Cred.= " + super.getTarjeta() + ";Correo= " + super.getCorreo() + ";Telefono= " + super.getTelefono() + '}';
    }

    public void ObtenerDatosHuesped() {
        
        Validaciones Validar = new Validaciones();
        Huesped addDatos = new Huesped();
        Scanner infoHuesped = new Scanner(System.in);

        System.out.println("\t\t----- Ingresar Datos de Huesped ----- ");

        System.out.print("INGRESE SU NOMBRE: ");
        String nombre = infoHuesped.nextLine();
        //addDatos.setNombre(nombre);
        if (Validar.ValidarNombre(nombre) == true) {
            addDatos.setNombre(nombre);
        } else {
            do {
                System.out.print("Ingrese su nombre correctamente: ");
                nombre = infoHuesped.nextLine();
            } while (Validar.ValidarNombre(nombre) != true);

            addDatos.setNombre(nombre);

        }

        System.out.print("INGRESE SU FECHA DE NACIMIENTO: ");
        String fechaNac = infoHuesped.nextLine();
        //addDatos.setFechaNacimiento(fechaNac);
        if (Validar.ValidarFecha(fechaNac) == true) {
            addDatos.setFechaNacimiento(fechaNac);
        } else {
            do {
                System.out.print("Ingrese su fecha de nacimiento correctamente: ");
                fechaNac = infoHuesped.nextLine();
            } while (Validar.ValidarFecha(fechaNac) != true);

            addDatos.setFechaNacimiento(fechaNac);

        }

        System.out.print("INGRESE SU DUI: ");
        String Dui = infoHuesped.nextLine();
        //addDatos.setDUI(Dui);
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
            addDatos.setNombre(Correo);
        } else {
            do {
                System.out.print("Ingrese su correo electronico correctamente: ");
                Correo = infoHuesped.nextLine();
            } while (Validar.ValidarCorreo(Correo) != true);

            addDatos.setCorreo(Correo);

        }
        addDatos.setIdHuesped(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        addDatos.setFechaRegistro(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));//SE AGREGA LA FECHA DEL REGISTRO DEL HUESPED
        DatosHuesped.add(addDatos);

    }

    public void mostrarContactos() {
        System.out.println("\t\t----- Mostrando Contactos -----");
        for (Huesped host : DatosHuesped) {
            System.out.println(host.toString());
        }

    }

    public void encontrarContactos() {
        Huesped Search = new Huesped();
        Scanner buscar = new Scanner(System.in);

        System.out.println("Ingrese el ID del huesped a buscar: ");
        String id = buscar.nextLine();

        int cont = 0, cont1 = 0;

        for (Huesped huesped : DatosHuesped) {
            Scanner cambiar = new Scanner(System.in);
            if (huesped.getIdHuesped().equals(id) && cont == 0) {

                 System.out.println("Este huesped existe: " + "Nombre= " + huesped.getNombre() + " ; ID Huesped=" + huesped.getIdHuesped() + " ; Fecha de Nacimiento= " + huesped.getFechaNacimiento() + " ; DUI= " + huesped.getDUI() + " ; Tarjeta de Cred.= " + huesped.getTarjeta() + " ; Correo= " + huesped.getCorreo() + " ; Telefono= " + huesped.getTelefono());

            } else if (huesped.getIdHuesped().equals(id) && cont != 0) {
                System.out.println("Este huesped existe: " + "Nombre= " + huesped.getNombre() + " ; ID Huesped=" + huesped.getIdHuesped() + " ; Fecha de Nacimiento= " + huesped.getFechaNacimiento() + " ; DUI= " + huesped.getDUI() + " ; Tarjeta de Cred.= " + huesped.getTarjeta() + " ; Correo= " + huesped.getCorreo() + " ; Telefono= " + huesped.getTelefono());

            } else if (huesped.getIdHuesped().equals(id) == false) {
                cont1++;
                if (DatosHuesped.size() == cont1) {
                    System.out.println("No existe este ID en el registro o el huesped aun  no ha sido registrado");
                }
            }
            cont++;
        }
    }

}
