package day3;
public class ForLab5 {
	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 0;		
		
		for(int num=1; num<=100;num++ )
			
			if((num%2) == 0)
				evenNum = evenNum + num;
			
			else 
				oddNum = oddNum + num;
		
		System.out.println("1���� 100������ ���ڵ� �߿���");
		System.out.println("¦���� ���� " + evenNum + " �̰�");
		System.out.println("Ȧ���� ����" + oddNum + " �̴�.");

	}
}
