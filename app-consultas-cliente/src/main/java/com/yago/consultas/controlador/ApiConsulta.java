package com.yago.consultas.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yago.consultas.servicios.ServicioConsulta;

@RestController
@RequestMapping("/apigateway")
public class ApiConsulta {

	@Autowired
	private ServicioConsulta servicio;

	@GetMapping("/consulta")
	public String consultaCliente() {
		return "Datos consumidos desde el cliente " + servicio.consumoClienteCadena();

	}

}
