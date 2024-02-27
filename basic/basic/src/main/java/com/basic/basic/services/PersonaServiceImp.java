package com.basic.basic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.basic.repository.IPersonaRepository;

@Service
public class PersonaServiceImp implements IPersonaService{

	@Autowired   
    private IPersonaRepository personaRepository;
    
    @Override
    public void registrar(String nombre) {
        personaRepository.registrar(nombre);
    }    
}
