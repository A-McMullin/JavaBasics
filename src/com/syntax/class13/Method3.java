package com.syntax.class13;

public class Method3 {

	String personAnimal(String person, String animal) {
		if(person.equals("Teyfur") && animal.equals("Horse")) {
			return "Camel";
		}else {
			return "Horse";
		}
	}
	
public static void main(String[] args) {

		Method3 obj = new Method3();
		String result = obj.personAnimal("Teyfur", "Horse");
		System.out.println(result);
}
}
