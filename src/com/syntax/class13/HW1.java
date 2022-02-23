package com.syntax.class13;

public class HW1 {
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	int num (int numberA, int numberB) {
		
		if (numberA > numberB) {
		return (numberA);
		}	else {
			return numberB;
		}			
	}
	
	public static void main(String[] args) {
		HW1 result=new HW1();
		
		System.out.println(result.num(45,23)+" is the greater number");
		System.out.println(result.num(12,52)+" is the greater number");
	}
	
}
