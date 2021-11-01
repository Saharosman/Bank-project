package com.revature.models;

public class User extends Person {
	
	// fields
		private int DOB;
		private int SSN;
		private String address;
		
		
	
	public User(String first_name, String last_name, String User_name, String password, int SSN, int DOB, String address) {
		super(first_name, last_name, User_name, password);
		this.DOB = DOB;
		this.SSN = SSN;
		this.address = address;
	}
	
	public User() {
		super(null, null, null, null);
	}
	
	// setters
	public void setDOB(int dOB) {
		this.DOB = dOB;
	}
	public void setSSN(int sSN) {
		this.SSN = sSN;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	// getters
	public int getSSN() {
		return SSN;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getDOB() {
		return DOB;
	}

	
	
	

}
