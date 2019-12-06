package day3;
public class ForLab7 {
	public static void main(String[] args) {
		final char a = '*';

				for(int rowNum=7;rowNum>=1;rowNum--) {			
					for(int colNum=1;colNum<=rowNum;colNum++) 
					System.out.print(a);
					System.out.println();
		
				}
	}
}
