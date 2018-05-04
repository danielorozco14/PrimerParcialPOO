/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Roxana
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public boolean Bisiesto()
    {
        return(anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);
    }
    
    public void FechaE(boolean existe){
        if(existe){
            System.out.println("La fecha existe.");
        }
        else if(!existe){
            System.out.println("La fecha no existe.");
        }
    }
    
    public Existencia DiasXmes (int dia, int mes, int anio){
        
        Existencia existe;
        
        boolean eAnio, eMes, eDia;
        eDia = dia<=1;
        eAnio = anio>0;
        eMes = 1 <=mes && mes<=12;
        
        switch(mes){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días.");
                eDia = 1<=dia && dia<=30;
                break;
            case 2:
                if(Bisiesto())
                {
                    System.out.println("El mes tiene 29 días.");
                    eDia = 1<=dia && dia<=29;
                    break;
                }
                else 
                {
                    System.out.println("El mes tiene 28 días.");
                    eDia = 1<=dia && dia<=28;
                    break;
                }
            default:
                eDia = 1<=dia && dia<=31;
                break;      
        }
        existe = new Existencia(eDia, eMes, eAnio);
        return existe;
    }
    
    
    public Siguiente DiaSig(int dia, int mes, int anio)
    {
        Siguiente sig;
        
        dia= dia + 1;
        
        if( DiasXmes(dia, mes, anio).iseDia()== false || DiasXmes(dia, mes, anio).iseMes() == false || DiasXmes(dia, mes, anio).iseAnio()==false)
        {
            dia = 1; 
            mes = mes + 1;
            
            if( DiasXmes(dia, mes, anio).iseDia()== false || DiasXmes(dia, mes, anio).iseMes() == false || DiasXmes(dia, mes, anio).iseAnio()==false)
            {
                mes = 1;
                anio = anio + 1;
            }
        }
       sig = new Siguiente(dia, mes, anio);
       return sig;
    }
}
