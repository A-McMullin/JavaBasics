package com.syntax.class13;

public class MethodDemo2 {

	//int we specify datatype that method will return
	//square is name of the method
	//(int number) parameters of the method
	//return tells Java what to return from this method
	
	int square(int number) { 
		return number*number;
		
	}
	
	
	public static void main(String[] args) {
		MethodDemo2 obj=new MethodDemo2();
		int result =obj.square(4);
		System.out.println(result); //The sysout has to be in the main method
	}

}
