/**
 * 
 */
package com.basicjava.test;

import java.util.Scanner;

/**
 * @author Divyesh DARJI
 *
 */
public class FindCircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Take numbers from the user:
		System.out.print("Enter Raidus of the Circle: ");
		int r = input.nextInt();

		// write logic for finding circle area
		float pi = 3.14F;
		float area = pi * (r * r);

		// print area of circle
		System.out.println("Circle Area: " + area);
	}

}
