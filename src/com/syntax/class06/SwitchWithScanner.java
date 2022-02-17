package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String country = input.next();
		String lang;	
		switch (country.toLowerCase()) {
		
		case "usa":
			lang="English";		
			break;
		case "germany":
			lang="German";
			break;
		case "france":
			lang="French";
			break;	
		default:
			lang="Unknown";
		}
		input.close();
		System.out.println("Your language is "+lang);
	}

}
