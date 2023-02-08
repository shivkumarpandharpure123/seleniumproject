package logicalprogram;

import java.io.ObjectInputFilter.Status;
import java.lang.reflect.Array;
import java.util.Arrays;

import iframe.iframe;

public class equalarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
//		if (a.length==b.length) {
//			
//			for(int i=0; i<=a.length;i++) {
//				
//				if(status ==true) {
//					
//				}
//			}
//		}
		
		if(Arrays.equals(a, b))
		{
			System.out.println("Array is Equal");
		}
		else 
		{
			System.out.println("Array is not Equal");
		}
		

	}

}
