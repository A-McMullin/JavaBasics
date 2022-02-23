package com.syntax.class11;

import java.util.Arrays;

public class MaxAndSecondLargestWithSort {

	public static void main(String[] args) {
		 
		int[] arr= {10,20,90,30,50,70};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
		
	}

}
