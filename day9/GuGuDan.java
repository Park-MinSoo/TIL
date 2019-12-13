package day9;

class Multiplication {
	private int dan;
	private int number;
	Multiplication() {}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	public void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication {
	GuGuDanExpr() {		
		super();	
	}
	GuGuDanExpr(int dan) {		
		super(dan);	
	}
	GuGuDanExpr(int dan, int number) {		
		super(dan,number);	
	}
	public static void printAll()	{
		 for (int row = 1; row<=9; row++){
			 System.out.println();
			 for(int col = 1; col<=9; col++)
			 System.out.print( row + "*" + col + "=" + row * col + " ");
		 }
	}
}

public class GuGuDan {
	public static void main(String[] args) {

        int dan = day6.MethodLab3.getRandom(20);
        int number = day6.MethodLab3.getRandom(20);
		
        if(dan <= 9 && number <=9) {
        	Multiplication function1 = new GuGuDanExpr(dan, number);
        	System.out.print(dan + "*" + number + " = ");
        	function1.printPart();
        }
        	
        else if(dan <= 9 && number > 10) {
        	Multiplication function2 = new GuGuDanExpr(dan);
        	System.out.print(dan + "단 :");
        	function2.printPart();
        }
        else {
        	GuGuDanExpr.printAll();	// -----> static은 객체생성 따로 필요없이 바로 호출이 가능하다.
        }
	}
}
