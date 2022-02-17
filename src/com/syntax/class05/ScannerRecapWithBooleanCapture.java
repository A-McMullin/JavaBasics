package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecapWithBooleanCapture  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter boolean value");
				
		//boolean value capture
		
		boolean name = input.nextBoolean();
		
		System.out.println(name);
		
		System.out.println("please enter char value");
		char letter = input.next().charAt(2); //number specifies which char to capture - 0 is first
		
		System.out.println(letter);
		
	}

}
