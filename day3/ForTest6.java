package day3;
public class ForTest6 {
	public static void main(String[] args) {
		// A~Z ���� ����� ����
		char munja = 'A';
		for(int n=1; n <= 26; n++) 
			System.out.print(munja ++);
		System.out.println("\n----------------");	//-> print ���� �ȿ� \n�� ���̰� �Ǹ� ����ó���� �Ǿ� (�� ������ ����� ä��) ��Ÿ���� �ȴ�.
		
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
			munja = (char)(munja + 1);	// -> �׳� ������ int���� char ���� ũ�� ������ ����������. ����ȯ�� �ϰ� �־���Ѵ�.
		}
		
	}
}
