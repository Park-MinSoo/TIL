package day4;
public class BreakTest1 {
	public static void main(String[] args) {
		boolean flag = false;
		for(int dan = 1; dan <=9; dan++) {
			for(int num=1; num <=9; num++) {
				if(dan*num > 30) {
					flag = true;
					break;			
			}
				System.out.print(dan+"x"+num+"="+dan*num+"\t");
		}
			System.out.println();
			if(flag == true) // boolean�� ��쿡�� ���ؼ� �񱳿������ �����ϰ� flag��� ������ �־ ���������� �����Ѵ�.
				break;
		}
		System.out.println("������ ��� ����!!");
	}
}
