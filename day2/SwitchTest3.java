package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101); // 0~100
		// ������ ����� ó���ǵ��� 
		// if ���� switch ������ ������ ����.
		switch(score/10) {
		case 10:
		case 9:  System.out.println(score + " : A���");
					break;
		case 8:  System.out.println(score + " : B���");
					break;
		case 7:  System.out.println(score + " : C���");
					break;
		case 6:  System.out.println(score + " : D���");
					break;
		default:	System.out.println(score + " : F���");
		}
		System.out.println("��������!!");
	}
}
