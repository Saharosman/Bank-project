package com.revature.models;

public class User extends Person {
	
	// fields
	
	private int DOB;
	private int SSN;
	private String address;
	
	
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
