package logicalprogram;

public class armstrong {

	public static void main(String[] args) {
		int num= 153;
		int sum=0;
		
		for(int i=num; i>0; i=i/10) {
			
			int rem =i%10;
			sum =sum+(rem*rem*rem);	
		}
		
		if(num==sum) {
			
			System.out.println("given numis armstrong");
		}
		else {
			System.out.println(" given num is not armstrong num");
		}
		System.out.println(sum);

	}

}
