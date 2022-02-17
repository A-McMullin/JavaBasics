package com.syntax.class06;

import java.util.Scanner;

public class CalculatorIfHW {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		
		int num1 = number.nextInt();
		int num2 = number.nextInt();
		
		System.out.println("Please input action(+,-,*,/)");
		
		char sign = number.next().charAt(0);
		
		if (sign == '+') {
			System.out.println("Your answer is "+(num1+num2));
		} else if (sign == '-') {
			System.out.println("Your answer is "+(num1-num2));
		} else if (sign == '*') {
			System.out.println("Your answer is "+(num1*num2));
		} else if (sign == '/') {
			System.out.println("Your answer is "+(num1/num2));
		}
				
	}

}
