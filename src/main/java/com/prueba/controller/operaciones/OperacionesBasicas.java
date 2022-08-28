package com.prueba.controller.operaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.EntradaResta;
import com.prueba.model.EntradaSuma;
import com.prueba.services.OperacionesService;

@RestController
@RequestMapping("/operacionesbasicas")

public class OperacionesBasicas {
	
	@Autowired
	private OperacionesService operacionesservice;  
	
	
	@PostMapping("/suma")
	public int suma(@RequestBody EntradaSuma requestentrada) {
		int resultado=operacionesservice.suma(requestentrada.getNum1(), requestentrada.getNum2());
		return resultado;
	}
	
	@PostMapping("/resta")
	public int resta (@RequestBody EntradaResta requestentrada) {
		int resultado=operacionesservice.resta(requestentrada.getNum1(), requestentrada.getNum2());
		return resultado;
	}
}
