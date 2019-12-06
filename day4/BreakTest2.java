package day4;
public class BreakTest2 {
	public static void main(String[] args) {
		unico : for(int dan = 1; dan <=9; dan++) { // unico 라는 라벨을 붙여주었다.
			for(int num=1; num <=9; num++) {
				if(dan*num > 30) {
					System.out.println();
					break unico;	// 라벨을 break 함으로 한꺼번에 빠져 나올 수 있게된다.
				}
				System.out.print(dan+"x"+num+"="+dan*num+"\t");
			}
			System.out.println();
		}
		System.out.println("구구단 출력 종료!!");
	}
}
