package com.example.main;

import java.util.Scanner;

public class Zoho {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the word : ");
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		drawPattern(word);
	}

	private static void drawPattern(String word) {
		
		int len = word.length();
		char[] letters = word.concat(word).toCharArray();
		int start =len/2;
		
		for (int i = start; i < len + start; i++) {
			
			for(int j=len+start-i; j>1;j-- ) 	System.out.print(" ");
			
			for(int k=start ; k<=i ; k++) 		System.out.print(letters[k] + "");
					
			System.out.println();
		}
	}

	
	//Gajenthiran Venkatesan
}
