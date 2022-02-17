package com.syntax.class09;

public class ArrayWithDouble {

	public static void main(String[] args) {
		
		//Create an array to store 4 different prices
		//Find an average of how much we spent
		
		double[] price = new double [4];
		
		price[0]=2.99;
		price[1]=5.25;
		price[2]=10.55;
		price[3]=7.10;
		
		double ave=(price[0]+price[1]+price[2]+price[3])/4;
		
		System.out.println(ave);
				

	}

}
