/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.bimestral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
public class ControladorCliente {
    @Autowired RepositorioCliente repoc;
    
    @RequestMapping(value="/Cliente/{id_cliente}/{nombre}/{tarjetas}",
            method=RequestMethod.POST, headers={"Accept=application/json"})
    public Cliente guardar(@PathVariable Long id_cliente,@PathVariable String nombre,@PathVariable Integer tarjetas){
     
        return repoc.save(new Cliente(id_cliente,nombre,tarjetas));
    }
    @RequestMapping(value="/Cliente/{id_cliente}/{nombre}/{tarjetas}}",
            method=RequestMethod.PUT, headers={"Accept=application/json"})
    public Cliente actualizar (@PathVariable Long id_cliente,@PathVariable String nombre,@PathVariable Integer tarjetas){
     
        return repoc.save(new Cliente(id_cliente,nombre,tarjetas));
    }
     @RequestMapping(value="/Cliente/{Tarjetas}", method=RequestMethod.GET, 
            headers = {"Accept=application/json"})
    public Cliente buscarPorTarjeta(@PathVariable Long Tarjetas){
        
        return repoc.findOne(Tarjetas);
    }
}
