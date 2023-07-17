package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Square;


public class SquareMain {
	public static void main(String[] args)   {
		
		//Create object of Square class
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		System.out.println("Number entered :" + number);
		Square square = new Square();
		int result = square.calculateSquare(number);
		System.out.println("Square of  " + number +  " is " + result);
		
	}
}
