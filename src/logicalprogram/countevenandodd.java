package logicalprogram;

public class countevenandodd {

	public static void main(String[] args) {
		
		int num=12345645;
		
		int oddcount=0;
		int evencount=0;
		
		while (num>0) {
			
			int rem=num%10;
			if(rem%2==0)
			{
				evencount++;
			}
			else {
				oddcount++;	
			}
			num=num/10;
		}
		System.out.println("evencount:"+evencount);
		System.out.println("oddcount:"+oddcount);

	}
	
	

}
