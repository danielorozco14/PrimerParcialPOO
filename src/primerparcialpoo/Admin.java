/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Admin {
    
    private static Admin administrador;
    
        
    private Admin(){        
    }
    
    public static Admin getInstance() {
        if (administrador == null) {
            administrador = new Admin();
        }

        return administrador;
    }
    
    public void opciones(){
        System.out.println("\t\t********** HOTEL RAFIÑA **********");
        System.out.println("\t\t1. Añadir Reservación");
        System.out.println("\t\t2. Modificar Reservación");
        System.out.println("\t\t3. Cancelar Reservación");
        System.out.println("\t\t4. Mostrar todas las  Reservaciónes");
        System.out.println("\t\t5. Mostrar los datos de los Huespedes");
        System.out.println("\t\t6. Mantenimiento de Hotel");
        System.out.println("\t\t7. Configuracion de Precios");
    }
    
    public void mostrar() {
        int opcion = 8;
        Scanner leer = new Scanner(System.in);
        Persona persona = new Persona();
        Huesped huesped = new Huesped();
        Factura factura = new Factura();
        Reservaciones reservacion = new Reservaciones();
        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        huesped.ObtenerDatosHuesped();
                        break;
                    case 2:
                        huesped.mostrarContactos();
                        huesped.modificarReserva();
//                        ListaReserva.getInstance().mostrarDatos();
                        break;
                    case 3:
                       
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        break;
                    case 6:
                        break;

                    case 7:
                        System.out.println("\t\tPROGRAMA FINALIZADO");;
                        break;

                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número ");
                leer.nextLine();
            }
        }
    }
}
