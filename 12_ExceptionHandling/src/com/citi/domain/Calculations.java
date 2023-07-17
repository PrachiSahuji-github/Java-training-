package com.citi.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int num1;
	private int num2;
	private int result;
	
	public void accept() {
		
		try {
		System.out.println("accept() starts");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		System.out.println("accept() Ends");
	}catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid input from user");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}catch (Exception e) {
		System.out.println("Something is wrong!!");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	finally {
		System.out.println("accept() end");
		//scanner.close();
	}
	}
	public int acceptAndcalculate() {
		try {
		System.out.println("acceptandCalculate() starts");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		//System.out.println("accept() Ends");
		
		System.out.println("calculate() starts");
		result = num1 + num2;
		System.out.println("calculate() ends");
		//return result;
		} catch (InputMismatchException e) {
			System.out.println("Invalid input from user");
			System.out.println(e.getMessage());
			e.printStackTrace();
			//return 0;
		}
		finally {
			System.out.println("acceptandCalculate() end");
			//scanner.close();
			//return result;
		}return result;
		
		
	}
	public void display() {
		System.out.println("display() starts");
		System.out.println("Result is : " +result);
		System.out.println("display() ends");
		
	}
}
