package day5;
public class TwoArrayLab3 {
	public static void main(String[] args) {
		int emp [][] = {
						{10, 20, 30, 40, 50},
						{5, 10, 15},
						{11, 22, 33, 44},
						{9, 8, 7, 6, 5, 4, 3, 2, 1}
						};
		
		int sumRow1 = 0, sumRow2 = 0,  sumRow3 = 0, sumRow4 = 0;

		for(int row1 = 0; row1 < 1; row1++) {
			for(int col=0; col < emp[row1].length; col++)
				sumRow1 += emp[row1][col];			
		
			System.out.print("1행의 합은 " + sumRow1 + "입니다.");
			System.out.println();
		}
		for(int row2 = 1; row2 < 2; row2++) {
			for(int col=0; col < emp[row2].length; col++)
				sumRow2 += emp[row2][col];			
			
			System.out.print("2행의 합은 " + sumRow2 + "입니다.");
			System.out.println();
		}
		for(int row3 = 2; row3 < 3; row3++) {
			for(int col=0; col < emp[row3].length; col++)
				sumRow3 += emp[row3][col];			
			
			System.out.print("3행의 합은 " + sumRow3 + "입니다.");
			System.out.println();	
		}
		for(int row4 = 3; row4 < 4; row4++) {
			for(int col=0; col < emp[row4].length; col++)
				sumRow4 += emp[row4][col];			
			
			System.out.print("4행의 합은 " + sumRow4 + "입니다.");
			System.out.println();	
		}
			
			
		}
	}