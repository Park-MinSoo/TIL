package day2;
public class ForTest3 {
	public static void main(String[] args) {
		for(int num=1;num <= 20; num++)
			System.out.print(num+" ");	
		System.out.println();
	
	
		for(int num=20;num >= 1; num--)
			System.out.print(num+" ");	
		System.out.println();
	
		
		for(int num=20;num >= 1; num-=3) // 20 17 14 11 8 5 2
			System.out.print(num+" ");	
		System.out.println();
	
		
		for(int num=10;num >= 1; num-=3) // 10 7 4 1
			System.out.print(num+" ");	
		System.out.println();
		
		
		int num;
		for(num=10;num >= 1; num-=3) // int�� ���� �������ָ� for������������ �ƴ� �����ε� ��� ����Ҽ� �ִ�. but �޸� ��Ƹ԰���?
			System.out.print(num+" ");
		System.out.println();
		
		System.out.print(num); // int num ������ For�� �ۿ��� �߱� ������ ���� ��µǾ� ��������.
	}
}
