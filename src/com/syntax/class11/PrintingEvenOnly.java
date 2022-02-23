package com.syntax.class11;

public class PrintingEvenOnly {

	public static void main(String[] args) {
		
		int[][] array2d= {{2,3,4},{5,6},{12,6,8}};
		
		for (int x = 0; x <array2d.length; x++) {
			
			for (int y=0; y<array2d[x].length; y++) {
				int element=array2d[x][y];
				if(element%2==0) {
					System.out.println(element);
				}
			}
		}

	}

}
