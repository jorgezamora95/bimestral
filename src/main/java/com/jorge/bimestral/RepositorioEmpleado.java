/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorge.bimestral;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author T-
 */
public interface RepositorioEmpleado extends CrudRepository<Empleado, Long>{
    
}
