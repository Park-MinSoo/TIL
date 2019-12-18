package test;
public class GoodsTest {
	public static void main(String[] args) {
		
		Goods p1 = new Goods("PRD-0001","듀크컴퓨터", 10000, 'N');
		Goods p2 = new Goods("PRD-0002","턱시컴퓨터",20000);
		//System.out.printf("%,d원",price);
		System.out.println(p1.getGoodsInfo());
		System.out.println(p2.getGoodsInfo());

	}
}
