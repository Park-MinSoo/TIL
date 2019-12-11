package day7;

class BookTest1 {	
	String title;
	String author;
	int price;
	
	BookTest1(){
	/*	title = "자바의 정석";
		author = "남궁성";
		price = 30000; */
		this("자바의 정석", "남궁성", 30000);
	}
	BookTest1(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;	
	}
	String getBookInfo() {
		return "책 이름 : " + title + "책 저자 : " + author + "가격 : " + price;
	}

}
public class BookTest {
	public static void main(String[] args) {
		BookTest1 b1 = new BookTest1();
		System.out.println(b1.getBookInfo());
		
		BookTest1 b2 = new BookTest1("수학의 정석", "지은이", 15000);
		System.out.println(b2.getBookInfo());
		
		BookTest1 b3 = new BookTest1("공사의 정석", "김철수", 23000);
		System.out.println(b3.getBookInfo());
		
		BookTest1 b4 = new BookTest1("연애의 정석", "짱구", 17000);
		System.out.println(b4.getBookInfo());
		
		BookTest1 b5 = new BookTest1("정치의 정석", "대통령", 35000);
		System.out.println(b5.getBookInfo());
		
	}
}
