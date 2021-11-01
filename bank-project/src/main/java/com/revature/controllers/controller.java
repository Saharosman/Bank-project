package com.revature.controllers;
import java.util.*;

public class controller {
	
	public static void init() {
		// welcome message
		System.out.println("Wellcome to Sahar's Bank!");
	
		// log in
		Scanner scan = new Scanner(System.in);
		System.out.println("Please use your username and password to login");
		System.out.print("Username :" );
		String input1 = scan.nextLine();
		System.out.print("Password :" );
		String input2 = scan.nextLine();
		
		// view account records
		// have user make decision to choose either saving or checking account 
		System.out.println("Please choose Checking account or Saving account");
		
		// 1) choose a saving account or checking account
		String intput3 = scan.nextLine();
		System.out.println("Your balance is "  );
				 
		// Deposit money or withdraw or go back 
		System.out.println("For deposit press Y, For withdraw money press W, To return back press r");
		String input4 = scan.nextLine();
		
		// 3) logout
		System.out.println("Please press Q to log out.");
		String input5 = scan.nextLine();
		
		// goodbye message
		System.out.println("Thank you for trusting us! Goodbye!");
	}
	

}
