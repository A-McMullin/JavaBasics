package com.syntax.class07;

import java.util.Scanner;

public class WhileWithScanner {

	public static void main(String[] args) {
		
		int price=3;
		Scanner input = new Scanner(System.in);
		int guess=0;
		
		
		while (guess!=price) {
			System.out.println("Please enter a number to win");
			guess=input.nextInt();
		}
		System.out.println("Congrats");
	}

}
