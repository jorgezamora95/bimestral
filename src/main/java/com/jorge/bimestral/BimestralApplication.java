package com.jorge.bimestral;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BimestralApplication implements CommandLineRunner{
    RepositorioEmpleado repoE;

	public static void main(String[] args) {
		SpringApplication.run(BimestralApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        Departamento d=new Departamento(1l, "Sistemas");
       
       
        
        
        

    }
}
