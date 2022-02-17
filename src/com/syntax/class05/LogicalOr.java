package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		//use || for OR conditions. if one of the conditions are true the output will be true
		
		
		
		String day="Sunday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) { 
			
			System.out.println("I have java class");
			
		
		} else {
			System.out.println("I do not have java class");
		}
		

	}

}
