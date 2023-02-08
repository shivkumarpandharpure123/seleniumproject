package logicalprogram;

public class addnumfromstring {
public static void main(String[] args) {
	String s = "4G6an8es7kyyy5e";
	
	int sum=0;
	
	for(int i=0; i<s.length();i++) 
	{
		if(Character.isDigit(s.charAt(i))) 
		{
			
		sum =sum +Character.getNumericValue(s.charAt(i));
		}
		
	}
		System.out.println("Addition of number present in a String = "+sum);
	
	}
}
