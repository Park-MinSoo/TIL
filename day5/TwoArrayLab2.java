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
		
		
		System.out.println("A는  " + anum + "개 입니다.");
		System.out.println("B는  " + bnum + "개 입니다.");
		System.out.println("C는  " + cnum + "개 입니다.");
		System.out.println("D는  " + dnum + "개 입니다.");

		
	}
}
	

