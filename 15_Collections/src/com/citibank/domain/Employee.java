package com.citibank.domain;

import java.util.Objects;

public class Employee {
	private int employeeID;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String name, double salary) {
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("in hashcode");
		return Objects.hash(employeeID, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeID == other.employeeID && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
}
