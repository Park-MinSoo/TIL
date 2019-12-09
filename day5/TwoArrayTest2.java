package day5;
public class TwoArrayTest2 {
	public static void main(String[] args) {
		int[][] twoA = {{1,2,3}, {4,5,6}, {7,8,9}};	// -> 3행 x 3열 행렬이다.
		
		System.out.println(twoA);	//행의 배열의 참조값
		System.out.println(twoA[0]);	//첫 번째 행이 참조하는 열의 배열의 참조값
		System.out.println(twoA[0][0]);	//1행 1열의 원소 값
		
		for(int row=0; row < twoA.length; row++) {	//-> 행의 갯수만큼 도는 for문
			for(int col=0; col <twoA[row].length; col++) {	//-> 각 행마다의 열의 갯수만큼 도는 for문
				System.out.print(twoA[row][col] + "\t");
			}
			System.out.println();
		}
		
	}
}
