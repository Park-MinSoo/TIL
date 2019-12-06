package day3;
public class ForTest4 {
	public static void main(String[] args) {
		// 1부터 10까지의 합을 출력
		int sum=0;
		
		/*for(int n=1; n <= 10; n++)
			sum = sum + n;
		
		System.out.println("sum = "+sum);*/
		
		for(int n=1; n <= 10; n++) {
			sum = sum + n;
		
		System.out.println("sum = "+sum); //-> 이렇게 중괄호로 묶어준 경우에는 sum값들 이 빠져나오는 모습 10번을 다 보여주게 된다.
		}
	}
}
