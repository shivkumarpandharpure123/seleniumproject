package logicalprogram;

public class missingnumbers {
	public static void main(String[] args) {
	int	arr []= {1,2,3,4,5,7,8,9,10};
	// sum of element of array
	
	int sum= 0;
	
	for(int i=0; i<=arr.length-1; i++) {
		
		sum=sum+arr[i];
		
	}
	System.out.println(sum);
	
	// sum of 1 to 1o element 
	
	int sum1=0;
	
	for(int i=0; i<=10; i++) {
		
		sum1=sum1+i;
	}
	System.out.println(sum1);
	
	System.out.println(sum1-sum);

	
	
	


}
}