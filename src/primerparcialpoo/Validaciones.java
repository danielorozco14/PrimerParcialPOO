package primerparcialpoo;
/**
 *
 * @author Roberto Alexander Rubio Castillo <00259517@uca.edu.sv>  */



//sintaxis para las fechas dd/mm/aaaa
import java.util.ArrayList;

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
    
    public boolean HabitacionesReservadas(String Habitacion, ArrayList<String> Reservadas){
        return !Reservadas.contains(Habitacion);
    }
    
    public boolean ValidarCantidadDeReservaciones(String Nombre, String FechaIngresada){// validador de cantidad de reservaciones, aun hay que cambiar parametros para que reciva la lista de reservaciones
        char[] FechaIngresadaC = FechaIngresada.toCharArray();//Fecha Ingresada se convierte en arreglo
        int DiaI, DiaE, MesI, MesE, AnioI, AnioE; //DiaI=DiaIngresado, DiaE=DiaExistente
        String aux, NombreE;//NombreE=Nombre que tenemos que tener en reservaciones
        try{//Formato de fecha DD/MM/AAAA
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
        catch(NumberFormatException e){
            System.out.println("La fecha no puede contener letras");
            return false;
        }
    }
    
    public boolean ValidarPaquete(String Paquete){
        if ("Premium".equals(Paquete) || "Basico".equals(Paquete) || "Sin paquete".equals(Paquete)){
            return true;
        }
        System.out.println("Usted no ha escogido un paquete valido");
        return false;
    }
    
    public boolean ValidarCorreo(String Correo){
        char[] CorreoC = Correo.toCharArray();//Correo simplificado a caracteres
        for (int i=0; i<CorreoC.length; i++){
            if (CorreoC[i] == '@'){
                String aux;
                aux = "";
                for (i = i; i<=CorreoC.length; i++){
                    aux = new StringBuilder().append(aux).append(CorreoC[i]).toString();
                    if ("outlook".equals(aux) || "gmail".equals(aux) || "Outlook".equals(aux) || "Gmail".equals(aux) || "yahoo".equals(aux) || "Yahoo".equals(aux)){
                        System.out.println("Su correo es valido");
                        return true;
                    }
                    if (CorreoC[i] == '.'){
                        System.out.println("Su correo no posee un dominio correcto");
                        return false;
                    }
                    return true;
                }
            }
        }
        System.out.println("Su correo no es valido");
        return false;
    }
    
    public boolean ValidarTelefono(String Telefono){
        char[] TelefonoC = Telefono.toCharArray();//TelefonoC es en caracteres
        try{
            int TelefonoI = Integer.parseInt(Telefono);//Telefono I es el telefono en enteros
            if ( TelefonoC.length > 8 || TelefonoC.length < 8){
                
                System.out.println("\t\t***** Ingrese un numero de telefono valido (8 digitos) *****");
                return false;
            }
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("\t\t***** Su telefono tiene que contener solo numeros.Intente de nuevo *****");
            return false;
        }
    }

        
    public boolean ValidarDui(String Dui){
        char[] DuiC = Dui.toCharArray();//TelefonoC es en caracteres
        if (DuiC.length == 10){
            String aux;
            aux = "";
            int acum = 0;
            int auxN = 0;//Auxiliar numerico
            for (int i = 0; i < 8; i++){
                aux = new StringBuilder().append(aux).append(DuiC[i]).toString();
                try{
                    int auxn = Integer.parseInt(aux);//Se convierte el numero del aux de string a int, auxn es el aux en int
                    auxN = Character.getNumericValue(DuiC[i]);
                    int prueba = 9-i;//variable para guardar el resultado de 9-i y no alterar valores de variable
                    acum =acum + (auxN * prueba);//aqui vamos a tener el valor como entero de las partes del dui
                }
                catch(NumberFormatException e){
                    System.out.println("\t\t***** Su dui no puede contener letras*****");
                    return false;
                }
            }
                acum %= 10;
                acum = 10-acum;
                if (acum == 10){
                    acum = 0;
                    if (acum == Character.getNumericValue(DuiC[9])){
                        System.out.println("Su dui es valido");
                        return true;
                    }
                }
                if (acum == Character.getNumericValue(DuiC[9])){
                    System.out.println("Su dui es valido");
                    return true;
                }
                else{
                    System.out.println("Su dui es invalido");
                    return false;
                }
        }    return false;
    }
    
    public boolean ValidarFecha(String Fecha){
        char[] FechaC = Fecha.toCharArray();
        String aux;
        aux = "";
        for (int i = 0; i<2; i++){ //Dia
            aux = new StringBuilder().append(aux).append(FechaC[i]).toString();
        }
            try{
                if (Integer.parseInt(aux) > 0 && Integer.parseInt(aux) < 32){
                    aux = "";
                    for(int i = 3; i < 6; i++){//Mes
                        aux = new StringBuilder().append(aux).append(FechaC[i]).toString();
                        if(Integer.parseInt(aux) > 0 && Integer.parseInt(aux) < 13){
                            aux = "";
                            for(i = 6; i <= 10; i++){//Anio
                                aux = new StringBuilder().append(aux).append(FechaC[i]).toString();
                                if (Integer.parseInt(aux) < 2018){
                                    System.out.println("Su fecha de nacimiento es valida");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            catch(NumberFormatException e){
                System.out.println("Su fecha de nacimiento debe contener solo numeros");
                return false;
            }
        
        return false;
    }
    
    public boolean ValidarTarjeta(String Tarjeta){
        char [] TarjetaC = Tarjeta.toCharArray();
        for (int i = 0; i < TarjetaC.length; i++){
            if (TarjetaC[i] != '-'){
                try{
                    Character.getNumericValue(TarjetaC[i]);
                    }
                catch(NumberFormatException e){
                    System.out.println("Su tarjeta no es valida, por favor ingrese solo numeros enteros y los guiones respectivos en formato XXXX-XXXX-XXXX-XXXX");
                    return false;
                }
            }
        }
        System.out.println("Su tarjeta ha sido ingresada con exito");
        return TarjetaC.length == 19;
    }
    
    public boolean ValidarNombre(String Nombre){
        char[] Caracteres = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$',
                            '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}',
                            ':', ';', '"', '<', '>', ',', '.', '/', '?', '|', '`', '~'};
        char[] NombreC = Nombre.toCharArray();
        int aux1, aux2;
        try{
            for (int i = 0; i < NombreC.length; i++){
                for (int i2 = 0; i2 < Caracteres.length; i2++){
                    if (NombreC[i] == Caracteres[i2]){
                       return false;
                    } 
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            aux1 = NombreC[NombreC.length] -1;
            aux2 = Caracteres[Caracteres.length] -1;
            if (aux1 == aux2){
                return false;
            }
        }
        return true;
    }
}
