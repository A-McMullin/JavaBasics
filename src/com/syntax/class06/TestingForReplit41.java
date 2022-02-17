package com.syntax.class06;

import java.util.Scanner;

public class TestingForReplit41 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age of the Child");
		
		int num = input.nextInt();
		String action;
		
		switch (num) {
		
		
		case 1: 
			action="You can Crawl";
			break;
		case 2: 
			action="You can Talk";
			break;
		case 3: 
			action="You can Dance";
			break;
		case 4: 
			action="You can get Trouble";
			break;
		default:
			action="I don't know how old you are";
					
		}
		System.out.println(action);		
	
	}
}
 


