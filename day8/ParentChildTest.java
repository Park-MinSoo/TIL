package day8;

class Parent{	// Java.lang.Object
	int x = 1, y = 2;
	public String toString() {
		return "Parent 클래스의 객체 입니당";
	}
}
class Child extends Parent{
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			// 100
		System.out.println(this.x);		// 10
		System.out.println(super.x);	// 1	-----> 제일 할아버지가 아니라, child의 조상중에서 가장 먼저 만나는 x값을 가져오게 된다.
		System.out.println(y);			// 2
		System.out.println(this.y);		// 2
		System.out.println(super.y);	// 2
		//System.out.println(z);	----->> z는 여기에도 없고 조상에도 없어서 안된다.
	}
	public String toString() {
		return "Child 클래스의 객체 입니당";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);	// -----> p만 입력해도 자동으로 toString이 출력되어 나타나 지는 결과이다.
		System.out.println("출력 1" + p);
		Card c = new Card();
		System.out.println(c.toString());
		System.out.println("출력 2" + c);
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());	// -----> Date에 알맞게 toString을 다시 재정의하였다. (=Method Overriding)
		System.out.println("출력 3" + d);
		Child ch = new Child();
		System.out.println("출력 4" + ch);
		ch.printInfo();
	}
}
