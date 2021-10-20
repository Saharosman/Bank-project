package com.revature.models;

public abstract class Person {
	
	// Fields - name and password
	
	private String first_name;
	private String last_name;
	private String User_name;
	private String password;
	
	// setter
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public void setlastname(String last_name) {
		this.last_name = last_name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserName(String User_name) {
		this.User_name = User_name;
	}
	
	
	// getter
	public String getFirstName() {
		return first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getUserName() {
		return User_name;
	}
	
	public String getPassword() {
		return password;
	}

}
