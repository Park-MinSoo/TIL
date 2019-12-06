package day3;
public class WhileTest3 {
	public static void main(String[] args) {
		System.out.println("main() 수행 시작");
		char munja = '가';
		while(munja <= '나') {
			System.out.println(munja++);
		//	munja++; -> 윗문장의 println 속의 munja에 '++' 를 집어넣어 표현해도 된다.
			
		}
		System.out.println("main() 수행 종료");
	}
}
