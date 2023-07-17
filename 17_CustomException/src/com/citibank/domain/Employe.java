package com.citibank.domain;

import com.citibank.exception.InvalidEmployeeSalaryException;

public class Employe {
	private int employeeID;
	private String name;
	private double salary;
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(int employeeID, String name, double salary) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		if (salary <0) 
			throw new InvalidEmployeeSalaryException();
		else
			this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary)  {
		
		if (salary < 0)
			throw new InvalidEmployeeSalaryException();
		else
			this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
