/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Roxana
 */
public class ListaReserva extends Fecha{
    private ArrayList<Reservaciones> reservaciones;
     
    private static String habs;
    private static String habd;
    
    
    public ListaReserva(int dia, int mes, int anio) {
        super(dia, mes, anio);
        reservaciones = new ArrayList<>();
        
    }

    public ArrayList<Reservaciones> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(ArrayList<Reservaciones> reservaciones) {
        this.reservaciones = reservaciones;
    }
    
    public Listas TipoHab(int opc){
        
        Listas lis;
        
        String hab[] = {"A", "B", "C", "D", "E", "F"};
        String numero[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[][] lista = new String [hab.length][numero.length];
        String [][] listaI = new String [hab.length][(numero.length)/2];
        String [][] listaP = new String [hab.length][(numero.length)/2];
        
        for(int i=0; i<hab.length; i++)
        {
            //System.out.println("Se imprimio");
            for(int j=0; j<numero.length; j++)
            {
                lista[i][j] = hab[i] + numero[j]; 
                //System.out.println(Arrays.deepToString(lista));
                //System.out.println(lista[i][j]);
                
                if (j%2==0 && opc==1 )
                {
                    listaI[i][j/2]=hab[i] + numero[j]; 
                    //return listaI;
                }
                else if(j%2!=0 && opc==2 )
                {
                   listaP[i][j/2]=hab[i] + numero[j];
                   //return listaP;
                }
                
            }
            
        } 
        lis = new Listas(listaI,listaP, lista);
        
        return lis;
    }
    public static NumeroHab NumeroHab(String[][] listaI, String[][] listaP, String[][] lista,int opc){
        
        NumeroHab numeroh;
        String habs = null,habd = null;
        
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
                }
                else if(opc==2)
                {
                    System.out.println("El número de la habitación doble es: "+listaP[m1][n2]);
                }
                habs= listaI[m1][n2];
                habd = listaP[m1][n2];
                break;
            }
            break;
        }
        
        //System.out.println(Arrays.deepToString(lista));
        //System.out.println(Arrays.deepToString(listaI));
        //System.out.println(Arrays.deepToString(listaP));
        
       numeroh = new NumeroHab(habs, habd);
       return numeroh;
    }
    public int OpcionesHab(){
        System.out.println("Elegir el tipo de habitación.");
        System.out.println("1. Sencillo.");
        System.out.println("2. Doble.");
        
        int opc=0;
        Scanner read = new Scanner(System.in);
        
        while(opc != 2){
            
            opc = read.nextInt();
                
            switch(opc){
                
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
          
        }
        return 0;
    }
    
    public void DiasR(){
        
        Scanner read = new Scanner(System.in);
        int d,m,a;
        
        System.out.println("Ingrese el dia a reservar.");
        d = read.nextInt();
        
        System.out.println("Ingrese el mes en que estara reservado.");
        m = read.nextInt();
        
        System.out.println("Ingrese el añio en que estara reservado.");
        a = read.nextInt();
        
        if(DiasXmes(d, m, a).iseDia()==false ||DiasXmes(d, m, a).iseMes()==false || DiasXmes(d, m, a).iseAnio()==false){
            System.out.println("La fecha no existe.");
            while(DiasXmes(d, m, a).iseDia()==false ||DiasXmes(d, m, a).iseMes()==false || DiasXmes(d, m, a).iseAnio()==false)
            {
                DiasR();
            }
        }
        else 
        {
            System.out.println("La fecha existe");
            
            int cant;
            System.out.println("Ingrese la cantidad de dias de hospedaje: ");
            cant= read.nextInt();
            if(cant<=7)
            {
                
                DiaSig(d, m, a);
                
                int o, p, q;
                o = DiaSig(d, m, a).getDia(); 
                p = DiaSig(d, m, a).getMes();
                q = DiaSig(d, m, a).getAnio();
                System.out.print("Fecha de salida del hotel: ");
                System.out.println((DiaSig(d, m, a).getDia()+cant-1)+"-"+DiaSig(d, m, a).getMes()+"-"+DiaSig(d, m, a).getAnio());
            }
        }
     
        
    }
    
    public void TipoPaquete(){
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
                    
                    break;
                case 2:
                    System.out.println("EL paquete del huésped seleecionado es BASICO.");
                    break;
                default:
                    System.out.println("elegir una opción valida.");
                    break;
            }
        }
    }
    
    public int Paquete(){
        System.out.println("Selcionar.");
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
        
    public void add() {
        Reservaciones reservar = new Reservaciones();
        reservaciones.add(reservar);
        Scanner read = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del huesped: ");
        reservar.setNombre(read.nextLine());
        
        System.out.print("Ingrese el apellido del huesped: ");
        reservar.setApellido(read.nextLine());
        
        System.out.print("Ingrese la identificación del huesped: ");
        reservar.setDui(read.nextLine());
        
        System.out.print("Ingrese el número telefónico del huesped: ");
        reservar.setTelefono(read.nextLine());
        
        System.out.print("Ingrese la fecha de ingreso al hotel: ");
        reservar.setFechaIng(read.nextLine());
        
        System.out.print("Ingrese la fecha del último día de reservación: ");
        reservar.setFechaSal(read.nextLine());
        
        int x= OpcionesHab();
        
        String a[][]=TipoHab(x).getListaI();
        String b[][]=TipoHab(x).getListaP();
        String c[][]=TipoHab(x).getLista();
        
        NumeroHab(a,b,c,x);
        
    }
}
