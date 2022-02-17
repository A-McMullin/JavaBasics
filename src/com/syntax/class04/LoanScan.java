package com.syntax.class04;

import java.util.Scanner;

public class LoanScan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter loan amount:");
		
		int n = scan.nextInt();
		
		if (n <= 200000 && n > 1) {
			System.out.println("Ok to lend amount.");
			
		} else if (n<=0) {
			System.out.println("Amount is invalid.");
			
		} else {	
			System.out.println("Do not loan amount.");
		}
		

	}

}
