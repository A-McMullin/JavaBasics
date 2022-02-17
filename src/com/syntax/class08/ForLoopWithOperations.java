package com.syntax.class08;

public class ForLoopWithOperations {

	public static void main(String[] args) {
		
		/*
		 * Integer that adds odd numbers only 1-50
		 */
		int sum = 0;
		
		for(int i=1; i<=50; i+=2) {
			sum+=i;
			
		}
		System.out.println(sum);
		
		/*
		 * Integer that adds even numbers only 1-50
		 */
		int mul = 0;
		
		for (int a=0; a<=50;a+=2) {
			mul+=a;
			
		}
		System.out.println(mul);
		
		/*
		 * Integer that multiplies
		 */
	
			int num = 1;
			for (int n=1; n<4; n++) {
				num*=n;
			
			System.out.println(num);
			
			}

		/*
		 * Adding even and odd integers 1-50
		 */
		
		int sumeven=0;
		int sumodd=0;
		
		for (int i=1; i<=50; i++) {
			if (i % 2 != 0) {
				sumeven = sumeven+i;
		   } else {
			   sumodd = sumodd + i;
		   }
		System.out.println(sumodd);
		System.out.println(sumeven);
		}
		
	}

}
