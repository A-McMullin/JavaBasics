package com.syntax.class10;

public class AllValuesFrom2DarrayIntegers {

	public static void main(String[] args) {
		double [][] numbers = {
				{10, 20, 40},
				{100, 200, 300, 400},
				{1000, 3000},
				};

		//int size = numbers.length; // This will give the number of rows
		
		//int sizeof1array = numbers[0].length; //size of first array
		
		//int sizeof2array = numbers[1].length; //size of second array
		
		//int sizeof3array = numbers[2].length; //size of third array
		
		//Retrieving all elements from 2D array
		
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) { //change the[0] to [i] if there are different amount of inputs in each array
				
				System.out.println(numbers[i][j]);
			}
		}
		
		
	}

}
