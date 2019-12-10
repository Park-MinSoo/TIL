package day6;
public class MethodLab1 {
	public static void main(String[] args) {
		operate('@',3);
		System.out.println();	
		operate('%',4);
		System.out.println();	
		operate('A',5);
		System.out.println();	
		operate('°¡',3);
		
	}
	
	static void operate(char deco, int num) {
		for(int i=1; i<= num; i++)
			System.out.print(deco);

	}
}

