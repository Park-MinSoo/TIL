package day11;

public class ExceptionTest2 {

	public static void main(String[] args) {//오류처리를 해야하는 메소드 처리의 이해
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result= num1/num2;
			System.out.println("연산결과: "+result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2개 전달하세요!!");
		} catch (ArithmeticException e) {
			e.printStackTrace();//어떤 행에서 예외가 발생했는지 알고 싶을때
			/*예외가 발생할 때의 콜스텟 정보를 호출하세요
			 호출하면 결과 java.lang.ArithmeticException: / by zero
			at day11.ExceptionTest2.main(ExceptionTest2.java:10)로 나옴 */
			
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!");
			
			return;//메인메소드의 리턴은 JVM에게 돌아가겠다는 뜻으로 프로그램을 끝나겠다라는 것
			//return 했는데도 불구하고 finally 수행한다.
			
		} catch (NumberFormatException e) {
			//예외 클래스는 Exception라는 부모 클래스가 있다.(Exception e)로 선언해도 된다.
			//그러나 첫번째 catch 블럭에 Exception e을 넣으면 에러가 난다. 조상일수록 아래에 자손일수록 위에 catch 블럭을 작성해야 한다.
			e.printStackTrace();
			System.out.println("프로그램 아큐먼트로 숫자를 전달하세요!!");
		} finally {
			System.out.println("항상 수행!!");
		}		
		System.out.println("수행종료");
	}
}
