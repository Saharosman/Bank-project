package com.revature.doas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

	private Connection connection;
	private PreparedStatement statement;
	
	@Override
	public void login(String userName, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(String name, String lastName, String DOB, int SSN, String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double viewBalance(int account_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositMoney(double amount, int account_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdrawMoney(double amount, int account_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double transferMoney(double amount, int account_id1, int account_id2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private void closeResources() {
		try {
			if(statement != null && !statement.isClosed()) {
				statement.close();
			}
			
		} catch(SQLException ex) {
			System.out.println("Error: could not close resourse");
			ex.printStackTrace();
		}
		
	}

}
