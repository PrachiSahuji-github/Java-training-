package com.citibank.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	//private List<Employee> employeeList = new ArrayList<>();
	private Set<Employee> employeeSet = new HashSet<>();
	
	public boolean addNewEmployee(Employee employee) {
		return employeeSet.add(employee);
	}
	
	public Set<Employee> getAllEmployee() {
		return employeeSet;
	}
	
	public Employee singleEmployee(int empID){
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeID() == empID) {
				return employee;
			}
		}
		return null;
	    
	}
	public boolean updateSalary(int empID, double newSal) {
		for (Employee employee : employeeSet) {
			if (employee.getEmployeeID() == empID) {
				employee.setSalary(newSal);
				return true;
			}
		}
		return false;	
	}
	public boolean deleteEmpl(int empID) {
		for (Employee employee : employeeSet) {
		if (employee.getEmployeeID() == empID) {
				employeeSet.remove(employee);
				return true;
		}
		
	}
		return false;
}
}