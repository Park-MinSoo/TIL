package day4;
public class BreakTest2 {
	public static void main(String[] args) {
		unico : for(int dan = 1; dan <=9; dan++) { // unico ��� ���� �ٿ��־���.
			for(int num=1; num <=9; num++) {
				if(dan*num > 30) {
					System.out.println();
					break unico;	// ���� break ������ �Ѳ����� ���� ���� �� �ְԵȴ�.
				}
				System.out.print(dan+"x"+num+"="+dan*num+"\t");
			}
			System.out.println();
		}
		System.out.println("������ ��� ����!!");
	}
}
