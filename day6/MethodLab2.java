package day6;
public class MethodLab2 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*30)+1;
		int num2 = (int)(Math.random()*30)+1;
		int data = operate(num1,num2);
	for(int i=1;i<=5;i++)	
		System.out.println(num1 + " 와 " + num2 + " 의 차는 " + data + " 입니다.");	
	}
	
	static int operate(int num1, int num2) {
		int result = 0;
		if(num1 > num2)
			result = num1 - num2;
		else if(num2 > num1)
			result = num2 - num1;
		else
			result = 0;
	return result;
	}
}

