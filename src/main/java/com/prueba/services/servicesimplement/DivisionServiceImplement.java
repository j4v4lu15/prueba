package com.prueba.services.servicesimplement;

import org.springframework.stereotype.Service;

import com.prueba.services.OperacionServiceDivision;

@Service
public class DivisionServiceImplement implements OperacionServiceDivision {

	@Override
	public int division(int num1, int num2) {
		int num3;
		num3=num1/num2;
		return num3;
	}

}
