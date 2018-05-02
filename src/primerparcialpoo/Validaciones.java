/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Roberto
 */
/*Validar
    -Un mismo cliente no puede reservar mas de 2 habitaciones
    -El ingreso de datos de una habitacion no tiene que sobrepasar los limites del hotel, tampoco ser valores de habitaciones 0 o negativos
    -La seleccion del paquete queda en la reservacion pero un cliente no puede escoger mas de un paquete
    -No puede existir campos vacios en una reservacion
    -try catch por si los valores ingresados son incorrectos ejemplo un string en un int
*/
public class Validaciones {
    char[] Pisos = {'A','B','C','D','E','F'};
    public boolean MaximoTiempoReservacion(int CantDias){
        if (CantDias > 7){
            System.out.println("No puede registrarse por mas de 7 dias");
            return false;
        }
        return true;
    }
    public boolean HabitacionReservada(char[] Habitacion){
        for (int i=0; i<7; i++){
            if (Habitacion[0] != Pisos[i]){
                System.out.println("No puede reservar una habitacion que no existe");
                return false;
            }
        }
        return true;
    }
    public boolean ValidarCorreo(String Correo){
        char[] CorreoC = Correo.toCharArray();//Correo simplificado a caracteres
        for (int i=0; i<CorreoC.length; i++){
            if (CorreoC[i] == '@'){
                return true;
            }
        }
        System.out.println("Su correo no es valido");
        return false;
    }
    public boolean ValidarTelefono(String Telefono){
        char[] TelefonoC = Telefono.toCharArray();//TelefonoC es en caracteres
        if (8 > TelefonoC.length){
            return false;
        }
        try{
            int TelefonoI = Integer.parseInt(Telefono);//Telefono I es el telefono en enteros
        }
        catch(NumberFormatException e){
            System.out.println("Su telefono tiene que contener solo numeros intente denuevo");
            return false;
        }
        return true;
    }

}
