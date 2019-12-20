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
				System.out.println("���������� ����Ǿ����ϴ�.");
			else
				System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�."); 
		}
		
		System.out.println("��ǰID		��ǰ��		����.");
		System.out.println("---------------------------------------");	
		for(Product s : set) {
			System.out.println(s);

		}
	}
}
