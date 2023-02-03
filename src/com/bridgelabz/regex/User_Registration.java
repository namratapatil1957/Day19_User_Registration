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
	
	// pattern for password rule 1 of 8 characters
	
	void password() {
			
		Pattern p = Pattern.compile("[[a-zA-z0-9]]{8,}");	
			
		System.out.println("\n Enter Password: ");
		String password = sc.next();
			
		Matcher m = p.matcher(password);
			
		if (m.find()) {
			System.out.println(" Password is valid ");
		}else {
			System.out.println(" Password is invalid ");
		}
			
	}
	
	// pattern for password rule 2 upper case
	
	void upper_Case() {
				
		Pattern p = Pattern.compile("[[a-z][0-9][A-Z]+]{8,}");
				
		System.out.println("\n Enter Upper case in the Password ");
		String upper = sc.next();
				
		Matcher m = p.matcher(upper);
				
		if (m.find()) {
			System.out.println(" Uppercase Password is valid ");
		}else {
			System.out.println(" Uppercase Password is Invalid ");
		}
					
	}
	
	// pattern for password rule 3 numeric number
	
	void number() {
				
		Pattern p = Pattern.compile("[[a-z]([0-9]+)([A-Z]+)]{8,}");
				
		System.out.println("\n Enter Numeric number in the Password ");
		String numeric = sc.next();
				
		Matcher m = p.matcher(numeric);
				
		if (m.find()) {
			System.out.println(" Numeric Password is valid ");
		}else {
			System.out.println(" Numeric Password is Invalid ");
		}
				
	}
	
	// pattern for password rule 4 special character
	
	void special_Character() {
								
		Pattern p = Pattern.compile("[[a-z]([0-9]+)([A-Z]+)([!#*@$&]+)]{8,}");
						
		System.out.println("\n Enter Special character in the Password ");
		String special = sc.next();
						
		Matcher m = p.matcher(special);
						
		if (m.matches()) {
			System.out.println(" Special character Password is valid ");
		}else {
			System.out.println(" Special character Password is Invalid ");
		}
			
	}
	
	// pattern for sample e-mail
	
	void sample_email() {
		
		Pattern p = Pattern.compile("^[0-9a-zA-Z]+([_+-.a-z0-9A-Z]+)*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?");	
			
		System.out.println("\n Enter Sample Email: ");
		String email = sc.next();
			
		Matcher m = p.matcher(email);
			
		if (m.find()) {
			System.out.println(" Sample email is valid ");
		}else {
			System.out.println(" Sample email is invalid ");
		}
		
	}
	
	
	public static void main( String[] args) {
		
		User_Registration re = new User_Registration();
		
		re.fName();
		re.lName();
		re.email();
		re.mobile();
		re.password();
		re.upper_Case();
		re.number();
		re.special_Character();
		re.sample_email();
	
	}
}
