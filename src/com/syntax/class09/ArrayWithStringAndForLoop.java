package com.syntax.class09;

public class ArrayWithStringAndForLoop {

	public static void main(String[] args) {
		
		String[] names= new String[5];
		names[0]="Mike";
		names[1]="Scott";
		names[2]="Robert";
		names[3]="Andrew";
		names[4]="Daniel";
		
		
		
		System.out.println(names[3]);
		
		System.out.println("----------------------------------------------------------");
		
		
		String[] name= {"Mike", "Scott", "Robert", "Andrew", "Daniel"};
		System.out.println(name[3]);
		
		for (int a=0; a<name.length; a++) {
			System.out.println(name[a]+" ");
			
			if(name[a].equals("Andrew")) {
				System.out.println("My name is "+name[3]);
				
			} else {
				System.out.println("That is not my name");
			}
	}
	}
}
