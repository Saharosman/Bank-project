package com.revature.models;

public abstract class BankAccount {
	
	private double balance;
	private int accountNumber;
	private String type;
	
	public BankAccount(double balance, int accountNumber, String type) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
	}
	
	// getters
	public int getBalance() {
		return balance;
	}
	
	public int getaccountNum() {
		return accountNumber;
	}
	
	public String gettype() {
		return type;
	}

}
