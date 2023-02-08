package logicalprogram;


public class readvowels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "shivkumaru ";
int count =0;
for(int i=0; i<s.length(); i++)
{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	{
		count++;
	}
	
	
}
System.out.println(count);

//char chars []= s.toCharArray();
//int count =0;
//
//for (char ch :chars) {
//	
//	switch (ch) {
//	
//	case'a':
//	case'e':
//	case'i':
//	case'o':
//	case'u':
//		
//	count++;
//
//	}
//}
//System.out.println(count);

}

}
