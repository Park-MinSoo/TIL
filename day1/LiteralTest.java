package day1;
public class LiteralTest {
	public static void main(String[] args) {
		System.out.println(1+1);   	 //2
		System.out.println(1.0+1);   //2.0  1.0+1 -> 1.0 + 1.0 -> 2.0
		System.out.println('1'+1);   //50   1�̶�� ������ �� 49 (������ Ű���� ������ �ڵ尪�� ������ ���� -> ASCII code)
		System.out.println("1"+1);   //11	"1" + 1 -> "1" + "1" -> "11"
		System.out.println("123"+4);
		System.out.println(7777777777L); // L�� �������ν� int���� �ƴ� long������ �� ū���� �����ϰڴٴ� ���̴�.
	}
}