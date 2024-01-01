package com.basicjava.test;

public class CreatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Row : Outer Loop & Cols : Inner Loop
		
		System.out.println("Solid Rectange");
		System.out.println();
		
		//Solid Rectangle
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Hollo Rectange");
		System.out.println();

		// Hollo Rectangle 
		/* (1,1),(1,2),(1,3),(1,4),(1,5)
		 * (2,1),                 ,(2,5)
		 * (3,1),                 ,(3,5)
		 * (4,1),(4,2),(4,3),(4,4),(1,5)
		
		*****
		*   *
		*   *
		*****
		*/
		// row
		for(int i=1;i<=4;i++) {
			//column
			for(int j=1;j<=5;j++) {
				// condition
				if(i==1 || j==1 || i==4 || j==5 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("Half Pyramid");
		System.out.println();
		
		/*
		 * 
		 **
		 ***
		 ****
		*/
		
		// row
		for(int i=1;i<=4;i++) {
			// column
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Invert Half Pyramid");
		System.out.println();
		
		/*
		 ****
		 ***
		 **
		 *
		*/
		
		// change the row : decreasing order 
		for(int i=4;i>=1;i--) {
			// column
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("180 degree Half Pyramid");
		System.out.println();
		
		/*
		    *
		   **
		  ***
		 ****
		*/
		
		// out loop row
		for(int i=1;i<=4;i++) {
			
			// loop for printing space : Remember 'i'
			for(int space=1;space<=(4-i);space++) {
				System.out.print(" ");
			}
			
			// column : loop for printing star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("180 degree reverse Half Pyramid");
		System.out.println();
		
		/*
		    ****
		     ***
		      **
		       *
		*/
		
		// out loop row
		for(int i=4;i>=1;i--) {
			
			// loop for printing space : Remember 'i'
			for(int space=1;space<=(4-i);space++) {
				System.out.print(" ");
			}
			
			// column : loop for printing star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
