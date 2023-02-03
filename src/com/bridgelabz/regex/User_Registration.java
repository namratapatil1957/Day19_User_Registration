package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_Registration {
	
	Scanner sc = new Scanner (System.in);
	
	// pattern for first name
	
	void fName() {
		
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");	
		
		System.out.println(" Enter the First Name: ");
		String fname = sc.next();
		
		Matcher m = p.matcher(fname);
		
		if (m.find()) {
			System.out.println(" name is valid ");
		}else {
			System.out.println(" name is invalid ");
		}
		
	}
	
	// pattern for last name
	
	void lName() {
			
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");	
			
		System.out.println("\n Enter the Last Name: ");
		String lname = sc.next();
			
		Matcher m = p.matcher(lname);
			
		if (m.find()) {
			System.out.println(" last name is valid ");
		}else {
			System.out.println(" last name is invalid ");
		}
			
	}
	
	// pattern for email
	
	void email() {

		Pattern p = Pattern.compile("^[abc][.a-z]*[@][bl][.][co][.a-z]*");	
			
		System.out.println("\n Enter Email: ");
		String email = sc.next();
		
		Matcher m = p.matcher(email);
			
		if (m.find()) {
			System.out.println(" email is valid ");
		}else {
			System.out.println(" email is invalid ");
		}
			
	}
	
	// pattern for mobile
	
	void mobile() {
		
		Pattern p = Pattern.compile("^(91-)[6-9][0-9]{9}");	
			
		System.out.println("\n Enter Mobile number: ");
		String mobile = sc.next();
			
		Matcher m = p.matcher(mobile);
			
		if (m.matches()) {
			System.out.println(" mobile number is valid ");
		}else {
			System.out.println(" mobile number is invalid ");
		}
			
	}
	
	
	public static void main( String[] args) {
		
		User_Registration re = new User_Registration();
		
		re.fName();
		re.lName();
		re.email();
		re.mobile();
	
	}
}
