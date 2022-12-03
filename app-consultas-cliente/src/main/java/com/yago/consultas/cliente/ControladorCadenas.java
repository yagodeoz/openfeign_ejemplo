package com.yago.consultas.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "controladorCadenas", url = "${app.client.consulta}")
public interface ControladorCadenas {

	@GetMapping("/consulta")
	public String obtenerDatos();
}
