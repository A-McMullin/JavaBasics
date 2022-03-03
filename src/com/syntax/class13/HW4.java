package com.syntax.class13;

public class HW4 {

	String createEmail (String userName, String lastName, String domain) {
		return userName+lastName+"@"+domain+".com";
		
	}
	
	
	public static void main(String[] args) {
		HW4 obj = new HW4();
		System.out.println(obj.createEmail("John", "Snow", "gmail"));
	}
}
