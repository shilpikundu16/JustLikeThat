package com.lti.junit;

public class Account {
	
	private double  balance;
	public Account() {
	}
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	public double withdraw(double amount) {
		balance-=amount;
		return balance;
	}

}
