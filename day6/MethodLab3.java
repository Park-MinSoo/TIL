package day6;
public class MethodLab3 {
	public static void main(String[] args) {
		int data1 = getRandom(10);
	for(int i=1;i<=4;i++)	
		System.out.print(data1 + ",");	
	System.out.print(data1);	

	System.out.println();	

		int data2 = getRandom(10,20);
	for(int i=1;i<=4;i++)	
		System.out.print(data2 + ",");
	System.out.print(data2);	

	
	}
	
	public static int getRandom(int n) {
		int result = 0;
		result = (int)(Math.random()*n)+1;
		return result;
	}
	public static int getRandom(int n1, int n2) {
		int result = 0;
		result = (int)(Math.random()*n2)+n1;
		return result;
	}
}

