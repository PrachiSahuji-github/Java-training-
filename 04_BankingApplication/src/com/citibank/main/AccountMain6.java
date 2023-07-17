package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Current;

public class AccountMain6 {
	public static void main(String[] args)   {
		
	    Scanner scanner = new Scanner (System.in);
	    
		int accountNumber;
		double amt;
		double balance;
		String name;
		String option;
		String continueChoice;
		boolean salary;
		double od;
		
		//Create object of Square class
		
		
		System.out.println("Enter Account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Account Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Enter Overdraft amount");
		od = scanner.nextDouble();	
		
		

		
		
			Current current = new Current(accountNumber, name, balance, od);
			
			System.out.println("Account Number = " + current.getAccountNumber());
			System.out.println("Name = " + current.getName());
			System.out.println("Balance =  " + current.getBalance());
			System.out.println("OD =  " + current.getOverdraftBalance());
		
		
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Display Balance");
			System.out.println("Enter your option : ");
			int opt;
			opt = scanner.nextInt();
			switch (opt) {
			case 1: {
				System.out.println("You have selected withdraw, Enter Amount : ");
				amt=scanner.nextDouble();
				if(current.withdraw(amt)) {
					System.out.println("Withdraw successful");
				System.out.println("Balance =  " + current.getBalance());
				System.out.println("OD =  " + current.getOverdraftBalance());
				}
				else
					System.out.println("Withdraw failed!");
				break;			
			}
			case 2: {
				
				System.out.println("You have selected Deposit, Enter Amount : ");
				amt=scanner.nextDouble();
				if(current.deposit(amt)) {
					System.out.println("Deposit successful");
				System.out.println("Balance =  " + current.getBalance());
				System.out.println("OD =  " + current.getOverdraftBalance());
				}
				
				else
					System.out.println("Deposit failed!");
				break;
				
			}
			case 3: {
				
				System.out.println("Balance = " + current.getBalance());
				break;
			}
			default: {
				System.out.println("Invalid Option");}
			 	break;
			}
			System.out.println("Do you want to continue");	
			continueChoice = scanner.next();
			
		} while(continueChoice.equalsIgnoreCase("Yes")); 
		System.out.println("Thank you!");
				
		
	}
		
}
