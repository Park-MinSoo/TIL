package day15;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest1 {
	public static void main(String[] args) throws Exception {	//throws로 하는 예외 처리는 소극적인 예외처리이다.
		URL url = new URL("https://movie.naver.com/");	//자바에는 URL이라는 클래스가 존재한다.
		InputStream is = url.openStream();	// 웹서버한테 요청은 이때 일어나게 되는 것이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));	// byteStream을 문자 스트림으로 바꾸기 위해 InputStreamReader를 사용
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
//	결과는 utf-8 이므로 한글이 깨지게 된다. InputStreamReader(is, "UTF-8")에 이렇게 utf -8을 명시해준다. 소문자도 상관없지만 R에서는 대문자만 인식하므로 대문자로 연습할것.