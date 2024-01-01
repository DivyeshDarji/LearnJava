package com.basicjava.test;

public class CreateNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Row : Outer Loop & Cols : Inner Loop

		System.out.println("Regular Number Pattern");
		System.out.println();

		// row
		for (int i = 1; i <= 5; i++) {

			// cols
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

}
