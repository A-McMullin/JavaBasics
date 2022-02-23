package com.syntax.class13;

import java.util.Scanner;

public class ClassAndObject {

	void checkEvenOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
		void checkWeather(boolean isRaining) { //defaults to false so keep that in mind for first if statement
	        if(isRaining) {
	            System.out.println("Stay inside loser");
	        }else {
	            System.out.println("Let's do for a walk");
	        } 
	}
		
		void checkName(String name) {
			if ("Teyfur".equals(name)) {
				System.out.println("Send memes");
			}else if ("Maha".equals(name)) {
				System.out.println("I am a doctor");
			}else {
				System.out.println("I don't know you");
			}
		}
		
	public static void main(String[] args) {
		
		ClassAndObject object1=new ClassAndObject(); // the NEW (then class name) will create the object
		object1.checkEvenOdd(12); //12 would be stored in the 'int number'
		object1.checkEvenOdd(5);
		object1.checkEvenOdd(36);
		object1.checkEvenOdd(77);
		object1.checkWeather(true);
		
		object1.checkName("Teyfur");
		object1.checkName("Maha");
		
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		//int number2=object1.checkEvenOdd(120);
	}
}
