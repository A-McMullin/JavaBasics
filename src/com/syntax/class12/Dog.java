package com.syntax.class12;

import java.util.Scanner;

public class Dog {

	Scanner scan = new Scanner(System.in);
	
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	void bark() {
	System.out.println("Dog is barking...");
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
		
		Dog scooby=new Dog();
		
		scooby.bark();
		scooby.eat();
		scooby.sleep();
		
	
	
	}
}
