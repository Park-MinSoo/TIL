package day9;

class Book {	
	String title;
	String author;
	private int price;
	
	Book(){
	/*	title = "자바의 정석";
		author = "남궁성";
		price = 30000; */
		this("자바의 정석", "남궁성", 30000);
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		setPrice(price);
	}
	void setPrice(int price) {
		this.price = price;
		if (price <0)
			this.price = -price;
		else
		this.price = price;
	}
	String getBookInfo() {
		return "책 이름 : " + title + " 책 저자 : " + author + " 가격 : " + price;
	}

}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("자바의정석","남궁성",-30000);
		//b1.price = -30000;
		System.out.println(b1.getBookInfo());
		
	}
}
