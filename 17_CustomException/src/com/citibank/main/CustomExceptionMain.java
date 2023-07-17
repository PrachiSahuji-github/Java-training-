package com.citibank.main;

import com.citibank.domain.Employe;
import com.citibank.exception.InvalidEmployeeSalaryException;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Employe empployee = new Employe(101, "Prachi", -2);
//		} catch (InvalidEmployeeSalaryException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//
//		System.out.println("-----------------------------");
//		Employe employee2 = new Employe();
//		try {
//			employee2.setSalary(-1);
//		} catch (InvalidEmployeeSalaryException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		
	Employe employee = new Employe(101, "Prachi", -100);
	
	}

}
