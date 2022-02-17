package com.syntax.class09;

public class ArrayWithIntegers {

	public static void main(String[] args) {
	
	//printing integers from an array
		
	int[] num= new int[4];
	
	num[0]=90;
	num[1]=80;
	num[2]=83;
	num[3]=77;
	
	System.out.println(num[0]+" "+num[2]);
	
	//Using an array of string type variables
	
	String[] name= new String [12];
	name[0]= "*";
	name[1]= "Canada ";
	name[2]= "USA ";
	name[3]= "Germany ";
	name[4]= "France ";
	name[5]= "Mexico ";
	
	System.out.println(name[0]+name[0]+name[0]+name[0]);
	System.out.println(name[0]+"  "+name[0]);
	System.out.println(name[0]+"  "+name[0]);
	System.out.println(name[0]+name[0]+name[0]+name[0]);
	
	}

}
