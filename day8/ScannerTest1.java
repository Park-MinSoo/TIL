package day8;
import java.util.Scanner;
public class ScannerTest1 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		String a,b,c,d;
		a = sc.next();	// ----> blank, tab 같은 분리 문자 데이터 전까지 값을 읽는다.
		b = sc.next();
		c = sc.next();
		d = sc.next();
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	
		sc.close();	// -----> 더이상 쓰이지 않을 때에는 닫아주면 좋다. (외부자원을 사용하는것이기 떄문)
	}
}
