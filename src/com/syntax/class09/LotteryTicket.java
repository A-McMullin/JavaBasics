package com.syntax.class09;

public class LotteryTicket {

	public static void main(String[] args) {
		int [][] lotterycard = {{20, 15, 7},
		                        {35, 8, 35},
		                        {48, 6, 10}};
		
		int [][] lottercard2 = new int [3] [3]; //defines rows by columns 0,0 is first box [row] [column]
		lottercard2 [0][0] = 20; //upper left corner
		lottercard2 [0][1] = 15; //2nd number on top row...etc
		
		System.out.println(lotterycard [0][0]);
		System.out.println(lottercard2 [0][1]);
	}

}
