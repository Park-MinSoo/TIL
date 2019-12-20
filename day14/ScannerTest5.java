package day14;
import java.util.*;
public class ScannerTest5 {
   public static void main(String args[]) {
      String str1 = "I love Java";
      Scanner scan = new Scanner(str1);	// 문자열을 가지고 스캐너 객체 생성이 가능하다.
      while(scan.hasNext())
          System.out.println(scan.next());
      scan.close();
      String str2 = "I:love:Java";	// 원하는 단위마다 쪼개서 읽고 싶을때 Delimiter로 나누어 나누어진 '토큰' 단위로 읽게된다.
      scan = new Scanner(str2);
      scan = scan.useDelimiter(":");	//  :을 Delimiter로 사용한 것이다.
      while(scan.hasNext())
          System.out.println(scan.next());
      scan.close();      
      String str3 = "1 fish    2 fish red fish blue fish";
      scan = new Scanner(str3);
      scan = scan.useDelimiter("\\s*fish\\s*");	// 정규표현식  // 앞이나 뒤에 공백이 0개이상 있을수 있는식이 Delimiter로 쓰인다.
      System.out.println(scan.nextInt());
      System.out.println(scan.nextInt());
      System.out.println(scan.next());
      System.out.println(scan.next());      
      scan.close();
   }
}





