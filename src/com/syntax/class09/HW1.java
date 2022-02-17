package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		String [] car= {"Mustang", "Camaro", "Ranger", "Camry", "Civic", "Taurus"};
		for (int a=0; a<car.length; a++)
		System.out.println(car[a]);
		
		for (String veh:car) {
			System.out.println(veh);
			}

	}

}
