package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		//while is loop that repeats block of code as long as the condition is true
		
		int time = 17;
		
		while (time>12) {
			System.out.println("Morning "+time); //repeats infinitely 
			time--;
			
		}
		
		int i=1;
		
		while (i<=5) {
		
		System.out.println(i);
		i++;
		}

		int j=20;
		
		while (j%2==0) {
			System.out.print(j);
			
		}
		
		int h=1;
		
		while (h <= 30) {
			if (h % 2 == 0) {
				System.out.println(h); //will not have an output as it just gets stuck - no sys out
			h+=2;
			}
		 			
			}
		
		}
	}
	

