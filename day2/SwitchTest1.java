package day2;

public class SwitchTest1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10) +1;
		switch(num % 2) {
		case 0 : System.out.println(num + " : ¦��");
		            break;
		case 1 :	System.out.println(num + " : Ȧ��");
		}
	}
}
