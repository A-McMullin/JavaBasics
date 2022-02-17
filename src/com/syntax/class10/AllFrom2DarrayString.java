package com.syntax.class10;

public class AllFrom2DarrayString {

	public static void main(String[] args) {
		
		String [][] food= {
				{"redbull", "burger", "steak", "fries"},
				{"curry", "biriyani", "butter chicken"},
				{"noodles", "pad thai", "tom yum"},
				{"pizza", "pasta", "wine"}
		};
		
		for (int row=0; row<food.length; row++) {
			
			for(int col=0; col<food[row].length; col++) {
			
			System.out.println(food[row][col]);
			}
		}
	
	/*
	 * Alternate version with Enhanced For Loop
	 */
	
		String [][] foods= {
				{"redbull", "burger", "steak", "fries"},
				{"curry", "biriyani", "butter chicken"},
				{"noodles", "pad thai", "tom yum"},
				{"pizza", "pasta", "wine"}
		};
	
		for(String[]eats:food) {
			
			for(String f:eats) {
				System.out.println(f);
			}
				
		}
	}

}
