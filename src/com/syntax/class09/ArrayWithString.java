package com.syntax.class09;

public class ArrayWithString {

	public static void main(String[] args) {
		
		String[] colors= {"Blue", "Pink", "Yellow", "Red", "Green"}; //This will store the index of a single line
		
		System.out.println(colors[2]);
		
		System.out.println("-------------------------------------------------------------");
		
		String[] grades= {"A", "B", "C", "D", "E", "F"};
		System.out.println(grades[1]);
		
		String[] grade= new String [6];
		grade[0]="A";
		grade[1]="B";
		grade[2]="C";
		grade[3]="D";
		grade[4]="E";
		grade[5]="F";
		
		System.out.println(grade[1]);
		
		System.out.println("-------------------------------------------------------------");
		
		String[] names= new String[5];
		names[0]="Kevin";
		names[1]="Scott";
		names[2]="Robert";
		names[3]="Andrew";
		names[4]="Daniel";
		
		System.out.println(names[3]);
		
		String[] name= {"Kevin", "Scott", "Robert", "Andrew", "Daniel"};
		System.out.println(name[3]);
						   
		
		String[] words= {"Java ", "Saturday ", "day ", "coding ", "is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);

	}

}
