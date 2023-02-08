package logicalprogram;


public class primeno {

	public static void main(String[] args) {
int num= 3;
int count=0;

if(num>1) {
	for(int i=1;i<=num;i++) {
		
		if(num%i==0) {
			
			count++;	
		}	
		}
	if(count==2) {
		System.out.println( "num is a prime" );
		
	}
	else {
		
		System.out.println("num is not a prime ");
	}
	
	
}
else {
	
	System.out.println("num is not a prime");
}

      }
}

