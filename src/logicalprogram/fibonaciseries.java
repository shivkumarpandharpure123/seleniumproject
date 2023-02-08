package logicalprogram;

public class fibonaciseries {
public static void main(String[] args) {
	// next no is addition of preivous two no
	//  ex  0,1,2,3,5,8,13,21,34,55
	int a=-1;
	int b=1;
	int c;
	
	for (int i=1; i<=10; i++) {
		c=a+b;
		
		System.out.println(""+c);
		
		a=b;           // swapping concept is used
		b=c;
	}
	
}
}
