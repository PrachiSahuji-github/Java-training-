package com.citi.main;

import java.util.Scanner;

import com.citi.domain.Employee;

public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of Array");
		int size = new Scanner(System.in).nextInt();
		int [] numbers = new int [size];
		int i;
		numbers[0]= 10;
		numbers[1]= 10;
		numbers[2]= 10;
		numbers[3]= 10;
		numbers[4]= 10;
		for (i = 0; i <size ; i++) {
			System.out.println(i);
		}
		Employee [] employee = new Employee [5];
		employee[0]= new Employee(101, "Emp1 ", 1000);
		employee[1]= new Employee(102, "Emp2 ", 2000);
		employee[2]= new Employee(103, "Emp3 ", 3000);
		employee[3]= new Employee(104, "Emp4 ", 4000);
		employee[4]= new Employee(105, "Emp5 ", 5000);
		
		for (Employee employee1 : employee) {
			System.out.println(employee1);
		}
	}

}
