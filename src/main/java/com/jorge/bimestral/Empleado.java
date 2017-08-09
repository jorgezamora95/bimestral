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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 *
 * @author T-
 */
@Entity
@Table(name="empleado")
public class Empleado {
    
    @Id
    @GeneratedValue       
    private Long id;  
    @ManyToOne
    @JoinColumn(name="id_dep")
    private Departamento depa;     
    @Column(name="nombre")
    private String nombre;
    
    private Integer numero_seguro;

    public Empleado() {
    }

    
    public Empleado(Long id, Departamento depa, String nombre, Integer numero_seguro) {
        this.id = id;
        this.depa = depa;
        this.nombre = nombre;
        this.numero_seguro = numero_seguro;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Departamento getDepa() {
        return depa;
    }

    public void setDepa(Departamento depa) {
        this.depa = depa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero_seguro() {
        return numero_seguro;
    }

    public void setNumero_seguro(Integer numero_seguro) {
        this.numero_seguro = numero_seguro;
    }

    
    
    
}
