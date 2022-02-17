package com.syntax.class10;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int[] array = new int[size];
	
	for (int i=0; i<size; i++) {
		System.out.println("Enter the elements");
	array[i]=sc.nextInt();
	int input= array.length;
	int sum=0;
	for (int j=0;j<input; j++) {
		sum+=array[i];
		
	}
	System.out.println("The sum of the inputs is "+sum);
	}
	
	
		}
	}