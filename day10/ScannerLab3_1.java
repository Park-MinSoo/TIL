package day10;

import java.util.Scanner;

public class ScannerLab3_1 {
	//while(munja <= '나') {
	public static void main(String[] args) {		
		System.out.println();
		Scanner sc = new Scanner(System.in);//System.in는 static 변수로 자동 초기화 된다./ 표준 입력장치를 입력하게 초기화 된다.
		while(true) {
		System.out.printf("첫번째 숫자를 입력하세요: ");
		int su1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("두번째 숫자를 입력하세요: ");
		int su2 = sc.nextInt();
		sc.nextLine();
		System.out.printf("연산자(+, -, *, /)를 입력하세요 : ");
		String str = sc.nextLine();
		
		//숫자와 연산자를 입력받아 처리하는 기능을 사용자가
		//원할때까지 반복하도록 코드 추가
		//결과 출력 사용자에게 계속 수행하겠는지에 대한 메세지를 출력하고
		//1을 입력하면 계속 수행이고 2를 입력하면 종료
		int result=0;
		switch(str) {
		case "+": result=su1+su2;		
		break;
		case "-": result=su1-su2;	
		break;
		case "*": result=su1*su2;		
		break;
		case "/": result=su1/su2;		
		}			
		if(str.equals("+")||str.charAt(0)=='-'||str.charAt(0)=='*'||str.charAt(0)=='/')//str.equals("+")도 가능
		System.out.printf("%d와 %d의  %s연산결과는 %s입니다.",su1,su2,str,result);
		else
			System.out.printf("+,-,*,/를 입력하숑");
		System.out.printf("계속 수행하시겠습니까? y 입력:계속 수행, 다른 값 입력시 멈춤");		
		if(!sc.next().equals("y"))//equals의 결과가 참이 아닐때
			break;
		}	
		sc.close();}

	
	
	}


