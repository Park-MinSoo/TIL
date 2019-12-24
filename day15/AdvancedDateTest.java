package day15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdvancedDateTest {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();    // ��ǻ���� ���� ��¥ ������ ������ LocalDate ��ü�� �����Ѵ�. ��� : 2019-12-24 
		LocalDate targetDate = LocalDate.of(2020, 1, 1); // LocalDate.of�� Month�� -1�̳� +1�� ���ص� �ȴ�!
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd E");	// �빮�� E�� ������ ��Ÿ����.
		String text1 = currentDate.format(formatter);
		String text2 = targetDate.format(formatter);
		LocalDate parsedDate = LocalDate.parse("2019 12 25 ��", formatter);
		String text3 = parsedDate.format(formatter);
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
	}
}
