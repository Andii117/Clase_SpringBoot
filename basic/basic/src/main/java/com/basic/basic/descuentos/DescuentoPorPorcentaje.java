package com.basic.basic.descuentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DescuentoPorPorcentaje")
public class DescuentoPorPorcentaje implements Descuento{
	
	  @Value("${porcentajeDescuentoTienda.valor}")
	    private double porcentajeDescuento;

	    public DescuentoPorPorcentaje() { }
	    
	    @Override
	    public double aplicarDescuento(double subtotal) {        
	            return (subtotal*this.porcentajeDescuento);
	    
	    }    

}
