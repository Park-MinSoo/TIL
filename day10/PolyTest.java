package day10;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());//이렇게 하면 더이상 접근 못한다. 한번만 사용하면 변수에 담지 않아도 된다.
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:\\TEMP"));//아규먼트 줘야하는 것
		printObjectInfo(new java.io.File("c:/TEMP"));// "/"이거는 한번만 해도 되고 "\\" 이거는 두번 입력해야 한다. 
		//io는 input, output의 약자이다.	
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5]);
		printObjectInfo(new day7.Member());		
		printObjectInfo(new Integer(100));			
	}
	static void printObjectInfo(Object o) {//java.lang은 자동으로 import된다. 
//	static void printObjectInfo(String o) {//이것으로 하면 String으로 받는것은 오류가 난다.
	if(o instanceof String) {// insttanceof 부모타입 == true
		System.out.println("문자열 객체 전달됨: "+o.getClass().getName()+"  -"+((String) o).length());
	}else {
	System.out.println("전달된 객체의 클래스명: "+o.getClass().getName());
	}
	}
}
