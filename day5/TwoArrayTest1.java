package day5;
public class TwoArrayTest1 {
	public static void main(String[] args) {
	/*	int[] a1 = new int[10];
		char a2[] = {'가','나','다'};
		double a3[] = new double[5];
		
		System.out.println(a1.length + ":" + a2.length + ":" + a3.length);
		System.out.println(a1 + " - " + a1[0]);
		System.out.println(a3 + " - " + a3[0]);	// -> 출력되어 나오는 @뒤의 값 = 참조값이다. (자기가 부여한 주솟값)
		System.out.println(a2 + " - " + a2[0]);	*/
		
		int[][] a4 = new int[5][12];	 // -> 5행 x 12열
		
		System.out.println(a4);
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		System.out.println(a4[3]);
		System.out.println(a4[4]);
		System.out.println(a4.length);	// -> 전체 행의 크기 '5'
		System.out.println(a4[0].length);	// -> 1행에 해당하는 열의 배열의 크기 '12'
		System.out.println(a4[1].length);	// -> 2행에 해당하는 열의 배열의 크기 '12'
		System.out.println(a4[2].length);
		System.out.println(a4[3].length);
		System.out.println(a4[4].length);


	}
}
