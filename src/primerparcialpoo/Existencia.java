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
public class Existencia {
    boolean eAnio;
    boolean eMes;
    boolean eDia;


    public Existencia(boolean eAnio, boolean eMes, boolean eDia) {
        this.eAnio = eAnio;
        this.eMes = eMes;
        this.eDia = eDia;
    }

    public boolean iseAnio() {
        return eAnio;
    }

    public void seteAnio(boolean eAnio) {
        this.eAnio = eAnio;
    }

    public boolean iseMes() {
        return eMes;
    }

    public void seteMes(boolean eMes) {
        this.eMes = eMes;
    }

    public boolean iseDia() {
        return eDia;
    }

    public void seteDia(boolean eDia) {
        this.eDia = eDia;
    }

    
    
}
