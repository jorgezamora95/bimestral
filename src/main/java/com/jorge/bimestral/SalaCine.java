/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.bimestral;

/**
 *
 * @author T-
 */
public class SalaCine {
    
    private int id_sala;
    private String tituloPelicula;
  private String clasificacion;
   private int num_asientos;

    public SalaCine(int id_sala, String tituloPelicula, String clasificacion, int num_asientos) {
        this.id_sala = id_sala;
        this.tituloPelicula = tituloPelicula;
        this.clasificacion = clasificacion;
        this.num_asientos = num_asientos;
    }

    public SalaCine() {
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }
   
    
    
    
}
