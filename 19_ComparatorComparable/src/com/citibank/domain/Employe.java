package com.citibank.domain;

import java.util.Comparator;

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
			this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + "]";
	}

	//@Override
	//public int compareTo(Employe e) {
		// TODO Auto-generated method stub
		//int diff = employeeID - e.getEmployeeID(); sort Ascending
		//System.out.println(employeeID);
		//int diff = e.getEmployeeID() - employeeID; sort Descending 
	
		//int diff = name.compareTo(e.getName());  sort ascedning 
	//	int diff = e.getName().compareTo(name);
	//	return diff;
	//}

	
	
	
	

}
