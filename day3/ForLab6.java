package day3;
public class ForLab6 {
	public static void main(String[] args) {
		final char a = '&';
		int b = (int)(Math.random()*6+5);

		for(int rowNum=1;rowNum<=b;rowNum++) {			
			for(int colNum=1;colNum<=rowNum;colNum++) 
					System.out.print(a);
					System.out.println();

				}
	}
}
