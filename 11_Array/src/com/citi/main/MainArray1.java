package com.citi.main;

import com.citi.domain.Application;
import com.citi.domain.Employee;

public class MainArray1 {
	public static void main(String[] args) {
		Employee [] employee = new Employee [5];
		employee[0]= new Employee(101, "Emp1 ", 1000);
		employee[1]= new Employee(102, "Emp2 ", 2000);
		employee[2]= new Employee(103, "Emp3 ", 3000);
		employee[3]= new Employee(104, "Emp4 ", 4000);
		employee[4]= new Employee(105, "Emp5 ", 5000);
		
		Application application = new Application(employee);
		//application.setEmployees(employee);
		application.displayAllEmployee();
	}
}
