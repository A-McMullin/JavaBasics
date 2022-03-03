package com.syntax.class13;


public class HW2 {
//Create a method that will take a number and prints whether the number is even or odd.
	
	void checkEvenOdd(int num) {
		if (num%2==0) {
			System.out.println(num+" is even"); 
		} else {
			System.out.println(num+" is odd");
		}
	}
	
	public static void main(String[] args) {
		
		HW2 obj = new HW2();
		obj.checkEvenOdd(55);
		obj.checkEvenOdd(12);
			
	}
	}
