package com.basicjava.test;

import java.util.Scanner;

public class FindTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Ask number to the user for input 
		System.out.print("Enter the table number which you want to print: ");
		
		int num = input.nextInt();
		
		// Example: 2*1=2
		for(int i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
	}

}
