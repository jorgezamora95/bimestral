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
@Table(name="Boleto")
public class Boleto {
    @Id
    @GeneratedValue
    @Column(name="id_boleto") 
    private Long id_boleto;
    
    @ManyToOne
    @JoinColumn(name="id_sala")
    private SalaCine sala;
    
    @Column(name="CostoBoleto")
    private Float costo;

    public Boleto() {
    }

    @Override
    public String toString() {
        return "Boleto{" + "id_boleto=" + id_boleto + ", sala=" + sala + ", costo=" + costo + '}';
    }
    

    public Boleto(Long id_boleto, SalaCine sala, Float costo) {
        this.id_boleto = id_boleto;
        this.sala = sala;
        this.costo = costo;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Long getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(Long id_boleto) {
        this.id_boleto = id_boleto;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }
    
}
