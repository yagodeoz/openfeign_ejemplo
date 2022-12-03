package com.yago.consultas.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yago.consultas.cliente.ControladorCadenas;

@Service
public class ServicioConsulta {

	@Autowired
	private ControladorCadenas apiCadena;
	
	
	public String consumoClienteCadena()
	{
		return apiCadena.obtenerDatos();
	}
	
	
}
