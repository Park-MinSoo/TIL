package day13;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();//Value1 String 객체만 처리 가능
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();//어떤 객체든 저장은 할 수 있다.
		o2.put("abc");
		String s2 = (String)o2.get(); //꺼낼때 형변환 해줘야 한다.
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();
		//	Value3<String> o3 = new Value3<>-> 여기에 빈꺽세괄호만 줘도 된다 java8부터 
		// 원래는 	Value3<String> o3 = new Value3<String>(); java8이전에는 이렇게 줘야 한다.
		o3.put("abc");
		String s3 = o3.get(); //형변환을 하지 않아도 된다.
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();
		//o4.put("abc"); 타입파라미터로 Date를 줬기 때문에 반드시 Date가 와야한
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}


class Value1 {//String 객체만 저장할 수 있다.
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
class Value2 {
	//String, StringBuffer, 기본형 등이 들어갈 수 있다. 대신에 put으로 객체를 넣을때는 상관 없지만 꺼낼때는 형변환을 해야한다.\
	//기존에 Generic 구문이 없어서 이렇게밖에 처리를 못했다.
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// Value3<Card> v = new Value3<Card>();//객체생성시 타입파라미터를 <Card>로 주면 T가 Card로 바뀐다. 매개변수, return값
// Value3<String> v = new Value3<String>();객체생성시 타입파라미터를 <String>로 주면 T가 Card로 바뀐다. 매개변수, return값
//클래스가 처리할 데이터 타입을 객체생성시점에서 정하겠다라는 구문이다.
//Generic 구문 전에는 데이터 타입을 처음부터 정해야 했지만 Generic을 사용하면 데이터 타입을 객체 생성시마다 동적으로 변화줄 수 있다.

class Value3<T> {//<T> 꺽세괄호 안에 아무거나 넣어도 된다. element의 타입을 의미함
	//객체생성시 TT라는 타입 파라미터를 받을 것이라는 의미이다.
	T obj;
	void put(T obj){
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}













