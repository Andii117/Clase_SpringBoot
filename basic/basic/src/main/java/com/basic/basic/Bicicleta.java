package com.basic.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bicicleta {
	
	@Value("nacional")
    private String procedencia;
    @Value("10")
    private Integer peso;
    @Value("true")
    private Boolean disponible;
    
    @Value("${bicicleta.color}")
    private String color;    
    @Value("${bicicleta.marca}")
    private String marca;

    @Override
    public String toString() {
        return "Bicicleta{" + "procedencia=" + procedencia + ", peso=" + peso 
                + ", disponible=" + disponible + ", color=" + color 
                + ", marca=" + marca + '}';
    }

}
