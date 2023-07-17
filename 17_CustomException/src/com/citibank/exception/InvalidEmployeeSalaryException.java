package com.citibank.exception;

public class InvalidEmployeeSalaryException extends RuntimeException {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Salary must be > 0";
	}
	

}
