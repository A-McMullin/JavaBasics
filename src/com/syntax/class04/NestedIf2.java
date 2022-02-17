package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		
boolean allergy=true;
		
		if(allergy) { //outer if
			System.out.println("Let`s check what allergies you have");
			
			String allergyType="gluten";
			
			if(allergyType.equals("pollen")) { //nested if
				System.out.println("Please stay home when trees are blooming");
			} else if(allergyType.equals("peanuts")) {
				System.out.println("Please don`t eat food that contains nuts");
			} else if(allergyType.equals("gluten")) {
				System.out.println("Please follow gluten free diet");
			} else {
				System.out.println("I don`t have a suggestion");
			}
			
		}
		else {
			System.out.println("You are lucky!");
			}
			}
						
	
		 
}

