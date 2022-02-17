package com.syntax.class02;

public class Combination {

	public static void main(String[] args) {
		//Order of operations followed PEMDAS
		
		String a="Hello";
		String b="Bye";
		
		int c=10;
		int d=20;
		
		System.out.println(a+b+c+d+c+d+c+d);//because it starts with the text string then the addition operation
		System.out.println(c+d+a+b+a+a+a+(c+d));//because it starts with addition operation then the text string
		
		System.out.println(c+a+b+d);
		
		int num=123;
		
		String num2="123";
		
		System.out.println(num+num2);
				
		
	}

}
