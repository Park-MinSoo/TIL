package day9;

class A{
	A() {
		super();	//	--->> 이것은 안넣어도 JVM에서 알아서 넣어준다., but) this나 super호출을 하고있으면 자동으로 안 넣어준다.
		System.out.println("A 클래스를 객체 생성합니다");
	}
}
class B extends A{
	B(int num) {
		super();
		System.out.println("B 클래스를 객체 생성합니다");
	}
}

class C extends B{
	C() {
		super(100);	//	직접적으로 조상생성자를 호출해 주어야한다. & 반드시 첫 번째 행에 조상생성자를 호출해야한다.
		System.out.println("C 클래스를 객체 생성합니다");
	}
}

public class ABCTest {
	public static void main(String[] args) {
		new C();	//	------>> 조상의 객체생성을 먼저하고 자손의 객체생성으로 내려온다.
	}
}
