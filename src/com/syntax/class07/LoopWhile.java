package com.syntax.class07;

public class LoopWhile {

	public static void main(String[] args) {
		//1 to 100 single line
		int i=1;
		
		while (i<=100) {
		
		System.out.print(i+" ");
		i++;
		}
		
		//100 to 1 backwards
		int a = 101;
		
		while (a>=1) {
		System.out.print(a);
		a--;
		}
		
		//20 - 100 even only
		int b=20;
		
		while (b <= 100) {
			if (b % 2 == 0) {
			System.out.print(b);
			b+=2;
			}
	
		//100 - 1 only odd
			
		int c = 99;
		
		while (c >= 1) {
			if (c % 2 == 1) {
			System.out.print(c);
			c-=2;
			}
		}
		
		}
		
	}

}
