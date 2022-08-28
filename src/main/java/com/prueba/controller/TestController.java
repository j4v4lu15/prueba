package com.prueba.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.EntradaTest;

@RestController
@RequestMapping("/monitoreo")
public class TestController {
	
	@PostMapping("/test")
	public HashMap<String, String> test (@RequestBody EntradaTest jsonRequest) {
		jsonRequest.getNumero();
		jsonRequest.getStatus();
		jsonRequest.getVersion();
		HashMap<String, String> test = new HashMap<>();
		test.put("codigo", jsonRequest.getNumero());
		test.put("Status", jsonRequest.getStatus());
		test.put("version", jsonRequest.getVersion());
		
		//Prueba git descarga
		//Prueba 2da vez
		return test;
		
		
	}
	
	

}
