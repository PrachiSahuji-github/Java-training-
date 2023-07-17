package com.citibank.main;

import com.citibank.domain.Calculation;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation divideCal = (double n1, double n2) -> {
		return n1/n2;
		};
		
	double result = divideCal.doCalculation(100, 10);
	System.out.println("Divide result is : " +result);

	Calculation addCal = (double n1, double n2) -> {
		return n1+n2;
	};
	result = addCal.doCalculation(20, 20);
	System.out.println("Addition result is : " +result);
	
	
	Calculation subCal = (double n1, double n2) -> n1- n2;
	result = subCal.doCalculation(50, 30);
	System.out.println("Subtract result is : "  +result);
	
	Calculation mulCal = (n1,n2) -> n1 * n2;
	result = mulCal.doCalculation(10, 80);
	System.out.println("Multiply result is: " +result);
	
	
}
}