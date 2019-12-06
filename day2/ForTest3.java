package day2;
public class ForTest3 {
	public static void main(String[] args) {
		for(int num=1;num <= 20; num++)
			System.out.print(num+" ");	
		System.out.println();
	
	
		for(int num=20;num >= 1; num--)
			System.out.print(num+" ");	
		System.out.println();
	
		
		for(int num=20;num >= 1; num-=3) // 20 17 14 11 8 5 2
			System.out.print(num+" ");	
		System.out.println();
	
		
		for(int num=10;num >= 1; num-=3) // 10 7 4 1
			System.out.print(num+" ");	
		System.out.println();
		
		
		int num;
		for(num=10;num >= 1; num-=3) // int를 먼저 설정해주면 for구문에서만이 아닌 앞으로도 계속 사용할수 있다. but 메모리 잡아먹겠죠?
			System.out.print(num+" ");
		System.out.println();
		
		System.out.print(num); // int num 설정을 For문 밖에서 했기 때문에 값이 출력되어 나와진다.
	}
}
