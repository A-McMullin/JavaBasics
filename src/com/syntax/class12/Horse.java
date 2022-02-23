package com.syntax.class12;

public class Horse {

	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	void run() {			//void statement allows for printing without main method
		System.out.println(name+" is running");
	}
	void eat() {
		System.out.println(name+" is eating");
	}
	void printcompleteinfo() {
		System.out.println("name = "+name);
		System.out.println("breed = "+breed);
		System.out.println("age = "+age);
		System.out.println("weight = "+weight);
		
	}
	public static void main(String[] args) {
		Horse lillysHorse = new Horse();
		lillysHorse.name="Spirit";
		lillysHorse.breed="stallion";
		lillysHorse.age=20;
		lillysHorse.weight=400;
		lillysHorse.run();
		
		lillysHorse.printcompleteinfo();
	}
	
	
}
