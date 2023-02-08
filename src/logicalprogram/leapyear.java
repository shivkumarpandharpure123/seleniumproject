package logicalprogram;

public class leapyear {

	public static void main(String[] args) {
int year=2004;

if((year%4==0 &&(year%100 !=0)) || (year%400== 0)){
	
	System.out.println("specified year is a leap year:"+ year);
	
	}
else {
	
	System.out.println(" year is not leap year");
	
}

	}

}
