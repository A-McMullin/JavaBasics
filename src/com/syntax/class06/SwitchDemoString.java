package com.syntax.class06;

public class SwitchDemoString {

	public static void main(String[] args) {
		
		String car="TOYOTA";
		
		String country; // need to have it set to null to initialize variable
		/*or can add default: 
		 * country="Unknown" to close out
		 */
		
		switch(car.toLowerCase()) {
		//if you change it switch(car.toUpperCase()) have to make sure all of the cases below are written as upper case
		//if you change to swithc(car.toLowerCase()) have to make sure case entries are lower case
		
		case "bmw":
			country="Germany";
			break;
		case "ford":
			country="USA";
			break;
		case "toyota":
			country="Japan";
			break;
		default:
			country="Unknown";
		}
		
		System.out.println(country);
	}

}
