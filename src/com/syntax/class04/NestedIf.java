 package com.syntax.class04;

public class NestedIf {
public static void main(String[] args) {
	
	//nested if statement is an IF statement inside another IF statement
	
	boolean vaccine=true;
			
	int dose=1;
	
	if(vaccine) {
		
		System.out.println("How many doses do you have?");
		
		
		if (dose==1) {
			System.out.println("You need another shot.");
		} else {
			System.out.println("You are fully vaccinated.");
		}
		 

		
		}
	


	boolean allergy=true; 
	
	
		if(allergy) {
			System.out.println("Let's check what allergies you have");
				
			String allergyType="laksjdhf  ";
			
			if(allergyType.equals("pollen")) {
				System.out.println("Please stay at home when flowers are blooming");
				
			} else if (allergyType.equals("peanut")) {
				System.out.println("Please do not eat food with nuts.");
				
			} else {
				System.out.println("I don't know which suggestion to give you");
			}
							
		} else {
			System.out.println("You are lucky");
		}
	}	
}


