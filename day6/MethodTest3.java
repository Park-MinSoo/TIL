package day6;
public class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(1, '#');
		System.out.println("-------------");
		printMyName(3, '*');
		System.out.println("-------------");
		printMyName(2, '@');
		System.out.println("-------------");
	//	printMyName(1);	---->> 이렇게 int 값만 부여하게되거나 더 많은 값들을 부여하면 에러가 나게된다.( 정확한 갯수와 type이 일치해야한다.)
		System.out.println("main() 수행종료");		
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<= num; i++)
			System.out.println(deco + "유니코" + deco);
	}
}
