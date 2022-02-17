package com.syntax.class07;

import java.util.Scanner;

public class AgeNameHW {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
			System.out.println("Please enter your first name");
			String first = input.next();
			
			System.out.println("Please enter your last name");
			String last = input.next();
			
			System.out.println("Please enter your age");
			int age = input.nextInt();
			
		System.out.println("Your name is "+first+" "+last+" and you are "+age+" years old");						
		}
		System.out.println("End of code");
	}
}
