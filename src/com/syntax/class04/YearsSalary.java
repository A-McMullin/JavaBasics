package com.syntax.class04;

import java.util.Scanner;

public class YearsSalary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many years have you worked?");

		int years = scan.nextInt();
		
		if (years >= 5) {
			System.out.println("You are eligible for a bonus.");
			System.out.println("Please enter your salary");
			
			int salary = scan.nextInt();
			
			if (salary >= 50000) {
				System.out.println("Your bonus is 5000.");
				
			} else {
				System.out.println("Your bonus is 3000.");
			}
			
		} else {
			System.out.println("You are not eligible for a bonus.");
			
		}
	}	
}