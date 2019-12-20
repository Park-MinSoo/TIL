package day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInputTest {	
	public static void main(String[] args) throws Exception {
		System.out.print("입력 : ");
	//	int input = System.in.read();	// 한글자만 읽어 간다.	, read는 byte 스트림 객체여서 1바이트만 읽은 것이라 한글을 못 읽는다.
	//	int input = new InputStreamReader(System.in).read();	// ---> 얘는 한글도 잘 읽는다.ㄱㄱ
	//	System.out.println("출력 : " + (char)input);
		
		String input = new BufferedReader(
				new InputStreamReader(System.in)).readLine();	// ---> 이렇게 하면 문자열도 잘 읽게된다.
		System.out.println("출력 : " + input);
	}
}
