package day15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdvancedDateTest {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();    // 컴퓨터의 현재 날짜 정보를 저장한 LocalDate 객체를 리턴한다. 결과 : 2019-12-24 
		LocalDate targetDate = LocalDate.of(2020, 1, 1); // LocalDate.of는 Month에 -1이나 +1을 안해도 된다!
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd E");	// 대문자 E는 요일을 나타낸다.
		String text1 = currentDate.format(formatter);
		String text2 = targetDate.format(formatter);
		LocalDate parsedDate = LocalDate.parse("2019 12 25 수", formatter);
		String text3 = parsedDate.format(formatter);
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
	}
}
