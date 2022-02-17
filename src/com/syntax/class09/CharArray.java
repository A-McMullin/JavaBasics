package com.syntax.class09;

public class CharArray {

	public static void main(String[] args) {
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		
		char[] grade= new char [6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		int size=grade.length; //counts the number of elements
		
		System.out.println(grade[1]);//Print specific element(s)
		System.out.println(size); //Print the number of elements
		
		for(int i=5; i<grade.length; i--) { //for loop to print 'range' of elements
			System.out.print(grade[i]+" "); 
		}
					
		
		
	}

}
