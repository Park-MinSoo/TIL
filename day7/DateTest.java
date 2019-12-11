package day7;
import java.util.Date;
import java.util.GregorianCalendar;	// ----->> �¾�� ����� Ķ�����̴�.
public class DateTest {
	public static void main(String[] args) {
		// Date
		Date d = new Date();
		System.out.println(d.toString());
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));	//	-----> 1�� �Ͽ���, 2�� ������ ....
		gc = new GregorianCalendar(2019, 11, 25);	// ------> month�� ��� -1�� ���־�� �Ѵ�.
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc = new GregorianCalendar(1995, 3, 29);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}
}
