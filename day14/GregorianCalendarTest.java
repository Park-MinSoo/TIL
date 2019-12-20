package day14;
import java.util.*;
public class GregorianCalendarTest {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));	// 오늘이 1년중 얼마나 됐는지
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));	// 이번달에서 몇째 주냐
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));	// 이번주에서 며칠이냐
		
		System.out.printf("%tY\n", gc);	// 대문자 Y는 연도를 4자리다 보여줌
		System.out.printf("%ty\n", gc);	// 소문자 y는 연도를 2자리만 보여줌
		System.out.printf("%tm\n", gc); // 소문자 m은 월을 나타냄
		System.out.printf("%tb\n", gc);	// 소문자 b는 월에 월이라는 말까지 출력
		System.out.printf("%tH\n", gc);	// 대문자 H 시간
		System.out.printf("%tM\n", gc);	// 대문자 M 분
		System.out.printf("%tS\n", gc);	// 대문자 S 초
		System.out.printf("%tA\n", gc);	// 대문자 A 요일까지 나타냄
		System.out.printf("%ta\n", gc);	// 소문자 a 요일명만 나타냄
	}
}
