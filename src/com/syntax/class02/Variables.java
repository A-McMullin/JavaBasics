package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Andrew";
		String lastName="McMullin";
		String grade="A";
		String city="Kansas City";
		String state="Missouri";
		String phone="816-123-5555";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am an "+grade+" student");
		System.out.println("I live in "+city+", "+state);
		System.out.println("And my phone number is "+phone);

		city="Detroit";
		state="Michigan";
		phone="313-555-7777";
		grade="A+";
		
		System.out.println("My name is "+name+" "+lastName+" and I moved to "+city+", "+ state+". My new phone number is "+phone);
		
	}

}
