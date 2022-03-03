package com.syntax.class04;

import java.util.Scanner;

public class NestedIfWithScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		
		if (num%2==0) {
			System.out.println("Value is even");
		} if (num>=1000 && num%2==0) {
			System.out.println("Even value is large");
		} else if (num<1000 && num%2==0) {
			System.out.println("Even value is just right");
		} 
		
		else if(num%2!=0) {
			System.out.println("value is odd");
		} if (num%2!=0 && num<1000) {
			System.out.println("Odd value is just right");
			
		}
				
	}
}
