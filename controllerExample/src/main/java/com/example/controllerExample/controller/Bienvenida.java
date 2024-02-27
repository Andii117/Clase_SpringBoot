package com.example.controllerExample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bienvenida {

	@Value("${bienvenida.mensaje}")
	private String mensaje;
	private List<String> datos = Arrays.asList("A1","A2","A3");
	
	@GetMapping("/bienvenida")
	public String main(Model model) {
		model.addAttribute("mensaje", this.mensaje);
		model.addAttribute("datos", this.datos);
		
		return "bienvenida"; //view
		
	}
	
	@GetMapping("/a")
	public String main2(Model model) {
		model.addAttribute("mensaje", this.mensaje);
		model.addAttribute("datos", this.datos);
		
		return "bienvenida"; //view
		
	}
}
