package day2;
public class RandomTest {
	public static void main(String[] args) {
		double rand1 = Math.random(); //-? 0.0<= n <1.0 �� ������ �����ش�.
		System.out.println(rand1);	
		double rand2 = rand1 * 100;
		System.out.println(rand2);
		
		int rand3 = (int)rand2;
		System.out.println(rand3);	// 0 ~ 99
		
		//rand1 �� ������ 1���� 6������ ������ ����� ���� �����Ͽ�
		//sixNum ������ ��Ƽ� ����� ����

		int sixNum = (int)(rand1 * 6 + 1);
		System.out.println(sixNum);	
		
		//rand1 �� ������ 1���� 45������ ������ ����� ���� �����Ͽ�
		//lottoNum ������ ��Ƽ� ����� ����
		
		int lottoNum = (int)(rand1 * 45 +1);
		System.out.println(lottoNum);

	}
}
