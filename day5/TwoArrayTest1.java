package day5;
public class TwoArrayTest1 {
	public static void main(String[] args) {
	/*	int[] a1 = new int[10];
		char a2[] = {'��','��','��'};
		double a3[] = new double[5];
		
		System.out.println(a1.length + ":" + a2.length + ":" + a3.length);
		System.out.println(a1 + " - " + a1[0]);
		System.out.println(a3 + " - " + a3[0]);	// -> ��µǾ� ������ @���� �� = �������̴�. (�ڱⰡ �ο��� �ּڰ�)
		System.out.println(a2 + " - " + a2[0]);	*/
		
		int[][] a4 = new int[5][12];	 // -> 5�� x 12��
		
		System.out.println(a4);
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		System.out.println(a4[3]);
		System.out.println(a4[4]);
		System.out.println(a4.length);	// -> ��ü ���� ũ�� '5'
		System.out.println(a4[0].length);	// -> 1�࿡ �ش��ϴ� ���� �迭�� ũ�� '12'
		System.out.println(a4[1].length);	// -> 2�࿡ �ش��ϴ� ���� �迭�� ũ�� '12'
		System.out.println(a4[2].length);
		System.out.println(a4[3].length);
		System.out.println(a4[4].length);


	}
}
