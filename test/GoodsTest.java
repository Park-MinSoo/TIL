package test;
public class GoodsTest {
	public static void main(String[] args) {
		
		Goods p1 = new Goods("PRD-0001","��ũ��ǻ��", 10000, 'N');
		Goods p2 = new Goods("PRD-0002","�ν���ǻ��",20000);
		//System.out.printf("%,d��",price);
		System.out.println(p1.getGoodsInfo());
		System.out.println(p2.getGoodsInfo());

	}
}
