package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		
		//Create an array on integers and calculate the sum of all elements in an array
		
		int[] num= new int[4];
		
		num[0]=604;
		num[1]=804;
		num[2]=496;
		num[3]=278;
		
		System.out.println(num[0]+num[1]+num[2]+num[3]);
		
		//alternate version
		
		int[] numbers= {604, 804, 496, 278};
		
		int size = numbers.length;
		int sum = 0;
		
		for (int i=0; i<size; i++) {
			sum += numbers[i];
			
		}
		System.out.println(sum);
	
			
	}

}
