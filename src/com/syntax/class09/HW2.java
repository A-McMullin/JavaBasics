package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		//Create an array of animals and store 5 elements into it. 
		//Using 2 different loops print all elements from the array.
		
		String[] animal= {"cat", "dog", "bird", "snake", "hamster"};
		for (int a=0; a<animal.length; a++) {
			System.out.println(animal[a]);
		}
		for (String pet:animal) {
			System.out.println(pet);
		}

	}

}
