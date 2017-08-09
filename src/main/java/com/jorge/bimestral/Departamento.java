/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author T-
 */
@Entity
@Table(name="departamento")

public class Departamento {
    
   @Id
   @GeneratedValue
   private Long id;
   @Column(name="nombre")
   private String nombre;

    public Departamento() {
    }

    public Departamento(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
