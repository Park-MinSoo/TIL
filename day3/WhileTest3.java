package day3;
public class WhileTest3 {
	public static void main(String[] args) {
		System.out.println("main() ���� ����");
		char munja = '��';
		while(munja <= '��') {
			System.out.println(munja++);
		//	munja++; -> �������� println ���� munja�� '++' �� ����־� ǥ���ص� �ȴ�.
			
		}
		System.out.println("main() ���� ����");
	}
}
