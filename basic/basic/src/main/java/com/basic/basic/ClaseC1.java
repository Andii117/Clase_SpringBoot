package com.basic.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClaseC1 {

	
	@Autowired
    private ClaseB1 claseB1;
    
	@Autowired
    private ClaseA1 claseA1;
    
    public ClaseC1(@Autowired ClaseA1 claseA1) {
        this.claseA1 = claseA1;
    }
    
    public String metodoClaseC1() {
           return "Método de la ClaseC que llama a: " 
                   + this.claseB1.metodoClaseB1();
    }  
    
    public String metodoClaseCqueLlamaClaseA() {
           return "Método de la ClaseC que llama a: " 
                   + this.claseA1.metodoClaseA1();
    }  
}
