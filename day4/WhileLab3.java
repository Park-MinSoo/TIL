package day4;
public class WhileLab3 {
	public static void main(String[] args) {
		int count = 0;
		int num;
		while(true) {
			 num = (int)(Math.random()*31);

			if(num <= 27 && num >=1) {
				char word = (char)(num + 64);
				System.out.println(word + "(" + num + ")");
				++count;
			}
			else

				break;
		}
		
		System.out.println("����Ƚ���� " + count + " ���Դϴ�.");	

	}

}
