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
	
	
	public static void main( String[] args) {
		
		User_Registration re = new User_Registration();
		
		re.fName();
	
	}
}
