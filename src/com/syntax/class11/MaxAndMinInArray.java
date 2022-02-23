package com.syntax.class11;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		
		int[] arr= {10,20,90,30,50,70};
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int element:arr) {
			if (largest<element) {
				largest=element;
			}
			if (smallest>element)
				smallest=element;
		}
System.out.println("Largest number is "+largest);
System.out.println("Smallest number is "+smallest);
	}

}
