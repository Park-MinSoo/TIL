package day5;
public class TwoArrayLab2 {
	public static void main(String[] args) {
		char ary [][] = {
				{'B','C','A','A'},
				{'C','C','B','B'},
				{'D','A','A','D'}				
						};
	
		int anum = 0, bnum = 0,  cnum = 0,  dnum = 0;
	
		for(int i = 0; i<ary.length;i++)
			for(int j=0;j<ary[i].length;j++)
				switch(ary[i][j]) {
				case 'A':
					anum+=1;
					break;
				case 'B':
					bnum+=1;
					break;
				case 'C':
					cnum+=1;
					break;
				case 'D':
					dnum+=1;
					break;
				}
		
		
		System.out.println("A��  " + anum + "�� �Դϴ�.");
		System.out.println("B��  " + bnum + "�� �Դϴ�.");
		System.out.println("C��  " + cnum + "�� �Դϴ�.");
		System.out.println("D��  " + dnum + "�� �Դϴ�.");

		
	}
}
	

