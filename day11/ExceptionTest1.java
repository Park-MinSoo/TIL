package day11;

public class ExceptionTest1 {

	public static void main(String[] args) throws InterruptedException{//오류처리를 해야하는 메소드 처리의 이해
		System.out.println("수행시작");
		Thread.sleep(3000);//1초간 쉬고 싶다면 Thread.sleep(1000)
		System.out.println("수행종료");

	}

}
