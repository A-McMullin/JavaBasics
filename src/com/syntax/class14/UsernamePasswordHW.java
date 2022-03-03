package com.syntax.class14;

public class UsernamePasswordHW {

	void createUsernameAndPassword (String Username, String Password, String PWconfirm) {	
		
		if (Username.isEmpty() || Password.isEmpty()) {
			System.out.println("Username and/or Password cannot be empty");
					
		} else if (Password.contains(Username)) {
			System.out.println("Password cannot contain username");
			
		} else if (Password.length()<8) {
			System.out.println("Password is too short");
		
		} else if (Password.equals(PWconfirm)) {
			System.out.println("Your username and password has been created"); 
		}	
	}	
	
		public static void main(String[] args) {
		
		UsernamePasswordHW object = new UsernamePasswordHW();
		
		object.createUsernameAndPassword("Andrew", "google", "google");
		object.createUsernameAndPassword("Andrew123", "Andrew123", "Andrew123");
		object.createUsernameAndPassword("", "google123", "google123");
		object.createUsernameAndPassword("Andrew", "google123", "google123");
			
		
			
	}
}
