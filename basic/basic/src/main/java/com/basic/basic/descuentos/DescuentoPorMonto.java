package com.basic.basic.descuentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DescuentoPorMonto")
public class DescuentoPorMonto implements Descuento{
	
	@Value("${aplicarDescuentoComprasSuperiores.valor}")
    private double monto;
    
    @Value("${porcentajeDescuento.valor}")
    private double porcentajeDescuento;

    @Override
    public double aplicarDescuento(double subtotal) {        
        if (subtotal>=monto)
            return (subtotal*this.porcentajeDescuento);
        else            
            return 0.0;
    }

}
