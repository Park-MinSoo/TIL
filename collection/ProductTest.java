package collection;

import java.util.HashSet;

public class ProductTest {
	public static void main(String[] args) {

        HashSet<Product> set = new HashSet<Product>();		

        Product ary[] = new Product[4];
		ary[0] = new Product("p100", "TV", "20000");
		ary[1] = new Product("p200", "Computer","10000");
		ary[2] = new Product("p100", "MP3", "700");
		ary[3] = new Product("p300", "Audio", "1000");
		
		for(Product s : ary) {
			//set.add(s);
			if(set.add(s))
				System.out.println("성공적으로 저장되었습니다.");
			else
				System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다."); 
		}
		
		System.out.println("제품ID		제품명		가격.");
		System.out.println("---------------------------------------");	
		for(Product s : set) {
			System.out.println(s);

		}
	}
}
