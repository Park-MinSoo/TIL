package day8;

class Parent{	// Java.lang.Object
	int x = 1, y = 2;
	public String toString() {
		return "Parent Ŭ������ ��ü �Դϴ�";
	}
}
class Child extends Parent{
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			// 100
		System.out.println(this.x);		// 10
		System.out.println(super.x);	// 1	-----> ���� �Ҿƹ����� �ƴ϶�, child�� �����߿��� ���� ���� ������ x���� �������� �ȴ�.
		System.out.println(y);			// 2
		System.out.println(this.y);		// 2
		System.out.println(super.y);	// 2
		//System.out.println(z);	----->> z�� ���⿡�� ���� ���󿡵� ��� �ȵȴ�.
	}
	public String toString() {
		return "Child Ŭ������ ��ü �Դϴ�";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);	// -----> p�� �Է��ص� �ڵ����� toString�� ��µǾ� ��Ÿ�� ���� ����̴�.
		System.out.println("��� 1" + p);
		Card c = new Card();
		System.out.println(c.toString());
		System.out.println("��� 2" + c);
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());	// -----> Date�� �˸°� toString�� �ٽ� �������Ͽ���. (=Method Overriding)
		System.out.println("��� 3" + d);
		Child ch = new Child();
		System.out.println("��� 4" + ch);
		ch.printInfo();
	}
}
