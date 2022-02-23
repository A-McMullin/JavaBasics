package com.syntax.class11;

public class NegativeAndOdd2D {

	public static void main(String[] args) {
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

		for (int i=0; i<a.length; i++) {

	    for (int x=0; x<a[i].length; x++) {
	      int num=a[i][x];
	      if (num<0 && num%2!=0) {
	        System.out.println(num); //prints each negative and odd number
	      }
	    }
	  }

	}

}
