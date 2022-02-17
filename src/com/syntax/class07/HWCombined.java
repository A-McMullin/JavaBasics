package com.syntax.class07;

public class HWCombined {

	public static void main(String[] args) {
		//Task 1
		for(int i = 1; i<=100; i++) { //accending 1 - 100 single line
			System.out.print(i+" ");
		}
		
		//Task 2
		for(int i = 100; i>=1; i--) { //decending 100 - 1
			System.out.println(i);
		}
		
		//Task 3
		for(int i = 20; i>=1; i-=2) { //method 1 decending 20 - 1 even only
			System.out.print(i+" ");
		}
		
		for(int i = 20; i>=1; i-=2) { //method 2 decending 20 - 1 even only
			if (i%2==0) {
				System.out.print(i);
		}
		}
		//Task 4
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
