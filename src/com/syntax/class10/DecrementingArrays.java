package com.syntax.class10;

public class DecrementingArrays {

	public static void main(String[] args) {
		
		
		int[] num= {604, 804, 496, 278};

		for(int i=3; i>=0; i--) {
			System.out.println(num[i]+" ");
		}
		
		//alternate version
		
		int[] number= {604, 804, 496, 278};
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
			
		}
		
		//
		int[] nums={604, 804, 496, 278};
		for (int i=nums.length -1; i>=0; i--) {
			System.out.println(nums[i]);
		}
		
	}

}
