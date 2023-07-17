package com.citibank.domain;

import java.util.Objects;

public class Employee {
	public int employeeID ;
	private String name;
	private double salary;
	private static int employeeIDGenerator = 101 ;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary) {
		super();
		
		this.employeeID = employeeIDGenerator;
		this.name = name;
		this.salary = salary;
		employeeIDGenerator = employeeIDGenerator + 1;
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
	public int hashCode() {
		return Objects.hash(employeeID, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
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

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
