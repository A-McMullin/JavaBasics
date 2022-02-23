package com.syntax.class11;

import java.util.Arrays;

public class ArraySumIn2D {

	public static void main(String[] args) {
		int [][] array= {{10,10,10},{20,20,20},{30,30,30}};
		
		
		
		int sum=0;
		for(int x=0;x<array.length; x++) {
			System.out.println(Arrays.toString(array[x]));
			for (int y=0; y < array[x].length; y++) {
				sum+=array[x][y];
			
		}
		//print line here would do rolling total of each array
		System.out.println("This is a rolling total after each array "+sum);			
		}
System.out.println("The sum of the arrays is "+sum);
	}

}
