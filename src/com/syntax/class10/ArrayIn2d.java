package com.syntax.class10;

public class ArrayIn2d {

	public static void main(String[] args) {
		
		String [] [] name =new String [2][4];
		
		name [0][0]="Mr";
		name [0][1]="Mrs";
		name [0][2]="Ms";
		name [0][3]="Miss";
		
		name [1][0]="Smith";
		name [1][1]="Jordan";
		name [1][2]="Jackson";
		name [1][3]="Obama";
		
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);
		
		/*
		 * 
		 */
		
		String [][] input = {{"Timmy", "Billy", "Tommy", "Mikey"},
							{"A", "B", "C", "D"}};
		System.out.println(input[0][1]+" "+input[1][0]);
		System.out.println(input[0][0]+" "+input[1][3]);
		System.out.println(input[0][2]+" "+input[1][2]);
		System.out.println(input[0][3]+" "+input[1][1]);
				
		
		
		
	}

}
