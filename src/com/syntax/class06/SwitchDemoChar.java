package com.syntax.class06;

public class SwitchDemoChar {

	public static void main(String[] args) {
		//print line will have to be outside of the  code block
		
		char choice='m';
		String answer;
		switch (choice) {
		
		case 'y':
			answer="Yes";
			break;
		case 'n':
			answer="No";
			break;
		case 'm':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
		}
		
		System.out.println(answer);	
		
		String car="BMW";
		
		String country;
		
		switch(car) {
		
		case "BMW":
			country="Germany";
			break;
		case "Ford":
			country="USA";
			break;
		case "Toyota":
			country="Japan";
			break;
			
		}
		
	
	}

}
