/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.bimestral;

import java.util.Date;
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
@Table(name="Tarjetas")
public class Tarjetas {
    @Id
    @GeneratedValue
    @Column(name="id_tarjetas")
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente id_cliente;
    private Long id_tarjetas;
    @Column(name="tipo")
    private String tipo;
    @Column(name="saldo")
    private Float saldo;
    @Column(name="fecha_corte")
    private Date fechar_corte;

    public Tarjetas() {
    }

    Tarjetas(Long id_tarjeta, String tipo, Float saldo, Date fecha_corte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Tarjetas(String tipo, Float saldo, Date fechaCorte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Tarjetas{" + "id_cliente=" + id_cliente + ", id_tarjetas=" + id_tarjetas + ", tipo=" + tipo + ", saldo=" + saldo + ", fechar_corte=" + fechar_corte + '}';
    }

    public Tarjetas(Cliente id_cliente, Long id_tarjetas, String tipo, Float saldo, Date fechar_corte) {
        this.id_cliente = id_cliente;
        this.id_tarjetas = id_tarjetas;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechar_corte = fechar_corte;
    }
    

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_tarjetas() {
        return id_tarjetas;
    }

    public void setId_tarjetas(Long id_tarjetas) {
        this.id_tarjetas = id_tarjetas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Date getFechar_corte() {
        return fechar_corte;
    }

    public void setFechar_corte(Date fechar_corte) {
        this.fechar_corte = fechar_corte;
    }
    
    
    
}
