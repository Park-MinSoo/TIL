package day8;
import java.util.Scanner;
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		String a,b,c,d;
		a = sc.nextLine();	// ----> Enter 같은 계행 문자 데이터 전까지 값을 읽는다.
		b = sc.nextLine();
		c = sc.nextLine();
		d = sc.nextLine();
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	
		sc.close();
	}
}
