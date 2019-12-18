package day12;

import java.util.Date;

class Value {
	int value;
	Value(int value){
		this.value = value;
	}
	 public boolean equals(Object obj) {
		boolean result = false;
        if(obj != null && obj instanceof Value)
        	if(value == ((Value)obj).value)	// 조상형이기 때문에 자손형으로 형변환해야지만 value를 사용할 수 있다., 동일한 객체냐 까지 판별하게 된것.
        		result = true;
		return result;
    } 
}
public class EqualsTest {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); // f
		System.out.println(v1.equals(v3));   // f
		System.out.println(v1.equals(v2));   // t
		System.out.println(v1.equals(new Date()));   // f
		if(v1 == v2) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1;
		if(v1 == v2) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다");
		String s4 = new String("가나다");	// -----> 얘네는 정식으로 new로 객체 생성해달라 한것이므로 객체가 생성된다.
		
		System.out.println(s1 == s2);	// true -----> 똑같은 내용의 문자열의 리터럴을 여러개 생성하게되면 실제 객체는 하나만 생성되게 된다.
		System.out.println(s3 == s4);	// false
		System.out.println(s1.equals(s2));	// true
		System.out.println(s3.equals(s4));	// true
		
	}
}
