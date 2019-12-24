package day15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static String timeToStrDate(long time) {
		DateFormat formatter = 
				new SimpleDateFormat("dd-MM-yyyy");	// 이러한 포멧의 순서를 바꿀수도있다. 또 M은 Month m은 minute이다.
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = 
				new SimpleDateFormat("yyyy년 MM월 dd일");	//1) 이렇게 구성된 내용을 (년 앞은 yyyy 월 앞은 MM 일 앞은 dd)
		return formatter.parse(strDate);	//2) parse하겠다고 말하는것이다.
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(timeToStrDate(new Date().getTime()));
		System.out.println(parseStrDate("2019년 12월 25일")); 	// 내용을 읽어가면서 파악하는것!! 그것을 바로 '파싱'이라고 한다!
	}
}



