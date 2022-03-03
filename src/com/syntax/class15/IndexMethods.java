package com.syntax.class15;

public class IndexMethods {
	
	public static void main(String[] args) {
				   //012345678901234567
		String name="How are @you guys @ are";
		System.out.println(name.lastIndexOf("are")); //gives character number of the first char entered on line, but last in string, the second 'are' starts at 20
		System.out.println(name.indexOf("you")); // gives number for first char space of the first instance - the first 'y' is at 9
		System.out.println(name.indexOf("@", 8+1)); //asks for char space but second argument states a starting point
		System.out.println(name.indexOf("y", name.indexOf("@")+1));
		
	}

}
