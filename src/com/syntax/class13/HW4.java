package com.syntax.class13;

public class HW4 {

	String email (String firstName, String lastName, String domain) {
		return firstName+lastName+"@"+domain;
	}
	
	
	public static void main(String[] args) {
		HW4 obj = new HW4();
		System.out.println(obj.email("John", "Snow", "gmail.com"));
	}
}
