package day15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static String timeToStrDate(long time) {
		DateFormat formatter = 
				new SimpleDateFormat("dd-MM-yyyy");	// �̷��� ������ ������ �ٲܼ����ִ�. �� M�� Month m�� minute�̴�.
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = 
				new SimpleDateFormat("yyyy�� MM�� dd��");	//1) �̷��� ������ ������ (�� ���� yyyy �� ���� MM �� ���� dd)
		return formatter.parse(strDate);	//2) parse�ϰڴٰ� ���ϴ°��̴�.
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(timeToStrDate(new Date().getTime()));
		System.out.println(parseStrDate("2019�� 12�� 25��")); 	// ������ �о�鼭 �ľ��ϴ°�!! �װ��� �ٷ� '�Ľ�'�̶�� �Ѵ�!
	}
}



