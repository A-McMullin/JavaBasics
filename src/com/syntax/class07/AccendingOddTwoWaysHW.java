package com.syntax.class07;

public class AccendingOddTwoWaysHW {

	public static void main(String[] args) {

		for(int i = 21; i<=50; i+=2) { //method 1 accending 20 - 50 odd only
			System.out.print(i+" ");
		}
		
		System.out.println("");
		for(int i = 21; i<=50; i+=2) { //method 2 accending 20 - 50 odd only
			if (i%2!=0) {
				System.out.print(i+" ");
		}
		}

	}

}
