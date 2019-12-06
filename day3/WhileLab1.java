package day3;
public class WhileLab1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+5;

		System.out.println("[for 결과]");{
			for(int vNum=1;vNum<=num;vNum++)
			System.out.println(vNum + " -> " + vNum*vNum);
		
		}
		
		System.out.println("[while 결과]");{
			int wNum = 0;
			while(wNum<=num) {
			System.out.println(wNum + " -> " + wNum*wNum);
			wNum += 1;

			}
		}
		
		
		
		
		
		
		
	}

}
