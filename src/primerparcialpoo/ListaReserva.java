/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Roxana
 */
public class ListaReserva {

    private static ListaReserva listaReserva;
    private ArrayList<Reservaciones> datosReserva = null;

    public static ListaReserva getInstance() {
        if (listaReserva == null) {
            listaReserva = new ListaReserva();
        }

        return listaReserva;
    }

    private ListaReserva() {
        datosReserva = new ArrayList<>();
    }
    // Se obtiene el array de donde sea 

    public ArrayList<Reservaciones> getArray() {
        return this.datosReserva;
    }
    //Añade elementos al array

    public void addToArray(Reservaciones reservacion) {
        datosReserva.add(reservacion);
    }

       
    
    public Listas TipoHab(int opc) {

        Listas lis;

        String hab[] = {"A", "B", "C", "D", "E", "F"};
        String numero[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[][] lista = new String[hab.length][numero.length];
        String[][] listaI = new String[hab.length][(numero.length) / 2]; //Habitaciones Impares
        String[][] listaP = new String[hab.length][(numero.length) / 2]; //Habitaciones Pares 

        for (int i = 0; i < hab.length; i++) {
            //System.out.println("Se imprimio");
            for (int j = 0; j < numero.length; j++) {
                lista[i][j] = hab[i] + numero[j];
                //System.out.println(Arrays.deepToString(lista));
                //System.out.println(lista[i][j]);

                if (j % 2 == 0 && opc == 1) {
                    listaI[i][j / 2] = hab[i] + numero[j];
                    //return listaI;
                } else if (j % 2 != 0 && opc == 2) {
                    listaP[i][j / 2] = hab[i] + numero[j];
                    //return listaP;
                }

            }

        }
        lis = new Listas(listaI, listaP, lista);

        return lis;
    }

    public String NumeroHab(String[][] listaI, String[][] listaP, String[][] lista, int opc) {

        Validaciones va;

        System.out.println(lista);
        String w = null;
        boolean bandera;
        Scanner read = new Scanner(System.in);
        System.out.println("Elegir un número de habitacion: ");
        w = read.nextLine();
        if (!Arrays.asList(lista).contains(w)) {
            System.out.println("No se puede reservar. La habitación que no existe");
        }
        /*
        Random r = new Random();
        for(int a=0; a<6; a++){
            for(int b=0; b<5;b++){
                int m1 =r.nextInt(listaI.length);
                int n2 =r.nextInt(listaI.length);
                System.out.println("Fila:" + m1);
                System.out.println("Columna:" + n2);
                if(opc==1)
                {
                    System.out.println("El número de la habítación sencilla es: "+listaI[m1][n2]);
                    w = listaI[m1][n2];
                }
                else if(opc==2)
                {
                    System.out.println("El número de la habitación doble es: "+listaP[m1][n2]);
                }
                break;
            }
            break;
        }
        
        //System.out.println(Arrays.deepToString(lista));
        //System.out.println(Arrays.deepToString(listaI));
        //System.out.println(Arrays.deepToString(listaP));
         */

        return w;
    }

    public String TipH(int opc) {

        String tipoHab;
        if (opc == 1) {
            tipoHab = "sencilla";
        } else if (opc == 2) {
            tipoHab = "Doble";
        }
        return " ";
    }
    
    

    public int OpcionesHab() {
        System.out.println("Elegir el tipo de habitación.");
        System.out.println("1. Sencillo.");
        System.out.println("2. Doble.");

        int opc = 0;
        Scanner read = new Scanner(System.in);

        while (opc != 2) {
            
            try {
                opc = read.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("La habitación del huesped es sencilla.");
                        return 1;

                    case 2:
                        System.out.println("La habitación del huesped es doble.");
                        return 2;
                    default:
                        System.out.println("Por favor ingrese una opción válida.");
                        break;
                }

            }catch(InputMismatchException e){
                System.out.println("INGRESE SOLO NUMEROS");
                read.nextLine();                
            }

        }
        return 0;
    }
//    
//    public Fechas DiasR(){
//        
//        Fechas fechas;
//                
//        Scanner read = new Scanner(System.in);
//        int d,m,a;
//        String fi, fs=null;
//        
//        System.out.println("Ingrese el dia a reservar.");
//        d = read.nextInt();
//        
//        System.out.println("Ingrese el mes en que estara reservado.");
//        m = read.nextInt();
//        
//        System.out.println("Ingrese el año en que estara reservado.");
//        a = read.nextInt();
//        
//        System.out.println("Fecha de ingreso al hotel:" + d+ "-" + m + "-"+a);
//        fi = Integer.toString(d)+"-"+Integer.toString(m)+"-"+Integer.toString(a);
//        
//        if(DiasXmes(d, m, a).iseDia()==false ||DiasXmes(d, m, a).iseMes()==false || DiasXmes(d, m, a).iseAnio()==false){
//            System.out.println("La fecha no existe.");
//            while(DiasXmes(d, m, a).iseDia()==false ||DiasXmes(d, m, a).iseMes()==false || DiasXmes(d, m, a).iseAnio()==false)
//            {
//                DiasR();
//            }
//        }
//        else 
//        {
//            System.out.println("La fecha existe");
//            boolean bandera = true;
//            while(bandera){
//                int cant;
//                System.out.println("Ingrese la cantidad de dias de hospedaje: ");
//                cant= read.nextInt();
//                if(cant<=7)
//                {
//                
//                    DiaSig(d, m, a);
//                
//                    int o, p, q;
//                    o = DiaSig(d, m, a).getDia(); 
//                    p = DiaSig(d, m, a).getMes();
//                    q = DiaSig(d, m, a).getAnio();
//                    System.out.println("Fecha del último día de reservación:");
//                    System.out.println((DiaSig(d, m, a).getDia()+cant-1)+"-"+DiaSig(d, m, a).getMes()+"-"+DiaSig(d, m, a).getAnio());
//                    fs = Integer.toString(DiaSig(d, m, a).getDia()+cant-1)+"-"+Integer.toString(DiaSig(d, m, a).getMes())+"-"+Integer.toString(DiaSig(d, m, a).getAnio());
//                    bandera = false;
//                }
//                else {
//                    System.out.println("La cantidad de dias en reservación permitida es menor o igual a 7.");
//                }
//            }
//        }
//        fechas = new Fechas(fi,fs);
//        return fechas;
//    }
//    
    public String TipoPaquete(){
        String a = null;
        System.out.println("Selcionar el tipo de paquete.");
        System.out.println("1. PREMIUM.");
        System.out.println("2. BASICO.");
        int costo = 0;
        int tipo=0;
        Scanner read = new Scanner(System.in);
        
        while(tipo != 2){
            tipo = read.nextInt();
            switch(tipo){
                case 1: 
                    System.out.println("El paquete del huésped seleccionado es PREMIUM.");
                    a = "PREMION";
                    break;
                case 2:
                    System.out.println("EL paquete del huésped seleecionado es BASICO.");
                    a = "BASICO";
                    break;
                default:
                    System.out.println("Elegir una opción valida.");
                    break;
            }
        }
        return a;
    }
//    
    public boolean Paq(int x ){
        if(x==1)
        {
           return true; 
        }
        else if(x==2)
        {
            return false;
        }
       return false; 
    }
    
