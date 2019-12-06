package day3;
public class ForTest6 {
	public static void main(String[] args) {
		// A~Z 까지 출력해 보자
		char munja = 'A';
		for(int n=1; n <= 26; n++) 
			System.out.print(munja ++);
		System.out.println("\n----------------");	//-> print 내용 안에 \n을 붙이게 되면 계행처리가 되어 (한 문장이 띄어진 채로) 나타나게 된다.
		
		for(munja ='A'; munja <= 'Z'; munja++) 
			System.out.print(munja);
		System.out.println("\n----------------");
		munja = 'A';
		for(int n=1; n <= 26; n++) {
			System.out.print(munja);
			munja +=1;
		}
		System.out.println("\n----------------");
		munja = 'A';
		for(int n=1; n <= 26; n++) {
			System.out.print(munja);
			munja = (char)(munja + 1);	// -> 그냥 넣으면 int형이 char 보다 크기 떄문에 오류가난다. 형변환을 하고 넣어야한다.
		}
		
	}
}
