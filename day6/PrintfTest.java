package day6;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("테스트입니당\n");		// %n
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);	// %x는 16진수, %d는 8진수, %c는 문자
		System.out.printf("%#x %#X %#o\n", 100, 100, 100);	// 16진수를 쓸때는 꼭 0x를 앞에 붙인다. %x 사이에 #을 붙이면 된다.
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3' );
		System.out.printf("%b\n", true);	//boolean 형태 출력
		System.out.printf("%f %e\n", 100.0, 100.0);	//%f는 기본으로 소숫점 6째 자리까지 나타낸다. %e는 지수형태
		System.out.printf("%.2f\n", 123.5678);
		System.out.printf("|%s|\n", "자바");	//문자열 데이터 출력은 %s이다.
		System.out.printf("|%10s|\n", "자바");
		System.out.printf("|%-10s|\n", "자바");	// 이런식으로 문자열의 공백을 제어할 수 있다.
		System.out.printf("%,d원\n", 1000000);	// %,d원으로 1000단위 마다 , 알아서 찍어준다.
	}
}


