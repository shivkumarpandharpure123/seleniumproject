
package logicalprogram;

import java.util.Scanner;

public class acceptuserinput {

	public static void main(String[] args) {
/// wap on input from user
		System.out.println("===Enter first number===");
		
		// create a object of scanner class 
		
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.println("===Enter Second number===");
		
		int b=sc.nextInt();
		
		System.out.println("Addition of two number is ="+(a+b));
	}

}
