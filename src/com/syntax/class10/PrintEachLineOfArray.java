package com.syntax.class10;

public class PrintEachLineOfArray {

	public static void main(String[] args) {
		 
		double[][] num = {{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		
		for (int i=0; i<num.length; i++){
				
			for (int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]*2+" ");
			}
		System.out.println();
}

	}

}
