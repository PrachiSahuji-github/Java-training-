package com.citi.domain;

import java.util.Arrays;

public class Application {
	private Employee [] employees;
	
	public Application(Employee[] employees) {
		// TODO Auto-generated constructor stub
		this.employees = employees;
	}
	

	//public void setEmployees(Employee[] employees) {
	//	this.employees = employees;
	//}


	public void displayAllEmployee() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
					
		
	}



}
