package com.syntax.class05;

import java.util.Scanner;

public class WeekdayNumber {

	public static void main(String[] args) {
	
		Scanner day = new Scanner(System.in);
		
		System.out.println("Please enter day number:");
		
		int num = day.nextInt();
		
		if (num >= 1 && num <= 5) {
			System.out.println("It is a weekday");
			
		} else if (num == 6 || num == 7) {
			System.out.println("It is a weekend");
			
		} else {
			System.out.println("Invalid day");
			
			
		}
	}

}
