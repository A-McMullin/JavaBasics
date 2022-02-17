package com.syntax.class06;

import java.util.Scanner;

public class Replit42 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		int roll = input.nextInt();
		String name;
		
		switch (roll) {
		
		case 101:
			name = "Student name: Ramesh";
			break;
		case 102:
			name = "Student name: Mahesh";
			break;
		case 103:
			name = "Student name: Mukesh";
			break;
		default:
			name = "Not found Student name: in Class";
			
		}
		System.out.println(name);
		
	}

}
