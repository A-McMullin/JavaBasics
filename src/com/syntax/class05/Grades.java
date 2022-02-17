package com.syntax.class05;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Scanner score = new Scanner(System.in);
		
		System.out.println("Please enter score for quiz");
			int num1 = score.nextInt();
		
		System.out.println("Please enter score for mid term");
			int num2 = score.nextInt();
		
		System.out.println("Please enter score for final");
			int num3 = score.nextInt();
		
		int total = (num1 + num2 + num3) / 3;
		char grade;
		
		if (total >= 90) {
			grade='A';
		
		} else if (total < 90 && total >= 70) {
			grade='B';
		
		} else if (total < 70 && total > 50) {
			grade='C';
		
		} else {
			grade='F';
			
			
		}
		System.out.println("Your grade is "+grade);
	}

}
