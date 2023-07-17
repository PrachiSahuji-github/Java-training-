package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMain4 {
	public static void main(String[] args)   {
		System.out.println("Main start");
	    Scanner scanner = new Scanner (System.in);
	    Account account;
		int accountNumber;
		double amt;
		String name;
		String continueChoice;
		
		//Create object of Square class
		
		
		System.out.println("Enter Account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Account Name");
		name = scanner.nextLine();
				
		account = new Account(accountNumber, name);
		System.out.println("Account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance =  " + account.getBalance());
		
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
				if(account.withdraw(amt))
					System.out.println("Withdraw successful");
				else
					System.out.println("Withdraw failed!");
				break;			
			}
			case 2: {
				
				System.out.println("You have selected Deposit, Enter Amount : ");
				amt=scanner.nextDouble();
				if(account.deposit(amt))
					System.out.println("Deposit successful");
				else
					System.out.println("Deposit failed!");
				break;
				
			}
			case 3: {
				
				System.out.println("Balance = " + account.getBalance());
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
