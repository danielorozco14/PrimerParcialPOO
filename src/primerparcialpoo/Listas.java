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
public class Listas {
    private String[][] listaI;
    private String[][] listaP;
    private String[][] lista;

    public Listas(String[][] listaI, String[][] listaP, String[][] lista) {
        this.listaI = listaI;
        this.listaP = listaP;
        this.lista = lista;
    }

    public String[][] getListaI() {
        return listaI;
    }

    public void setListaI(String[][] listaI) {
        this.listaI = listaI;
    }

    public String[][] getListaP() {
        return listaP;
    }

    public void setListaP(String[][] listaP) {
        this.listaP = listaP;
    }

    public String[][] getLista() {
        return lista;
    }

    public void setLista(String[][] lista) {
        this.lista = lista;
    } 
}
