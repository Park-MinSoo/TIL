package day5;
public class TwoArrayLab1 {
	public static void main(String[] args) {
		int[][] nums = new int [4][4];
		int k = 10;
		
			for( int i = 0; i < nums.length; i++) {
				
				for( int j = 0; j< nums[i].length; j++) {
					nums[i][j] = k;
					k += 2;
				}

		}
		System.out.println("1�� 1���� ������ : " + nums[0][0]);
		System.out.println("3�� 4���� ������ : " + nums[2][3]);
		System.out.println("���� ���� : " + nums.length);
		System.out.println("���� ���� : " + nums[0].length);
				
		System.out.print("3���� �����͵� : ");
		for(int j =0; j < nums[2].length;j++) 
		System.out.print(nums[2][j] + " ");
		
		System.out.println(); //////////////
		
		System.out.print("2���� �����͵� : ");
		for(int i =0; i < nums.length;i++)
	
		System.out.print(nums[i][1] +" ");

		
		System.out.println(); ///////////
		
		
		System.out.print("���� �밢�� �����͵� : ");
		for(int i =0; i < nums.length;i++)
		System.out.print( nums[i][i] +" ");
		
		System.out.println(); ///////////

		System.out.print("������ �밢�� �����͵� : ");
		for(int i= 0; i<nums.length;i++) 
			System.out.print(nums[i][nums.length-i-1]+" ");
		
	}
	
}
