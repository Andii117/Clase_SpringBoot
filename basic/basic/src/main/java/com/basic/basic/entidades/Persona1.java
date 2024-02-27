package com.basic.basic.entidades;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Persona1")
public class Persona1 {
	
	 	protected String nombres;
	    protected String apellidos;   

	    public void setNombres(String nombres) {
	        this.nombres = nombres;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }
	    
	    @Override
	    public String toString() {
	        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
	    }    

}
