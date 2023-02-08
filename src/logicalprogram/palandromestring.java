package logicalprogram;

import java.util.Scanner;


public class palandromestring {

	public static void main(String[] args) {
		

		System.out.println("enter a string ");
Scanner sc = new Scanner (System.in);

String str= sc.nextLine();


String orgnum = str;

String rev ="";

int len =str.length();

for(int i=len-1;i>=0;i--) {
	
	rev=rev+str.charAt(i);
}

if(orgnum.equals(rev)) {
	
	System.out.println(orgnum+   "String is palandrome");
}

else {
	System.out.println(orgnum+"string is not plandrome");
}

	}
}
