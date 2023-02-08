package logicalprogram;

public class arraytable {
	public static void main(String[] args) {
		
		String arr [][]= {{"sr.no.","1","2","3","4"},{"country nmae","india","china","aus","bharat"}};
		
		for(int i=0; i<5; i++) {
			for (int j=0; j<2; j++) {
				
				System.out.print(arr[j][i]+ "| ");
			}
			System.out.println( " ");
		}

	}
}
