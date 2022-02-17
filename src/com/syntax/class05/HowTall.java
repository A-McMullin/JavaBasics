package com.syntax.class05;

import java.util.Scanner;

public class HowTall {

	public static void main(String[] args) {
		
		Scanner height = new Scanner(System.in);
		
			System.out.println("Please enter your height in inches:");
			
			int num = height.nextInt();
			
			if(num < 60) {
				System.out.println("Short");
				
			} else if (num >= 60 && num <= 72) {
				System.out.println("Medium");
				
			} else if (num > 72) {
				System.out.println("Tall");
			}
			}
}
