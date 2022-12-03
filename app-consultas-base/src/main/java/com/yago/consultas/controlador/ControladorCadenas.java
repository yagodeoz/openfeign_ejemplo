package com.yago.consultas.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/datos")
public class ControladorCadenas {

	@GetMapping("/consulta")
	public String obtenerDatos () {
		return "Soy Byron Segovia";
	}
	
}  
