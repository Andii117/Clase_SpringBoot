package com.example.controllerExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Saludo {

	@GetMapping("/saludo")
	public String saludo(@RequestParam(name = "nombre", required = false, defaultValue = "Unillanos") String name,
			Model model) {
		model.addAttribute("nombre", name);
		return "saludo";
	}
}
