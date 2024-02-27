package com.example.controllerExample.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.controllerExample.entidades.PersonaDTO;

@Controller
public class Ejemplos {	

	
	@Autowired
	PersonaDTO personaDTO;
	
	ArrayList<PersonaDTO> listado = new ArrayList();
	
	@RequestMapping("/url")
	public String page(Model model) {
		model.addAttribute("Attribute","value");
		listado.add(personaDTO);
		return "view.name";
	}
	
	@RequestMapping("/objeto")
	public String objeto(Model model) {
		model.addAttribute("objeto",personaDTO);
		listado.add(personaDTO);
		return "objeto";
	}
	
	@RequestMapping("/listado")
	public String listado(Model model) {
		model.addAttribute("listado",listado);
		listado.add(personaDTO);
		return "Objeto_listado";
	}
}
