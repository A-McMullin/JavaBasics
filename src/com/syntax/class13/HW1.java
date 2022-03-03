package com.syntax.class13;

public class HW1 {
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void number (int num1, int num2) {
		if (num1>num2) {
			System.out.println(num1+" is the greater number");
		} else if (num2>num1){
			System.out.println(num2+" is the greater number");
		} else {
			System.out.println("Numbers are equal");
		}
	}
	
	public static void main(String[] args) {
		HW1 obj = new HW1();
		obj.number(15, 25);
		obj.number(67, 1248);
		obj.number(23, 23);
	}
}
