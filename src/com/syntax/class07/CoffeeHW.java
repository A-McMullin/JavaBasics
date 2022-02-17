package com.syntax.class07;

import java.util.Scanner;

public class CoffeeHW {

	public static void main(String[] args) {
		
		int price=3;
		Scanner input = new Scanner(System.in);
		int guess;
		
		
		do {
			System.out.println("Please enter price for coffee");
			guess=input.nextInt();
			
			if (guess<3) {
				System.out.println("Please give more");
			} else if (guess>3) {
				System.out.println("Please give less");
			}
			
			} while(guess!=price);  
			System.out.println("Enjoy your coffee");
		
	}

}
