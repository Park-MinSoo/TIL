package day11;

import java.util.Random;


class DuplicateException extends Exception {
    DuplicateException() {
    super("중복된 로또 번호가 발생했습니다");
    		
    }
}

public class LottoGame {

	public static void main(String[] args) {		
		LottoMachine lotto = new LottoMachine();
		lotto.createLottoNums();
		try { lotto.checkLottoNums();}
		catch(DuplicateException e) {
			System.out.println(e.getMessage());
			return;
		}	
		int num[] = lotto.getNums();
		for(int i=0; i<6; i++) {
			if(i==5)
				System.out.printf("%d ",num[i]);
			else
				System.out.printf("%d, ",num[i]);
			}
		}
}


class LottoMachine {
	private int nums[];
	public LottoMachine(){
		nums = new int[6];
	}
	public void createLottoNums() {
		Random rand = new Random();
		for(int n=0 ; n<6 ; n++)    
			nums[n]=rand.nextInt(20)+1;
	}
	public void checkLottoNums() throws DuplicateException{
		for(int i=0 ; i<5 ; i++)
			for(int n=i+1; n<5; n++)
				if(nums[i]==nums[n]) 
					throw new DuplicateException();
									
	}
	public int[] getNums() {
		return nums;
	}
	
}
