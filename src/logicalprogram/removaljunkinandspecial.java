package logicalprogram;

import java.util.StringJoiner;

public class removaljunkinandspecial {

	public static void main(String[] args) {
String s= "agagfsy@$#%^^&^%shjsjg";

s=s.replaceAll("[^A-Za-z0-9]", "");

System.out.println(s);
		
		
		//String joiner 

StringJoiner sJ = new StringJoiner(" ,"," []", s );

sJ.add("a").add("b").add("c");

StringJoiner sj1=new StringJoiner(":");

sj1.add("p").add("q");

sJ.merge(sj1);

System.out.println(sJ);




	}

}
