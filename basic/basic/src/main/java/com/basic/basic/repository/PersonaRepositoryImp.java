package com.basic.basic.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepositoryImp implements IPersonaRepository {

	private static Logger cadenaLog = LoggerFactory.getLogger(PersonaRepositoryImp.class);
    
    @Override
    public void registrar(String nombre) {
        cadenaLog.info("Registrando a: " + nombre);
    }    
}
