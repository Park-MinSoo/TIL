package day3;
public class ForTest5 {
	public static void main(String[] args) {
		// 10���� 1������ ���ڿ� ���Ͽ� ���ڰ��� �ش� ������ ��������
		// ������� ����� ����
		for(int n=10; n >= 1; n--) 
			System.out.println(n + ":" + n*n);
		System.out.println("----------------");
		// 10���� 20������ ���ڿ� ���Ͽ� 3�� ������Ű�鼭 ���ڰ���
		//�ش� ������ �������� ������� ����� ����
		for(int n=10; n <= 20; n+=3) // -> n+=3 �� n++,n++,n++ �� ��ü�Ҽ��� �ֱ��ϴ�.
			System.out.println(n + ":" + n*n);
		System.out.println("----------------");
		
		
	}
}
