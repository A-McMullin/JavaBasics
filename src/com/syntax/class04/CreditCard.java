     package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner card = new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		String yn = card.next();
		
		if(yn.equalsIgnoreCase("no") ) {
			System.out.println("Please apply for a card");
		
		} else {
			System.out.println("What is your balance?");
		double balance = card.nextDouble();
		
		if (balance > 1000) {
			System.out.println("Pay off card immediately");
			
		} else {
			System.out.println("You can spend more");
		}
		

		}
	}	
}
