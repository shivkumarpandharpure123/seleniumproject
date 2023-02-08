package logicalprogram;

public class factorial {

	public static void main(String[] args) {
		
		int fact =1;
		
		int num=5;
		
		for(int i=1; i<=num;i++)
		{
			fact = fact*i;
			
		}
		
		System.out.println("=============================");
	
		System.out.println("Factorial of Given num ="+fact);
	}

}
