package day8;
import java.util.Scanner;
public class ScannerLab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int number1 = sc.nextInt();	
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int number2 = sc.nextInt();
		System.out.print("������(+,-,*,/)�� �Է��ϼ��� : ");
		String calculate;
		calculate = sc.next();
	
		switch(calculate) {
		case "+":	
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 + number2);
			break;
		case "-":
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 - number2);
			break;
		case "*":
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 * number2);
			break;
		case "/":
			System.out.printf("%d �� %d�� %s ���� ����� %d�Դϴ�.",number1, number2, calculate, number1 / number2);
			break;
		default: System.out.println("+,-,*,/�� �Է��ϼ�");
			break;
		}
		sc.close();
		
		
	}
}
