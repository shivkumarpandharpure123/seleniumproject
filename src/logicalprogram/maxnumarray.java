package logicalprogram;
public class maxnumarray {

	public static void main(String[] args) {
int a[] = {50,40,30,20,60,80};

int max =a[0];

for(int i=1;i<a.length; i++) {
	
	if(a[i]>max) {
		
		max=a[i];	
	}
	
}
System.out.println(max);
}

}
