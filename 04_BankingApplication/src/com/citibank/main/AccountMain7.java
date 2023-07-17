package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.*;
import com.citibank.factory.accountFactory;


public class AccountMain7 {
	public static void main(String[] args)   {
		int accountNumber;
		double amt;
		double balance;
		String name;
		
		String continueChoice;
		boolean isSalary;
		double overdraftBalance;
		
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		int accchoice;
		System.out.println("Menu");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		
		System.out.println("Enter your account choice");
		accchoice = scanner.nextInt();
		
		System.out.println("Enter Account number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Account Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		
		accountFactory factory  = new accountFactory();
		
		
		switch (accchoice) {
		case 1:
			System.out.println("Do you want to open salary account?");
			isSalary = scanner.nextBoolean();
			account  = factory.createAcc(accchoice, accountNumber, name, balance, isSalary, 0);
			break;
		case 2:
			System.out.println("Enter overdraft balance");
			overdraftBalance = scanner.nextDouble();
			account  = factory.createAcc(accchoice, accountNumber, name, balance, false , overdraftBalance);
			break;
		default:
			System.out.println("Invalid choice");
		
			}
	
		System.out.println("Account opened successfully");
		if (account instanceof Savings) {
			System.out.println("Account Type :: Savings");
			System.out.println("Account Number = " + account.getAccountNumber());
			System.out.println("Name = " + account.getName());
			System.out.println("Balance =  " + account.getBalance());
			System.out.println("is Salary account :: " + (((Savings) account).isSalary()));
		}
		else {
			System.out.println("Account ");
			System.out.println("Account Number = " + account.getAccountNumber());
			System.out.println("Name = " + account.getName());
			System.out.println("Balance =  " + account.getBalance());
			System.out.println("OverdraftBalance :: " + ((Current) account).getOverdraftBalance());
			
		}
		
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
				if(account.withdraw(amt)) {
				System.out.println("Withdraw successful");
				System.out.println("Balance =  " + account.getBalance());
				}
				else
					System.out.println("Withdraw failed!");
				break;			
			}
			case 2: {
				
				System.out.println("You have selected Deposit, Enter Amount : ");
				amt=scanner.nextDouble();
				if(account.deposit(amt)) {
					System.out.println("Deposit successful");
				System.out.println("Balance =  " + account.getBalance());
				if (account instanceof Current)
				System.out.println("OD =  " + ((Current) account).getOverdraftBalance());
				}
				
				else
					System.out.println("Deposit failed!");
				break;
				
			}
			case 3: {
				if (accchoice == 2) {
				System.out.println("OD =  " + ((Current) account).getOverdraftBalance());
				}
				else System.out.println("Balance = " + account.getBalance());
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
