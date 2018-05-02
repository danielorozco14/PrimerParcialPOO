/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>
 */
/*Validar
    -Un mismo cliente no puede reservar mas de 2 habitaciones
    -El ingreso de datos de una habitacion no tiene que sobrepasar los limites del hotel, tampoco ser valores de habitaciones 0 o negativos
    -La seleccion del paquete queda en la reservacion pero un cliente no puede escoger mas de un paquete
    -No puede existir campos vacios en una reservacion
    -try catch por si los valores ingresados son incorrectos ejemplo un string en un int
*/
//sintaxis para las fechas dd/mm/aaaa
public class Validaciones {

    public boolean MaximoTiempoReservacion(int CantDias){//Validacion de tiempo de reservacion
        if (CantDias > 7){
            System.out.println("No puede registrarse por mas de 7 dias");
            return false;
        }
        return true;
    }
    public boolean HabitacionReservada(char[] Habitacion){//Validacion que la habitacion exista
        char[] Pisos = {'A','B','C','D','E','F'};
        for (int i=0; i<7; i++){
            if (Habitacion[0] != Pisos[i]){
                System.out.println("No puede reservar una habitacion en un piso que no existe");
                return false;
            }
        }
        if (Habitacion[1] <= 0 || Habitacion[1] > 10){
            System.out.println("No puede ingresar ese numero de habitacion");
            return false;
        }
        return true;
    }
    public boolean ValidarCantidadDeReservaciones(String Nombre, String FechaIngresada){// validador de cantidad de reservaciones, aun hay que cambiar parametros para que reciva la lista de reservaciones
        char[] FechaIngresadaC = FechaIngresada.toCharArray();//Fecha Ingresada se convierte en arreglo
        int DiaI, DiaE, MesI, MesE, AnioI, AnioE; //DiaI=DiaIngresado, DiaE=DiaExistente
        String aux, NombreE;//NombreE=Nombre que tenemos que tener en reservaciones
        aux = new StringBuilder().append(FechaIngresadaC[0]).append(FechaIngresadaC[1]).toString();
        DiaI = Integer.parseInt(aux);
        aux = new StringBuilder().append(FechaIngresadaC[3]).append(FechaIngresadaC[4]).toString();
        MesI = Integer.parseInt(aux);
        aux = new StringBuilder().append(FechaIngresadaC[6]).append(FechaIngresadaC[7]).append(FechaIngresadaC[8]).append(FechaIngresadaC[9]).toString();
        AnioI = Integer.parseInt(aux);
/*      int cont = 0;
        While (Reservaciones){
            String nombre Reservaciones.getnombre;
            if(Nombre == nombre){
                cont++;   
            if (Nombre == NombreE && DiaI == DiaE && MesI == MesE && AnioI == AnioE && cont >= 2){
                    System.out.println("Usted no puede tener mas de dos reservaciones continuas");
                    return false;
                }
*/
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
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Su telefono tiene que contener solo numeros intente denuevo");
            return false;
        }
    }

}
