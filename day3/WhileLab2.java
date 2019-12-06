package day3;
public class WhileLab2 {
	public static void main(String[] args) {
		int pairNum1 = (int)(Math.random()*6)+1;
		int pairNum2 = (int)(Math.random()*6)+1;
		
		
		while(true) {
			if(pairNum1 > pairNum2) {
				System.out.println(pairNum1 + "이" +pairNum2 + "보다 크다.");
			} 
			else if (pairNum1 < pairNum2){
			System.out.println(pairNum1 + "이" +pairNum2 + "보다 작다.");	
			}
			else
				System.out.println("게임 끝");	
			break;
	}
}
}
