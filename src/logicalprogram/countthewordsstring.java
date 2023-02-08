package logicalprogram;

import java.util.Scanner;
public class countthewordsstring {

	public static void main(String[] args) {
		int count =1;
		System.out.println("Enter the string ");

		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();
		
		for(int i=0; i<str.length()-1;i++) {
			
			if((str.charAt(i)==' ')  && (str.charAt(i+1)!= ' ')){
				
				count++;	
			}

		}
		System.out.println("num of string :"+count);
	}

}
