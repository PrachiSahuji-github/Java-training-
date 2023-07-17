package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMain3 {
	public static void main(String[] args)   {
		System.out.println("Main start");
		
		//Account account = new Account();
		//Account account1 = new Account();
		//Account account2 = new Account();
		
		//Account account;
		//new Account();
		Account account = new Account(101, "Prachi Sahuji", 1000);
		System.out.println(account.getName());
		
		Account account1 = new Account(102, "Vivek Jain");
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getName());
		
		boolean result =  account.deposit(2000);
		if (result) 
		   System.out.println("Transaction success");
		else
			System.out.println("Transaction Failed");
		
		System.out.println("Balance = " + account1.getBalance());
		
		System.out.println("Withdraw  = 10000");
		result = account1.withdraw(10000);
		if (result)
			System.out.println("Transaction success");
		else
			System.out.println("Transaction Failed");
		System.out.println("Balance = " + account1.getBalance());
			
		

		
		
				System.out.println("Main end");
	}

}
