package com.syntax.class09;

public class StringArray {

	public static void main(String[] args) {
		String[] words= {"Java ", "Saturday ", "day ", "coding ", "is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);

		String[] word= new String[5];
		word[0]="Java ";
		word[1]="Saturday ";
		word[2]="day ";		
		word[3]="coding ";
		word[4]="is ";
		
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
	}

}
