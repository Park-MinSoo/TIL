package day13;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();//LinkedList()는 타입을 지정해줘야 한다. 지정해주지 않으면 자동으로 Object로 지정된다.
		list.add("java");
		list.add("100"); 
		//list.add(100);이렇게 하면 예외가 발생한다. java.lang.ClassCastException 
		//->객체 형이 다른 형태 캐스팅 할때 맞지 않으면 나는 오류로 integer는 String 형이 될 수 없다는 에러
		//컴파일에러는 고칠 수 있지만 실행 에러는 문제가 커진다.
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)//size() LinkedList에 들어있는 크기
			System.out.println(list.get(i));
		System.out.println();		
		
		for(Object value : list) {
			String s = (String)value;		
			System.out.println(s);
		}
		System.out.println();		
		
		Iterator iter = list.iterator();
		//Iterator:인터페이스, 콜렉션 객체가 뭐가 됬든 그 안에 있는 데이터들을 하나하나 꺼내는 기능을 규약시켜 놓은것
		//set 객체든 list 객체든 모두 꺼낼 수 있다.
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
	}
}
