package com.citibank.factory;

import com.citibank.domain.*;

import com.citibank.factory.accountFactory;

import java.util.Scanner;


public class accountFactory {
	
	public Account createAcc(int accchoice, int accountNumber, String name, double balance, boolean isSalary, double overdraftBalance) {
		switch (accchoice) {
		case 1:
			return new Savings(accountNumber, name, balance , isSalary);
		case 2:
			return new Current(accountNumber, name, balance, overdraftBalance);
		}
		return null;
	}
	
	

}
