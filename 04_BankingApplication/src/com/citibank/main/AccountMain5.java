package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Savings;

public class AccountMain5 {
	public static void main(String[] args)   {
		
	    Scanner scanner = new Scanner (System.in);
	    
		int accountNumber;
		double amt;
		double balance;
		String name;
		String option;
		String continueChoice;
		boolean salary;
		
		//Create object of Square class
		
		
		System.out.println("Enter Account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Account Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
			
		
		System.out.println("Do you want to open salary account?");
		option = scanner.next();
		
		if (option.equalsIgnoreCase("Yes")) {
			salary = true; 
		}
			else	{
				salary = false; 
			}
		
		
			Savings savings = new Savings(accountNumber, name, balance, salary);
			System.out.println("Account Number = " + savings.getAccountNumber());
			System.out.println("Name = " + savings.getName());
			System.out.println("Balance =  " + savings.getBalance());
		
		
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
				if(savings.withdraw(amt))
					System.out.println("Withdraw successful");
				else
					System.out.println("Withdraw failed!");
				break;			
			}
			case 2: {
				
				System.out.println("You have selected Deposit, Enter Amount : ");
				amt=scanner.nextDouble();
				if(savings.deposit(amt))
					System.out.println("Deposit successful");
				else
					System.out.println("Deposit failed!");
				break;
				
			}
			case 3: {
				
				System.out.println("Balance = " + savings.getBalance());
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
