package day4;
public class CharacterTest2 {
	public static void main(String[] args) {

		  char v1 = '가';
		  char v2 = '\uAC00';	// 44032,, 아스키코드는 영어만 있고 한글이나 일본어는 없다.,, 전세계적으로 통합한것은 유니코드다~~
		  
		  System.out.println(v1);
		  System.out.println(v2);
		  System.out.println((int)v1);
		  System.out.println((int)v2);
		  System.out.println((double)v1);
		  System.out.println((double)v2);


	}

}
