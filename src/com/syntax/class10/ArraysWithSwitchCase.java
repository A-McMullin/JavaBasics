package com.syntax.class10;

public class ArraysWithSwitchCase {

	public static void main(String[] args) {
		
		String[] country= {"USA", "France", "Germany", "Spain", "Mexico"} ;
		
		String[] capital= {"D.C.", "Paris", "Berlin", "Madrid", "Mexico City"} ;
		
				for (int i=0; i<country.length; i++) {
					System.out.println("the capital of "+country[i]+" is "+capital[i]);
				}
		
		String[] countries= {"USA", "France", "Germany", "Spain", "Mexico"} ;
		String caps = null;
		
		for (int i=0; i<countries.length; i++) {
			switch (countries[i]) {
			case "USA":
				caps="D.C.";
				break;
			case "France":
				caps="Paris";
				break;
			case "Germany":
				caps="Berlin";
				break;
			case "Spain":
				caps="Madrid";
				break;
			case "Mexico":
				caps="Mexico City";
				break;
			}
			
			
		System.out.println("The capital of the country "+countries[i]+" is "+caps);	
		}

	}
}

