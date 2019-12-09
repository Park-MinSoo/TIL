package day5;
public class LottoMachine {
	public static void main(String[] args) {
	int lotto[] = new int [6];
	int n;	
		for(n= 0; n < lotto.length ; n++) {
			lotto[n] = (int) (Math.random()*45)+1;
			
			for( int i = 0; i < n ; i++)
					if(lotto[n]==lotto[i]) {
						n--;
						break;

					}
		}
		System.out.print("오늘의 로또 번호 - ");

		for(n=0 ; n<lotto.length ; n++) {
			if(n==lotto.length-1)
			System.out.print(lotto[n]);
			else
			System.out.print(lotto[n] + ", ");
}
}

}
