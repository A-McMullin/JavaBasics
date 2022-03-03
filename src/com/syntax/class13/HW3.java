package com.syntax.class13;

public class HW3 {
//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	String words (String country) {
		switch (country) {
		
		case "USA":
			return "Hello";
		case "Mexico":
			return "Hola";
		case "France":
			return "Bonjour";
		default:
			return "Unknown";
		}	
	}
public static void main(String[] args) {
	HW3 obj = new HW3();
	String country = obj.words("France");
	
	System.out.println(country);
	}
}
