package com.syntax.class13;

public class Method4 {
	
	
	double isSaleOn(boolean sale, double price, double discount) {
		if (sale == true) {
			return (price-price*discount);
		} else {
			return price;
			}
		}
	
	public static void main(String[] args) {
		Method4 obj=new Method4();
		System.out.println(obj.isSaleOn(false, 100, .15));
		System.out.println(obj.isSaleOn(true, 100, .20));
	}

}
