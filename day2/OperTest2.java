package day2;
public class OperTest2 {
	public static void main(String[] args) {
		// ���������� : ����������(++), ���ҿ�����(--)
		int su1, su2, su3, su4;
		su1 = 10;
		System.out.println(su1);	//10
		System.out.println(++su1);	//11
		System.out.println(++su1);	//12
		System.out.println(++su1);	//13
		System.out.println(--su1);	//12
		
		su2 = 10;
		System.out.println(su2);	//10
		System.out.println(su2++);	//10 -> ���� ����(���)�ϰ� �� ������  ������Ű�°��̴�.
		System.out.println(su2++);	//11
		System.out.println(su2++);	//12
		System.out.println(su2--);	//13 -> ���� ����(���)�ϰ� �� ������ ���ҽ�Ű�°��̴�. + ���ϰ� �� ���ÿ� �� ���� ����.
		System.out.println(su2);	//12

		su3 = 10;
		System.out.println(su3);	//10
		System.out.println(su3++);	//10
		System.out.println(++su3);	//12
		System.out.println(su3++);	//12
		System.out.println(--su3);	//12
		System.out.println(--su3);	//11
		
		su4 = 10;
		System.out.println(su4);	//10
		++su4;
		System.out.println(su4);	//11
		su4++;	// -> �ܵ����� ���� �� ��� ��,�� ��� ���� �Ȱ���~~
		System.out.println(su4);	//12
		//++10
		//10 = 10 + 1 -> �̷��͵��� ��� ���� �ʴ´� ���������ڴ� ������ �Ҵ� �Ǿ���Ѵ�.
	}
}
