package logicalprogram;

public class occuranceofcharcter {

	public static void main(String[] args) {
		
		
		String str="java is a programming language";
		
		int totallength =str.length();
		
	int lengthremoinga	=str.replace("a", "").length();
	
	int count = totallength -lengthremoinga;
	
	System.out.println(count);
	

	}

}
