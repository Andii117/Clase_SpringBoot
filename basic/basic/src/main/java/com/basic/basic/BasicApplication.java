package com.basic.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.basic.basic.descuentos.Descuento;
import com.basic.basic.entidades.Persona1;
import com.basic.basic.services.IPersonaService;

@SpringBootApplication
public class BasicApplication implements CommandLineRunner{
	
	private static Logger logCadena = LoggerFactory.getLogger(BasicApplication.class);
	
	@Autowired
    private ClaseA objetoClaseA;
    @Autowired
    private ClaseB objetoClaseB;
    @Autowired
    private ClaseC objetoClaseC;
    @Autowired
    private ClaseD objetoClaseD;
    @Autowired
    private ClaseA otroObjetoClaseA;
    @Autowired
    private ClaseB otroObjetoClaseB;    
    
    @Autowired
    private ClaseD otroObjetoClaseD;
    
    @Autowired
    private ClaseA1 claseA1;
    @Autowired
    private ClaseC1 claseC1;    
    
    @Autowired
    Persona persona;    
    @Autowired
    Bicicleta bicicleta;
    
    @Autowired
    private IPersonaService personaService;
    
    
    @Autowired
    Persona1 persona1;        

    @Autowired
    @Qualifier("Estudiante")
    Persona estudiante;        
    @Autowired
    @Qualifier("Empleado")
    Persona empleado;

    @Autowired
    @Qualifier("DescuentoPorMonto")
    Descuento descuentoPorValorCompra;
    @Autowired
    @Qualifier("DescuentoPorPorcentaje")        
    Descuento descuentoPorPorcentaje;

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logCadena.info("Inicio del programa");
		logCadena.info("\t\tEjecucion del programa");
		logCadena.info("Fin del programa");
		
		 System.out.println("***********************************************");           
	        logCadena.info("Información objetoClaseA:" + objetoClaseA.informacion());
	        logCadena.info("Información objetoClaseB:" + objetoClaseB.informacion());
	        
	        logCadena.info("Dirección de memoria del objetoClaseA:" + objetoClaseA.toString());
	        logCadena.info("Dirección de memoria del objetoClaseB:" + objetoClaseB.toString());
	        logCadena.info("Información objetoClaseC:" + objetoClaseC.informacion());
	        logCadena.info("Información objetoClaseD:" + objetoClaseD.informacion());
	        logCadena.info("Dirección de memoria del objetoClaseD:" + objetoClaseD.toString());
	        
	        logCadena.info("Dirección de memoria del objetoClaseA:" + otroObjetoClaseA.toString());
	        logCadena.info("Dirección de memoria del objetoClaseB:" + otroObjetoClaseB.toString());
	        
	        logCadena.info("Información objetoClaseD:" + otroObjetoClaseD.informacion());
	        logCadena.info("Dirección de memoria del objetoClaseD:" + otroObjetoClaseD.toString());
	        
	        System.out.println("***********************************************");
	        
	        
	        logCadena.info("ClaseA-->" + this.claseA1.metodoClaseA1());         
	        logCadena.info("ClaseC-->" + this.claseC1.metodoClaseC1()); 
	        logCadena.info("ClaseC-->" + this.claseC1.metodoClaseCqueLlamaClaseA() ); 
	        
	        logCadena.info("persona-->" + this.persona.toString()); 
	        
	        this.persona.setApellidos("Morales");
	        this.persona.setNombres("Juan");        
	        logCadena.info("persona-->" + this.persona.toString()); 
	        
	        logCadena.info("bicicleta-->" + this.bicicleta.toString());
	        
	        logCadena.info("********Inicio********");        
	        this.personaService.registrar("Harold Andres Jara G");        
	        logCadena.info("********Fin********");
	        
	        
	        logCadena.info("---Inicio---");

	         this.persona1.setApellidos("Morales");
	         this.persona1.setNombres("Juan");
	         logCadena.info("persona-->" + this.persona1.toString()); 

	         this.estudiante.setApellidos("Castro");
	         this.estudiante.setNombres("Ricardo");
	         logCadena.info("estudiante-->" + this.estudiante.toString()); 


	         this.empleado.setApellidos("Romero");
	         this.empleado.setNombres("Camilo");
	         logCadena.info("empleado-->" + this.empleado.toString());            

	         logCadena.info("Descuento por compra de $1000.0 -->" + descuentoPorValorCompra.aplicarDescuento(1000.0) );     
	         logCadena.info("Descuento por % -->" + descuentoPorPorcentaje.aplicarDescuento(1000.0) );     

	         logCadena.info("---Fin---");
	        
	}
	
	
	

}
