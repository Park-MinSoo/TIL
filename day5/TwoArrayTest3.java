package day5;
public class TwoArrayTest3 {
	public static void main(String[] args) {
		int nums[][] = {
						{10,20,30,40},
						{11,21,31,41},
						{12,22,32,42}		
						};	

	int sum = 0;
	for(int i =0; i < nums.length;i++) 
		for (int j=0; j < nums[i].length; j++)
			sum += nums[i][j];
	System.out.println("��ü �������� �� : "+ sum);
	
	int sumRow=0, sumCol =0;
	
	//������ ���� �����͸� �ջ��Ͽ� sumRow�� ����
	for(int j =0; j < nums[2].length;j++) // -> ���� ������ nums[�ش���].length �� �ؾ��Ѵ�.
		sumRow += nums[2][j];
	
	//�ι�° ���� �����͸� �ջ��Ͽ� sumCol�� ����
	for(int i =0; i < nums.length;i++) //-> ���� ������ �׳� nums.length �ϸ� �ȴ�.
		sumCol += nums[i][1];
	
	System.out.println("������ ���� �������� �� : "+ sumRow);
	System.out.println("�ι�° ���� �������� �� : "+ sumCol);
  }
}
