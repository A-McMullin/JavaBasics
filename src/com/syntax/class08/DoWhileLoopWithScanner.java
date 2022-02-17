package com.syntax.class08;

import java.util.Scanner;

public class DoWhileLoopWithScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String creditCard;
		do {
			System.out.println("Would you like to apply for a credit card");
			creditCard=input.next();
			if(creditCard.equalsIgnoreCase("Yes")) {
				break;
			}
			
		} while(creditCard.equalsIgnoreCase("No"));
			
		
		
		
		

	}

}
