package com.prueba.controller.operaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.EntradaDivision;
import com.prueba.services.OperacionServiceDivision;

@RestController
@RequestMapping("/operaciondivision")
public class OperacionDivision {
	@Autowired
	private OperacionServiceDivision operaciondivision;
	
	@PostMapping("/division")
	
	public int division(@RequestBody EntradaDivision reqDivision) {
		
		int resultado=operaciondivision.division(reqDivision.getNum1(), reqDivision.getNum2());
		return resultado;
			
	}
}
