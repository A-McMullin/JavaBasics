package com.syntax.class05;

import java.util.Scanner;

public class TimeHours {

	public static void main(String[] args) {
		
	Scanner hour = new Scanner(System.in);

		System.out.println("Please enter the hour");
		
		int num = hour.nextInt();
		
		if (num >= 1 && num <= 11) {
			System.out.println("It is Morning");
			
		} else if (num >= 12 && num <= 15) {
			System.out.println("It is Afternoon");
		
		} else if (num >= 16 && num <= 20) {
			System.out.println("It is Evening");
		
		} else if (num >= 21 && num <=24) {
			System.out.println("It is Night");
			
		}
	
	
	}

}
