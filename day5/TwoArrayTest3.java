package day5;
public class TwoArrayTest3 {
	public static void main(String[] args) {
		int nums[][] = {
						{10,20,30,40},
						{11,21,31,41},
						{12,22,32,42}		
						};	

	int sum = 0;
	for(int i =0; i < nums.length;i++) 
		for (int j=0; j < nums[i].length; j++)
			sum += nums[i][j];
	System.out.println("전체 데이터의 합 : "+ sum);
	
	int sumRow=0, sumCol =0;
	
	//마지막 행의 데이터만 합산하여 sumRow에 저장
	for(int j =0; j < nums[2].length;j++) // -> 열의 변수는 nums[해당행].length 를 해야한다.
		sumRow += nums[2][j];
	
	//두번째 열의 데이터만 합산하여 sumCol에 저장
	for(int i =0; i < nums.length;i++) //-> 행의 변수는 그냥 nums.length 하면 된다.
		sumCol += nums[i][1];
	
	System.out.println("마지막 행의 데이터의 합 : "+ sumRow);
	System.out.println("두번째 열의 데이터의 합 : "+ sumCol);
  }
}
