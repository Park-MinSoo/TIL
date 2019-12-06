package day3;
public class ForLab4 {
	public static void main(String[] args) {
		int a = (int)(Math.random()*8+3);
		int b = (int)(Math.random()*3+1);
		
			if(b == 1)
			 for(int n=0;n<=a;n++)
			System.out.print("*");

			else if(b == 2)
				 for(int n=0;n<=a;n++)
				System.out.print("$");
		
			else
				 for(int n=0;n<=a;n++)
				System.out.print("#");
		
		
	}
}
