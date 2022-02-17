package com.syntax.class08;

public class ForLoopWithContinue {

	public static void main(String[] args) {
	
		for(int i=1; i<=7; i++) {
			
			
			if (i<=3 || i==5 || i==7) {								//added 'or' codition to have other lines skipped
				System.out.println("Skip");					//added sysout to show line that was skipped
				continue; //skip current iteration/cycle
			}
			System.out.println("Hello");
			System.out.println("We are Batch 12");
		}
	
	/*
	 * Printing all numbers except for one 
	 */
	
		for(int i=1; i<=10; i++) {
			
			if (i==4 || i==7) {
				continue;
			}
			System.out.println(i+" ");
		}
	}
	
}
