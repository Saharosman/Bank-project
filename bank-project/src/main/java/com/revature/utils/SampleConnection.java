package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SampleConnection {
	
	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "Kabulgermany1";
	private static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/Bank-Database";

	public static void main(String[] args) {
		// try to register our driver
		try {
			//register a driver to driver manager
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException ex) {
			System.out.println("Could not register");
			ex.printStackTrace();
		}
		
		try {
			
			Connection connection = DriverManager.getConnection(CONNECTION_URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
			System.out.println("Connection is valid " + connection.isValid(5));
		} catch(SQLException ex) {
			System.out.println("Connection attempt falid!");
			ex.printStackTrace();
		}
		
		
	}

}
