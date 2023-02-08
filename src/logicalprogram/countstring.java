package logicalprogram;

public class countstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="KuNt@l 2020 ";

		int len = s.length();
		
		int c, uppercase=0, lowercase=0 , spc=0, spcl=0, num=0 ;
		
		for(int i=0; i<len; i++)
		{
			c=s.charAt(i);
	 
			if( c>='A'&& c<='Z')
	 
				uppercase++;
			else if( c>='a'&& c<='z')
				lowercase++; 
	 
			else if (c>='0'&& c<='9')
				num++;
	 
			else if (c==' ')
				spc++;
	 
			else {
				spcl++;
			}
 
		}
		System.out.println("No of UpperCase Char ===> " + uppercase);
		System.out.println("No of lowercase char ===> "+ lowercase);
		System.out.println("No of number  ===> "+num);
		System.out.println("No of Spec  ===> "+spc);
		System.out.println("No of Special Char ===> "+spcl);
	}
	}


