package logicalprogram;

public class Stringreverse {

	public static void main(String[] args) {

		String s="shivkumar manmath pandharpure";
		
		String rev= "";
		String s1 []=s.split(" ");
		
		
		for (String word: s1) {
			
			String REVWORD="";
			
			for(int i=word.length()-1;i>=0;i--)
			{
				REVWORD=REVWORD+word.charAt(i);
			}
			rev=rev+REVWORD+" ";
			
			
		}
		System.out.print(rev);
	}

}
