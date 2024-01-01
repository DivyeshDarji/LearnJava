package com.basicjava.test;

public class CreateNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Row : Outer Loop & Cols : Inner Loop

		System.out.println("Regular Number Pattern");
		System.out.println();
		
		/*
		  	1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
		 */

		// row
		for (int i = 1; i <= 5; i++) {
			// cols
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		
		
		System.out.println();	
		System.out.println("Inverted Regular Number Pattern");
		System.out.println();
		
		/*
		  	1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
		 */

		// row
		for (int i = 5; i >= 1; i--) {
			// cols
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
