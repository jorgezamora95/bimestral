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
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControladorTarjeta {
    @Autowired RepositorioCliente repoTar;
    
    
      @RequestMapping(value="/tarjetas/{id_tarjeta}/{tipo}/{saldo}/{fechaCorte}",method=RequestMethod.POST,
            headers={"Accept=application/json"})
    
    public Tarjetas guardar (@PathVariable String tipo,@PathVariable Float saldo,@PathVariable Date fechaCorte){
                
                return repoTar.save(new Tarjetas(tipo,saldo,fechaCorte));
            }
    
    
    //metodo GET o en operaciones crud read(select)
      @RequestMapping(value="/tarjeta/{id_tarjeta}",method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public Cliente buscarIdTarjeta (@PathVariable Long id_tarjeta){
                
                return repoTar.findOne(id_tarjeta);
            }
    
 
      @RequestMapping(value="/tarjeta/{id_tarjeta}/{tipo}/{saldo}/{fecha_corte}",method=RequestMethod.PUT,
            headers={"Accept=application/json"})
    
    public Tarjetas actualizar (@PathVariable Long id_tarjeta,@PathVariable String tipo,@PathVariable Float saldo,
            @PathVariable Date fecha_corte){
                System.out.println("actualizacion exitosa");
                return repoTar.save(new Tarjetas(id_tarjeta,tipo,saldo,fecha_corte));
            }
    
    

    
     
}
