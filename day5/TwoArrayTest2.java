package day5;
public class TwoArrayTest2 {
	public static void main(String[] args) {
		int[][] twoA = {{1,2,3}, {4,5,6}, {7,8,9}};	// -> 3�� x 3�� ����̴�.
		
		System.out.println(twoA);	//���� �迭�� ������
		System.out.println(twoA[0]);	//ù ��° ���� �����ϴ� ���� �迭�� ������
		System.out.println(twoA[0][0]);	//1�� 1���� ���� ��
		
		for(int row=0; row < twoA.length; row++) {	//-> ���� ������ŭ ���� for��
			for(int col=0; col <twoA[row].length; col++) {	//-> �� �ึ���� ���� ������ŭ ���� for��
				System.out.print(twoA[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
}
