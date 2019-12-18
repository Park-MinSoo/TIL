package test;
public class PrintAlpha {
	public static void main(String[] args) {
		char num = 'A';
		for (int row = 0; row <= 4; row++) {
			for (int col = 0; col<=row; col++) {
			System.out.print(num);
			num += 1;
			}
			System.out.println();
		}
	}
}
