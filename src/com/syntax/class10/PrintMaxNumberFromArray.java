package com.syntax.class10;

public class PrintMaxNumberFromArray {

	public static void main(String[] args) {
		 
		int[] num = {5, 4, 8};

	       int highest = num[0];

	       for (int i=1; i<num.length; i++) {
	         if (num[i]>highest) {
	           highest = num[i];
	         }
	       }
	       System.out.println(highest);
	}

}
