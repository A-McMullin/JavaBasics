package com.syntax.class07;

public class LoopFor {

	public static void main(String[] args) {
		
		//most widely used loop in Java
		
		
		for(int i = 20; i>=1; i--) { //descending order
			System.out.print(i+" ");
		}
		System.out.println("");//used to go to next line
		
		for(int i = 1; i<=20; i++) { //accending order
			System.out.print(i+" ");
		}
		System.out.println("");
		
		
		/*
		 * Accending and decending with even and odd
		 * 
		 */
		for(int i = 1; i<=100; i+=2) { //odd number accending
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i = 99; i>=1; i-=2) { //odd number decending
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i = 0; i<=100; i+=2) { //even number accending
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i = 100; i>=1; i-=2) { //even number decending
			System.out.print(i+" ");
		}
	}

}
