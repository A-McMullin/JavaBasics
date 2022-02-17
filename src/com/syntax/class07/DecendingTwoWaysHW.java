package com.syntax.class07;

public class DecendingTwoWaysHW {

	public static void main(String[] args) {
		for(int i = 20; i>=1; i-=2) { 
			System.out.print(i+" ");
		}
		
		for(int i = 20; i>=1; i-=2) { //method 2 decending 20 - 1 even only
			if (i%2==0) {
				System.out.print(i);
		}
		}
	
	}

}