    public int Paquete(){
        System.out.println("Seleccionar.");
        System.out.println("1. Paquete.");
        System.out.println("2. Sin paquete.");
        
        int paquete=0;
        Scanner read = new Scanner(System.in);
        
        while(paquete != 2){
            
            paquete = read.nextInt();
            
            switch(paquete){
                case 1:
                    System.out.println("El huesped ha requerido un paquete.");
                    TipoPaquete();
                    return 1;
                case 2:
                    System.out.println("El huesped no requiere paquete");
                    return 2;
                default:
                    System.out.println("Ingresar una opción valida.");
                    break;
            }
        }
        return 0;
    }
        
//    public void add() {
//        Reservaciones reservar = new Reservaciones();
//        reservaciones.add(reservar);
//        Scanner read = new Scanner(System.in);
//        
//        System.out.print("Ingrese el nombre del huesped: ");
//        reservar.setNombre(read.nextLine());
//        
//        System.out.print("Ingrese el apellido del huesped: ");
//        reservar.setApellido(read.nextLine());
//        
//        System.out.print("Ingrese la identificación del huesped: ");
//        int cont = 0;
//        for(Reservaciones r: reservaciones){
//            if(r.getDui()==reservar.getDui()){
//                cont = cont + 1;
//                if(cont<=2)
//                {
//                    reservar.setDui(read.nextLine());
//                }
//                else
//                {
//                    System.out.println("El máximo número de reservaciones por persona es 2.");
//                }
//            }
//        }
//        
//        
//        System.out.print("Ingrese el número telefónico del huesped: ");
//        reservar.setTelefono(read.nextLine());
//        
//        int x= OpcionesHab();
//        
//        reservar.setTipoHab(TipH(x));
//        
//        String a[][]=TipoHab(x).getListaI();
//        String b[][]=TipoHab(x).getListaP();
//        String c[][]=TipoHab(x).getLista();
//        
//        reservar.setPaquete(Paq(Paquete()));
//        
//        boolean bandera = true;
//        while(bandera){
//            for(Reservaciones r: reservaciones){
//                if(r.getNumeroHab()!=reservar.getNumeroHab()){
//
//                    reservar.setNumeroHab(NumeroHab(a,b,c,x));
//                    bandera = false;
//                }
//            }
//        }
//            
//        reservar.setFechaIng(DiasR().getFi());
//        
//        reservar.setFechaSal(DiasR().getFs());
//        
//    }
    
//    public void Mostrar(){
//        for(Reservaciones r: reservaciones){
//            System.out.println(r.toString());
//        }
//    }
    
//    public void Eliminar(){
//        
//        Scanner read = new Scanner(System.in);
//        
//        for(Reservaciones r: reservaciones){
//            int x= OpcionesHab();
//        
//            String a[][]=TipoHab(x).getListaI();
//            String b[][]=TipoHab(x).getListaP();
//            String c[][]=TipoHab(x).getLista();
//            
//            String numero;
//            System.out.println("Ingrese el número de la habitación para eliminar la reservación: ");
//            numero = read.nextLine();
//            if(NumeroHab(a, b, c,x) == numero)
//            {
//                reservaciones.remove(r);
//            }
//            else{
//                System.out.println("El número de la reservación no existe.");
//            }
//        }
//    }
//    
//    public void Modificar(){
//        Reservaciones reservar = new Reservaciones();
//        Scanner read = new Scanner(System.in);
//        int indice, x;
//        System.out.println("Ingrese el indice de la reservación que desee modificar: ");
//        indice = read.nextInt();
//        for(int y=0;y<reservaciones.size();y++) {
//            if(y== indice)
//            {
//                x = reservaciones.indexOf(indice);
//                
//                System.out.println("Ingrese el nuevo nombre del huesped:");
//                reservaciones.get(x).setNombre(read.nextLine());
//                
//                System.out.print("Ingrese el nuevo apellido del huesped: ");
//                reservaciones.get(x).setApellido(read.nextLine());
//        
//                System.out.print("Ingrese la identificación del huesped: ");
//                int cont = 0;
//                for(Reservaciones r: reservaciones){
//                    if(r.getDui()==reservar.getDui()){
//                        cont = cont + 1;
//                        if(cont<=2)
//                        {
//                            reservaciones.get(x).setDui(read.nextLine());
//                        }
//                        else
//                        {
//                            System.out.println("El máximo número de reservaciones por persona es 2.");
//                        }
//                    }
//                } 
//                System.out.print("Ingrese el número telefónico del huesped: ");
//                reservaciones.get(x).setTelefono(read.nextLine());
//                
//                reservaciones.get(x).setTelefono(TipH(x));
//        
//                String a[][]=TipoHab(x).getListaI();
//                String b[][]=TipoHab(x).getListaP();
//                String c[][]=TipoHab(x).getLista();
//        
//                reservaciones.get(x).setPaquete(Paq(Paquete()));
//        
//                boolean bandera = true;
//                while(bandera){
//                    for(Reservaciones r: reservaciones){
//                        if(r.getNumeroHab()!=reservar.getNumeroHab()){
//                            
//                            reservaciones.get(x).setNumeroHab(NumeroHab(a,b,c,x));
//                            bandera = false;
//                        }
//                    }
//                }
//            reservaciones.get(x).setNumeroHab(DiasR().getFi());
//            reservaciones.get(x).setNumeroHab(DiasR().getFs());
//            }
//            
//        }
//    }
}
