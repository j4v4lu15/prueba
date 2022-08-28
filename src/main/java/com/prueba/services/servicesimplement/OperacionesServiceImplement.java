package com.prueba.services.servicesimplement;

import org.springframework.stereotype.Service;

import com.prueba.services.OperacionesService;
@Service
public class OperacionesServiceImplement implements OperacionesService {

	public boolean suma (String cadena) {
		
		int num;
		
		try {
			
			num =Integer.parseInt(cadena);
			return true;
			
		} 
		catch(Exception e) 
		{
			return false;
		
		}
	}
		
	
	 public int suma(int num1 , int num2) {
		 int num3;
		 num3=num1+num2;
		 return num3;
		 
	 }

		public boolean resta (String cadena) {
			
			int num;
			
			try {
				
				num =Integer.parseInt(cadena);
				return true;
				
			} 
			catch(Exception e) 
			{
				return false;
			
			}
		}
	public int resta(int num1, int num2) {
		int num3;
		num3=num1-num2;
		return num3;
	}
	
	
	}	
	