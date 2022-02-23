package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayWithScanner {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the size of the array");
		
		int size=scanner.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("Please enter the elements for the array");
		for(int i=0; i<size; i++) {
			array[i]=scanner.nextInt();
				
		}
		System.out.println(Arrays.toString(array)); // displays the array in order
		
		int sum=0;
		for(int x=0; x<size; x++) {
			sum=sum+array[x];
			//alternate ---> sum=+array[x]
				}
		System.out.println(sum);
	}

}
