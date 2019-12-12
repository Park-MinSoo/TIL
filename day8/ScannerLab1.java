package day8;
import java.util.Scanner;
public class ScannerLab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int number1 = sc.nextInt();	
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int number2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/)를 입력하세요 : ");
		String calculate;
		calculate = sc.next();
	
		switch(calculate) {
		case "+":	
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 + number2);
			break;
		case "-":
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 - number2);
			break;
		case "*":
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 * number2);
			break;
		case "/":
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d입니다.",number1, number2, calculate, number1 / number2);
			break;
		default: System.out.println("+,-,*,/를 입력하숑");
			break;
		}
		sc.close();
		
		
	}
}
