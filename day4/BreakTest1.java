package day4;
public class BreakTest1 {
	public static void main(String[] args) {
		boolean flag = false;
		for(int dan = 1; dan <=9; dan++) {
			for(int num=1; num <=9; num++) {
				if(dan*num > 30) {
					flag = true;
					break;			
			}
				System.out.print(dan+"x"+num+"="+dan*num+"\t");
		}
			System.out.println();
			if(flag == true) // boolean인 경우에만 한해서 비교연산식을 생략하고 flag라는 변수만 주어도 정상적으로 동작한다.
				break;
		}
		System.out.println("구구단 출력 종료!!");
	}
}
