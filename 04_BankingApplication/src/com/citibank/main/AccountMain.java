package com.citibank.main;

import java.util.Scanner;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMain {
	public static void main(String[] args)   {
		Scanner scanner = new Scanner (System.in);
		
		//Create object of Square class
		
		System.out.println("Main start");
		Account account = new Account();
		//System.out.println("Enter Account number");
		//int accnum = scanner.nextInt();
		//int accnum1 = scanner.nextInt();
		//account.setAccountNumber(accnum);
		//account.setAccountNumber(accnum1);
		account.setAccountNumber(101);
		account.setName("Prachi Sahuji");
		account.setBalance(1000);
		
		System.out.println("Account Number = " + account.getAccountNumber());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance =  " + account.getBalance());
		

		
		Account account1 = new Account();
		account1.setAccountNumber(102);
		account1.setName("Vivek Jain");
		account1.setBalance(2000);
		
		System.out.println("Account Number = " + account1.getAccountNumber());
		System.out.println("Name = " + account1.getName());
		System.out.println("Balance =  " + account1.getBalance());
		
		
		
		System.out.println("Main End");
		
	}
}
