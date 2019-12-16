package day10;

import java.util.Scanner;

public class ScannerLab2 {

	public static void main(String[] args) {		
		System.out.println();
		Scanner sc = new Scanner(System.in);//System.in는 static 변수로 자동 초기화 된다./ 표준 입력장치를 입력하게 초기화 된다.
		for(int i=0;i<3;i++) {	
		System.out.printf("첫번째 숫자를 입력하세요: ");
		int su1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("두번째 숫자를 입력하세요: ");
		int su2 = sc.nextInt();
		sc.nextLine();
		System.out.printf("연산자(+, -, *, /)를 입력하세요 : ");
		String str = sc.nextLine();
		
		//숫자와 연산자를 입력받아 처리하는 기능을 3번 반복하도록 코드를 바꿔보자.
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
			System.out.printf("+,-,*,/를 입력하숑"); }	
		sc.close();}

	
	
	}


