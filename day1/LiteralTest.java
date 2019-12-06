package day1;
public class LiteralTest {
	public static void main(String[] args) {
		System.out.println(1+1);   	 //2
		System.out.println(1.0+1);   //2.0  1.0+1 -> 1.0 + 1.0 -> 2.0
		System.out.println('1'+1);   //50   1이라는 문자의 값 49 (각각의 키마다 정해진 코드값이 정해져 있음 -> ASCII code)
		System.out.println("1"+1);   //11	"1" + 1 -> "1" + "1" -> "11"
		System.out.println("123"+4);
		System.out.println(7777777777L); // L을 붙임으로써 int형이 아닌 long형으로 더 큰수를 포현하겠다는 뜻이다.
	}
}