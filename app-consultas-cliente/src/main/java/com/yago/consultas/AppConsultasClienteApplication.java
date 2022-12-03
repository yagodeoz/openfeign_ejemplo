package com.yago.consultas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppConsultasClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConsultasClienteApplication.class, args);
	}

}
