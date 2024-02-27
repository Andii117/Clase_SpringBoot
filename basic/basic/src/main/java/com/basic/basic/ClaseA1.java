package com.basic.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClaseA1 {

	@Autowired
	private ClaseB1 claseB1;

    public ClaseA1(@Autowired ClaseB1 claseB1) {
        this.claseB1 = claseB1;
    }
    public String metodoClaseA1() {
          return "Método de la ClaseA que llama a: " 
                  + this.claseB1.metodoClaseB1();
    }  
}
