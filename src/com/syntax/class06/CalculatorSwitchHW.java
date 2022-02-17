package com.syntax.class06;

import java.util.Scanner;

public class CalculatorSwitchHW {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		int num1 = number.nextInt();
		int num2 = number.nextInt();
		
		System.out.println("Please input action(+,-,*,/)");
		char sign = number.next().charAt(0);
		int result=0;
		
		switch (sign) {
				
		case '+':
			result=(num1+num2);
			break;
		case '-':
			result=(num1-num2);
			break;
		case '*':
			result=(num1*num2);
			break;
		case '/':
			result=(num1/num2);
			break;		
		}
		System.out.println("Your answer is "+result);
		
	}

}
