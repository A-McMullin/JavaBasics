package com.syntax.class09;

public class ArraysWithForEachLoopCombined {

	public static void main(String[] args) {
		
		//Array with String and For Each Loop
		String[] cities= {"Kansas City", "Boston", "Miami", "New York", "Minneapolis"};
		
		for(String city:cities) { //allows for java to run through all indexes and assign to new variable and store it
			System.out.println(city);
		
		}
		//Array with Integer and For Each Loop
		int[] numbers = {10, 20, 30, 40, 50};
		for(int num:numbers) {
			System.out.println(num);
		}
		
		//Array with Double and For Each Loop
		double[] a= {10.05, 25.43, 32.65, 67.12, 44.56};
		for(double b:a) {
			System.out.println(b);
		}
		
		//Array with Char and For Each Loop
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		for(char g:grades) {
			System.out.println(g);
		}
	}

}
