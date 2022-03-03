package com.syntax.class13;

public class HW5 {

	boolean isPrime(int number) {
		boolean isPrime=true;
		
		if(number>1) {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		return isPrime;
	}
	public static void main(String[] args) {
		HW5 object=new HW5();
		System.out.println(number.i);
	}
	}
	

