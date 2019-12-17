package day11;
import java.util.Random;
class TestException extends Exception {
	TestException(String message){
		super(message);//super를 호출함으로써 메세지 생성하는 것이다.
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a()  {
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e){	//catch 블럭이 호출되면 메모리 값에 던져진 참조 값을 e에게 준다.(getMessage)
			System.out.println("오류 발생 : "+e.getMessage());
		}
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {
		//throws TestException { 이거 없으면 에러난다. 
		// c 메소드는 예외가 발생할 수 있으니 그리 알아라 하는 구문이다.
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean();
		//객체 생성해서 바로 멤버에 담아야 하는 것은 아니다. 한번만 쓸거면 위와 같이 해도 된다. 그러나 이렇게 하면 객체의 멤버를 한번밖에 사용할 수 없다.
		//렌덤변수로 Boolean 
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>");
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		
		System.out.println("c()수행종료");
	}	
}
//printStackTrace(): 호출정보 출력
//getMessage(): 오류 메시지 출력






