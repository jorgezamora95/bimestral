/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="Cliente")
public class Cliente {
    
    @Id
    @Column(name="id_cliente")
    private Long id_cliente;
    @Column(name="nombre")
    private String nombre;
    @Column(name="tarjetas")
    private Integer tarjetas;

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre=" + nombre + ", tarjetas=" + tarjetas + '}';
    }
    

    public Cliente(Long id_cliente, String nombre, Integer tarjetas) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.tarjetas = tarjetas;
    }
    
    

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Integer tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    
}
