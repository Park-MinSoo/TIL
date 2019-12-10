package day6;
public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName();	// ---->> 메서드 호출
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");		
	}
	static void printMyName() {	//  ---->> 메서드 생성
		System.out.println("유니코");
		return;	// ---->> 얘는 있어도 그만 없어도 그만이다. void라는 것은 return값이 없는 것이기 때문이다.
	}
}
