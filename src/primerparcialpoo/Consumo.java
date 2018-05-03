/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Consumo {
    //ATRIBUTOS
    private String idConsumo;
    private float Total;
    private String FechaServicio;
    private int HorasServicio;
    
    //CONTRUCTOR

    public Consumo() {
        
    }
    
    //SETTER AND GETTER

    public String getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(String idConsumo) {
        this.idConsumo = idConsumo;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public String getFechaServicio() {
        return FechaServicio;
    }

    public void setFechaServicio(String FechaServicio) {
        this.FechaServicio = FechaServicio;
    }

    public int getHorasServicio() {
        return HorasServicio;
    }

    public void setHorasServicio(int HorasServicio) {
        this.HorasServicio = HorasServicio;
    }
    
    
}
