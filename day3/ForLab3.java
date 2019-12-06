package day3;
public class ForLab3 {
	public static void main(String[] args) {
		int a = (int)(Math.random()*10+1);
		int b = (int)(Math.random()*10+30);
		int sum = 0;
		
		for(int n=a ; n<=b ; n++) {
		
			if(n%2 == 0)
			sum = sum + n;
			
			else
			sum = sum + 0;
		}
			System.out.println( a + " 부터 " + b + " 까지의  짝수의 합 : " + sum);
		
		
		
	}
}
