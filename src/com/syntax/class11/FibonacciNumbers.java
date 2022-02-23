package com.syntax.class11;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int n1=0, n2=1, n3;
		 
		System.out.print(n1+" "+n2);
		for (int i=2; i<10; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
System.out.println();
		/*
		 * Alternate version
		 */
		
		int howMany=10;
		int previous=0;
		int current=1;
		int next=0; 
		System.out.print(previous+" "); //need this or it won't print the first number = 0
		System.out.print(current+" "); //need this or it won't print the second number = 1
				
		for(int j=0; j<howMany-2; j++) {
		next=previous+current;
		System.out.print(next+" ");
		previous=current;
		current=next;
		}
	}

}
