package com.syntax.class05;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		
		Scanner birth = new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		
		String month = birth.next();
		
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December")) {
			System.out.println("Winter");
		
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("Spring");
						
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("Summer");
			
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("Fall");
		}		
	}

}
