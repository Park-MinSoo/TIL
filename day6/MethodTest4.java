package day6;
public class MethodTest4 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName(3,'*');
		printName("��ũ",'$');
		printName("��ũ",'$');
		printName("��ũ",'$');
		printName("�ν�",'!');
		System.out.println("main() ��������");		
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<= num; i++)
			System.out.println(deco + "������" + deco);
	}
	static void printName(String name, char deco) {	//----->> �̸��� �ٸ��� ���� �ٸ� �޼����̴�.
			System.out.println(deco + name + deco);
	}
}
