package day5;
public class LottoMachine1 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random()*45)+1;
		int num2 = (int) (Math.random()*45)+1;
		int num3 = (int) (Math.random()*45)+1;
		int num4 = (int) (Math.random()*45)+1;
		int num5 = (int) (Math.random()*45)+1;
		int num6 = (int) (Math.random()*45)+1;

		{
			if (num2 == num1)
				num2 = (int) (Math.random()*45)+1;
			else if (num3 == num1 || num3 == num2)
				num3 = (int) (Math.random()*45)+1;
			else if (num4 == num3 || num4 == num2 || num4 == num1)
				num4 = (int) (Math.random()*45)+1;
			else if (num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1)
				num5 = (int) (Math.random()*45)+1;
			else if (num6 == num5 || num6 == num4 || num6 == num3 || num6 == num2 || num6 == num1)
				num6 = (int) (Math.random()*45)+1;
			else
				;

		}
		System.out.println("오늘의 로또 번호 - " + num1 + ","+ num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6);
	}
}
