package com.syntax.class04;

public class PositiveNegativeOddEven {

	public static void main(String[] args) {
		
		int num= 0;
		
		if (num<0) {
			System.out.println("The number " + num + " is negative");
			
		} else if (num>0){
			System.out.println("The number " + num + " is positive");
			
		} else {
			System.out.println("The number is " + num);
		}
		
		/*
		 * Even and odd number check
		 */
		num = 259;
				
		if (num%2==0) {
			System.out.println("This "+num+" is an even number.");
			
	}	else {
			System.out.println("The "+num+ " is an odd number");
	}

	}

}
