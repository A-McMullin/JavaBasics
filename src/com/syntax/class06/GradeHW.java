package com.syntax.class06;

import java.util.Scanner;

public class GradeHW {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter grade (A,B,C, or D");
		
		String grade = input.next();
		
		String letter;
		
		switch (grade.toLowerCase()) {
		
		case "a":
			letter="A-Excellent";
			break;
		case "b":
			letter="B-Good";
			break;
		case "c":
			letter="C-Average";
			break;
		case "d":
			letter="D-Bad";
			break;
		default:
			letter="Not Acceptable";
			
		}
		System.out.println(letter);
	}

}
