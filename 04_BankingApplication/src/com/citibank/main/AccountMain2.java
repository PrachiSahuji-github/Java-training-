package com.citibank.main;

import java.util.Scanner;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMain2 {
	public static void main(String[] args)   {
		Scanner scanner = new Scanner (System.in);
		
		//Create object of Square class
		
		System.out.println("Main start");
		Account account = new Account();
		Account account2 = new Account();
		
		System.out.println("Enter Account number");
		int accnum = scanner.nextInt();
		int accnum1 = scanner.nextInt();
		account.setAccountNumber(accnum);
		account2.setAccountNumber(accnum1);
		
		System.out.println("Enter Account Name");
		String name1 = scanner.next();
		String name2 = scanner.next();
		account.setName(name1);
		account2.setName(name2);
		
		System.out.println("Enter Balance");
		double bal1 = scanner.nextDouble();
		double bal2 = scanner.nextDouble();
		account.setBalance(bal1);
		account2.setBalance(bal2);
		
		
		System.out.println("Account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance =  " + account.getBalance());
		
		System.out.println("Account Number = " + account2.getAccountNumber());
		System.out.println("Name = " + account2.getName());
		System.out.println("Balance =  " + account2.getBalance());
		
		System.out.println("Main End");
		
	}
}
