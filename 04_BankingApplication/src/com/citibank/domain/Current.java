package com.citibank.domain;

public class Current extends Account {
	private double overdraftBalance;
	double  val;
	double odlimit;
	
	public Current() {
		// TODO Auto-generated constructor stub
	}
	

	public Current(int accountNumber, String name, double balance, double overdraftBalance ) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		odlimit = overdraftBalance;
	}


	public double getOverdraftBalance() {
		
		return overdraftBalance;
	}


	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
		if (amount < getBalance())  {
			setBalance(getBalance() - amount);
			return true;
		}
			
		
		if (amount > getBalance() && amount <= getBalance() + overdraftBalance) {
			val = amount - getBalance();
			setBalance(0);
			setOverdraftBalance(overdraftBalance - val);
			return true;
		}}
		return false;
		
		
	
    }
	
	@Override
	public boolean deposit(double amount) {
		if (amount > 0 ) {
		// TODO Auto-generated method stub
			if (odlimit > overdraftBalance) {
				if (amount < (odlimit - overdraftBalance)) {
				overdraftBalance = overdraftBalance + amount;
				return true;
				}
				else {
					amount = amount - (odlimit - getOverdraftBalance());
					overdraftBalance = odlimit;
					setBalance(getBalance() + amount);
					return true;
				
				}
			}else {
				setBalance(getBalance() + amount);
				return true;
				}
			}else {
				return false;
			}

		
	}
}
