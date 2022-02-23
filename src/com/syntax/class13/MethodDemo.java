package com.syntax.class13;

public class MethodDemo {

	void TeyfurAndHorse(String person, String animal) {
		if("Teyfur".equalsIgnoreCase(person)&&"Horse".equalsIgnoreCase(animal)) {
			System.out.println("This is a camel");
		}else {
			System.out.println("This is a horse");
			
		}
	}
	public static void main(String[] args) {
		MethodDemo obj=new MethodDemo();
		obj.TeyfurAndHorse("Teyfur", "Horse");
		obj.TeyfurAndHorse("Tarik", "Horse");
		
	}
}
