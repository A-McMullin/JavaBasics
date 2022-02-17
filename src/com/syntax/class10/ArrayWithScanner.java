package com.syntax.class10;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = scan.nextInt();
		
		int num2 = scan.nextInt();
		
		int num3 = scan.nextInt();
		
		int num4 = scan.nextInt();
		
		int num5 = scan.nextInt();
		
		int []numbers = {num1, num2, num3, num4, num5};
		
		for (int i=0; i<numbers.length; i++) {
			
			
			System.out.println(numbers[i]*10);
		}
		
	
	}
}
