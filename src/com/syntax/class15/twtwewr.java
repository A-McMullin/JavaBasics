package com.syntax.class15;

import java.util.Scanner;

public class twtwewr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter names");
        String input = scan.nextLine();
        String[] names = new String[5];

        for (int i=names.length-1; i<=3; i++) {
            System.out.println(names[i]);
        }
    }
}


