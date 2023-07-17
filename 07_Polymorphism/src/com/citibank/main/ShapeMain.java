package com.citibank.main;

import com.citibank.domain.*;

import com.citibank.factory.ShapesFactory;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args)   {
		Shapes shapess = null;
		Scanner scanner = new Scanner(System.in);
		int shapechoice;
		System.out.println("Menu");
		System.out.println("1.Circle");
		System.out.println("2.Traingle");
		System.out.println("3. Line");
		System.out.println("Enter your choice");
		shapechoice = scanner.nextInt();

		ShapesFactory factory  = new ShapesFactory();
		shapess  = factory.createShape(shapechoice);
		if (shapess != null) {
			shapess.draw();
		} else {
			System.out.println("Invalid choice of shape");
		}
		
	}

}
