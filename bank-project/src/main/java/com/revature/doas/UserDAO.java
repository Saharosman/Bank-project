package com.revature.doas;

public interface UserDAO {
	
	// login 
	public void login(String userName, String password);
	
	// register a new user
	public void register(String name, String lastName, String DOB, int SSN, String address);
	
	// view balance
	public double viewBalance(int account_id);
	
	// deposit money
	public double depositMoney(double amount, int account_id);
	
	// withdraw money
	public double withdrawMoney(double amount, int account_id);
	
	// transfer money 
	public double transferMoney(double amount, int account_id1, int account_id2);
	
	

}
