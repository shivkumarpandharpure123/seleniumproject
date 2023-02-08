package logicalprogram;


public class indexofeachchar {

	public static void main(String[] args) {
		
		String s1="shivkumar is good player ";
		
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				System.out.println("given string contain "+ s1.charAt(i) +" at the index "+i);
			}
		}
	}
}
