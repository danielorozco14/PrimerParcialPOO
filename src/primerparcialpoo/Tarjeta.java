/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Tarjeta extends Persona {
    
    protected String numTarjeta;
    protected ArrayList<Tarjeta> tarjetas;

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
    
    public Tarjeta(){
        tarjetas=new ArrayList<>();
    }
    
    public void obtenerTarjeta(){
        
        Tarjeta añadirDatos = new Tarjeta();
        Validaciones Validar = new Validaciones();
        Scanner numTarjeta = new Scanner(System.in);

        System.out.print("Ingrese su tarjeta de credito: ");
        String Num = numTarjeta.nextLine();

        if (Validar.ValidarTarjeta(Num) == true) {
            añadirDatos.setNumTarjeta(Num);
        } 
        else {
            do 
            {
                System.out.print("Ingrese su tarjeta de credito correctamente: ");
                Num = numTarjeta.nextLine();
            } while (Validar.ValidarTarjeta(Num)!=true);
            
            añadirDatos.setNumTarjeta(Num);

        }
        tarjetas.add(añadirDatos);
    }
    
}
