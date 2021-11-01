package com.revature.models;

public class SavingAccount extends BankAccount{
	
	private double interest;
	
	public SavingAccount(int balance, int accountNumber, double interest, String type) {
		super(balance, accountNumber, type);
		this.interest = interest;
	}
	
	// getter
	public double getInterset() {
		return interest;
	}
	
	// setter
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	// calculate the interest
	
}
