package com.syntax.class15;

public class Task2Class15 {

	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.
		
		
String s1="Hello";
String s2="Sunday";
String reverses2="";
//middle char
if(s1.length()>=3 && s1.length()%2!=0) {
    System.out.println(s1.charAt(s1.length()/2));
}else {
	System.out.println("Error");
}

System.out.println("---------------------");

//reverse
for(int i=s2.length()-1;i>=0;i--) {
	reverses2=reverses2+s2.charAt(i);
}
    System.out.println(reverses2);

}
}
