package com.syntax.class04;

import java.util.Scanner;

public class CityWeather {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your city:");
		
		String name = scan.nextLine();
						
		System.out.println("What is the temperature?");
	
		double tempf = scan.nextDouble();
				
		double cel = ((tempf-32) * 5) /9;
		
		System.out.println("The temperature in "+name+" is "+cel);
		
	}

}
