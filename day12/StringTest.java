package day12;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("������".length()); 					
		System.out.println("abc".charAt(1));	// 0, 1, 2 �̹Ƿ� b �� �������� �ȴ�.
		System.out.println("abc".toUpperCase());	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4)); 		//5��° ��ġ ���� ������ ~    
		System.out.println(str1.substring(0, 3));  	//0��° ���� 3��° ��ġ����
		System.out.println(str2.indexOf("f"));      //5��° ��ġ 		  
		System.out.println(str2.lastIndexOf("f"));  //������ f�� ��ġ
		System.out.println(str2.replace('h', 'H'));	// h�� H�� �ٲ۴�(��ü�Ѵ�)
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");   // ���� ������ �迭�� ��Ƽ� ���� �ٲٴ� ���̴�. split
		
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













