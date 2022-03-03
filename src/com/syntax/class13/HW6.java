package com.syntax.class13;

public class HW6 {
	
	char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		}else if(score>=80 && score<90) {
			return'B';
		}else if(score>=70 && score<80) {
			return'C';
		}else if(score>=50 && score<70) {
			return'D';
		}else {
			return'F';
		}
	}
	
	public static void main(String[] args) {
		
		HW6 grade=new HW6();
		System.out.println(grade.getGrade(71));
}
}