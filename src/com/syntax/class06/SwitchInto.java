package com.syntax.class06;

public class SwitchInto {

	public static void main(String[] args) {
		
		int day=5;
		
		// default value of all non primitive types is Null
		
		String dayName=null; //or can add 'else' block if not setting to null
		
		
		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		}
		System.out.println(dayName);

		
		//Switch into
		
		switch (day) {
		
		case 1:
			dayName="Monday";
		case 2:
			dayName="Tuesday";
			break;
		
					
		}
	}

}
