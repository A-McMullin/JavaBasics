package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		
		//From an array of integer elements find the largest number.
		
		int large = 0;
		int[] num= {604, 804, 496, 278};
		

		for (int i=0; i<num.length; i++) {
			
			if (num[i]>large) {
				large=num[i];
			}
		}
		System.out.println(large);
		
			
		//alternate version
		
		//int large = 0;
		//int[] num= {604, 804, 496, 278};
		
		
		large = num[0];
		for (int number:num) {
			if (number>large) {
				large=number;
				
			}
		}
		System.out.println(large);
	}

}