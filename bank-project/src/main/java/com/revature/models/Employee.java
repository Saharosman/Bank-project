package com.revature.models;

public class Employee extends Person{
	
	// Field
	private int employee_id;
	
	public Employee(String first_name, String last_name, String User_name, String password, int employee_id) {
		super(first_name, last_name, User_name, password);
		this.employee_id = employee_id;
	}


	// getter
	public int getEmployee_id(){
		return employee_id;
	}
}
