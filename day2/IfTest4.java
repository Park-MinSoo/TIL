package day2;
public class IfTest4 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101);
		
		if(score >= 90)
			System.out.println(score + " : A���");
		else if(score >= 80)
			System.out.println(score + " : B���");
		else if(score >= 70)
			System.out.println(score + " : C���");
		else if(score >= 60)
			System.out.println(score + " : D���");
		else
			System.out.println(score + " : F���");
		System.out.println("��������!!");
	}
}
