package com.syntax.class06;

import java.util.Scanner;

public class ShoppingHW {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please advise if there is a sale (yes or no)");
		String sale = input.next();
		
		if (sale.equalsIgnoreCase("yes")) {
			
			System.out.println("What is the price of the item?");
			double price = input.nextDouble();
		
			double discount=0;
		
			if ((price < 20) && price > 1) {
				discount = .10;
			} else if ((price >= 20) && price < 100) {
				discount = .20;
			} else if ((price >= 100) && price < 500) {
				discount = .30;
			} else {
				discount = .50;
			}	
		
			double aftersale = (price -(price*discount));
			
			System.out.println("After discount of "+discount*100+"% The price of the item is reduced from "+price+" to "+aftersale);
			
		} else {
				System.out.println("You are not going shopping");
			}
		}
		
	}

