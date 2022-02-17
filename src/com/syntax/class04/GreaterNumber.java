package com.syntax.class04;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Please type numbers");
		
		int num1= num.nextInt();
		int num2= num.nextInt();
		int num3= num.nextInt();
		
		if (num1==num2 && num1==num3) {
			System.out.println("All numbers are equal");
			
		} else if (num1 > num2 && num1 > num3) {
			System.out.println(num1+" is the greater number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+" is the greater number");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println(num3+" is the greater number");
		}
		

	}

}
