package logicalprogram;

import java.util.Scanner;

public class largestnum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner (System.in );

		System.out.println( "===Enter first num===");

		int a= sc.nextInt();
		   
		System.out.println( "===Enter second num===");

		int b= sc.nextInt();

		System.out.println( "Enter third num===");
		
		int c= sc.nextInt();

		if (a>b && a>c) 
		{
			System.out.println(" a is greater num");
		}
		else if(b>a && b>c) 
		{
			System.out.println("b is greater num");
		}
		else 
		{
			System.out.println("c is the greater num");
		}
	}
}
