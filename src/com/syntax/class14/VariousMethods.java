package com.syntax.class14;

public class VariousMethods {

	/*
	 * .length
	 */
	public static void main(String[] args) {
		String name="whatever"; //Primary - use this one as it is shorter
		
		String name2=new String("SOMETHING"); //alternate version of above
		
		System.out.println(name);
		System.out.println(name2);
		
		System.out.println(name.length()); //counts the characters named to the variable
		
		System.out.println(name2.toLowerCase()); //changes variable input to lower case
		
		System.out.println(name.toUpperCase()); //changes variable input to upper case
		System.out.println(name.concat(name2)); // adds both inputs together in line - if variable is NULL it will return error
		System.out.println(name+name2); //this is preferred to concat
		
		System.out.println(name.isEmpty()); //checks if variable contains any characters - spaces would return false
		
		System.out.println(name.trim()); //trims out the empty spaces before and after the word but not between the characters
		System.out.println(name.startsWith("w")); //returns a boolean value if the input of the variable starts with a particular char
		System.out.println(name.toLowerCase().startsWith("w")); //This is method chaining and will check both methods
		System.out.println(name.endsWith("r")); //Checks if it ends with specific character(s) to return boolean value
		System.out.println(name.contains("v")); //Checks if input contains specific character(s) to return boolean value
		
	}
}
