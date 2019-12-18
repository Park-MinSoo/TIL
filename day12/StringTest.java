package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("가나다".length()); 					
		System.out.println("abc".charAt(1));	// 0, 1, 2 이므로 b 가 꺼내지게 된다.
		System.out.println("abc".toUpperCase());	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4)); 		//5번째 위치 부터 끝까지 ~    
		System.out.println(str1.substring(0, 3));  	//0번째 부터 3번째 위치까지
		System.out.println(str2.indexOf("f"));      //5번째 위치 		  
		System.out.println(str2.lastIndexOf("f"));  //마지막 f의 위치
		System.out.println(str2.replace('h', 'H'));	// h를 H로 바꾼다(대체한다)
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");   // 워드 단위로 배열에 담아서 행을 바꾸는 것이다. split
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray();
		System.out.println(str3.length() + " ---- " + ch.length);
		System.out.println(ch);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " "); 
		}
	}
}













