package day9;

class A{
	A() {
		super();	//	--->> �̰��� �ȳ־ JVM���� �˾Ƽ� �־��ش�., but) this�� superȣ���� �ϰ������� �ڵ����� �� �־��ش�.
		System.out.println("A Ŭ������ ��ü �����մϴ�");
	}
}
class B extends A{
	B(int num) {
		super();
		System.out.println("B Ŭ������ ��ü �����մϴ�");
	}
}

class C extends B{
	C() {
		super(100);	//	���������� ��������ڸ� ȣ���� �־���Ѵ�. & �ݵ�� ù ��° �࿡ ��������ڸ� ȣ���ؾ��Ѵ�.
		System.out.println("C Ŭ������ ��ü �����մϴ�");
	}
}

public class ABCTest {
	public static void main(String[] args) {
		new C();	//	------>> ������ ��ü������ �����ϰ� �ڼ��� ��ü�������� �����´�.
	}
}
