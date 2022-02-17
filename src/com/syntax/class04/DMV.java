package com.syntax.class04;

import java.util.Scanner;

public class DMV {
	
	public static void main(String[] args) {
		
		Scanner license = new Scanner(System.in);
		System.out.println("Please enter your age:");
		
		int age = license.nextInt();
		
		if (age>=18) {
		System.out.println("Ok to issue license");
		
		} else {
			System.out.println("Please obtain a learning permit.");
		}
		
		
	}

}

