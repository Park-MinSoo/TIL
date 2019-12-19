package day13;


import java.util.*;

public class HashLab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String s;
		int i;
		while(map.size()<5) {
		System.out.printf("나라이름을 입력하세요: ");
		s = sc.next();		
		System.out.printf("인구 수를 입력하세요: ");
		i = sc.nextInt();
		sc.nextLine();
		if(!map.containsKey(s))
			{map.put(s,i);
			System.out.println("저장되었습니다.");}
		else
			System.out.println("나라명"+s+"는 이미 저장되었습니다.");
		
	   
	   	
		}
		sc.close();
		System.out.println("5개가 모두 입력되었습니다.");
		System.out.print("입력된 데이터:");		
		Iterator <String> it=map.keySet().iterator();
		
		while(true) {
			s=it.next();
			i=map.get(s);
			System.out.printf("%s(%d)",s,i);
			if(it.hasNext())
				System.out.print(",");
			else break;
		}
				//+map.keySet()+"(");
		
		
	}

}//contains key
