package com.citibank.main;

import com.citibank.domain.Employee;

public class EmpMain {
	static int x = 10;
	public static void main(String[] args)   {
		
		System.out.println(x);
		Employee employee = new Employee( "Prachi Sahuji", 1000);
		Employee employee1 = new Employee( "Vivek Sahuji", 2000);
		Employee employee2 = new Employee( "Abhishek Sahuji", 3000);
		Employee employee3 = new Employee ( "Tejal Sahuji", 4000);
		Employee employee4 = new Employee( "Viany Sahuji", 5000);
		
		System.out.println(employee);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		
		
		
	}

}
