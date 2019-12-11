package day7;
import java.util.Date;
import java.util.GregorianCalendar;	// ----->> 태양력 기반의 캘린더이다.
public class DateTest {
	public static void main(String[] args) {
		// Date
		Date d = new Date();
		System.out.println(d.toString());
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));	//	-----> 1이 일요일, 2가 월요일 ....
		gc = new GregorianCalendar(2019, 11, 25);	// ------> month의 경우 -1을 해주어야 한다.
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc = new GregorianCalendar(1995, 3, 29);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}
}
