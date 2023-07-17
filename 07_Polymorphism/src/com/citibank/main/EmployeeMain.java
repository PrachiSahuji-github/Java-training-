package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args)   {
		Employee employee = new Employee(101, "Prachi Jain", 2000);
		Employee employee2 = new Employee(102, "Vivek Jain", 3000);
		
		System.out.println(employee.toString());
		System.out.println("hashcode of employee = " + employee.hashCode());
		
		System.out.println(employee2.toString());
		System.out.println("hashcode of employee2 = " + employee2.hashCode());
		
		//Employee e = null;
		Employee e = new Employee(103, "Abhi Jain", 5000);
		
		System.out.println(e);
		System.out.println(e.hashCode());
		
		Employee e2 = new Employee(104, "Pooja Jain", 6000);
		e2 = e;
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		String s = "Hi";
		String s2 = "Hi";
		System.out.println(s.equals(s2));
		
		Employee e4 = new Employee(105, "X", 100);
		Employee e5 = new Employee(105, "X", 100);
		System.out.println(e4.equals(e5));
		
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
	}

}
