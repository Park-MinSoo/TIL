package day6;
public class MethodTest8 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		char[] returnValue = getName(1);
		System.out.println(returnValue);
		System.out.println("main() ��������");
	}
	static char[] getName(int type) {
		char ary[];
		if(type == 1)
			ary = new char[] {'J', 'A', 'V', 'A'};
		else 
			ary = new char[] {'P', 'Y', 'T', 'H', 'O', 'N'};
		return ary;
	}
}
