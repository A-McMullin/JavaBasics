package com.syntax.class10;

public class SumOfEachLine {

	public static void main(String[] args) {
	    int[][] a = {
	            {1,1,2}, //sum = 4
	            {3,1,2}, //sum = 6
	            {3,5,3}, //sum = 11
	            {0,1,2}  //sum = 3
	          };
	    
	    int temp = 0;
		int sum = 0;
		int [] array = new int[4];
		
		for (int i=0; i<4; i++){
			
			for (int j=0; j<3; j++) {
				temp= temp+a[i][j];
				
			} array [i]=temp;
			temp=0;
							
			}
		for (int num:array) {
		System.out.println(num);
	}
	}
}
