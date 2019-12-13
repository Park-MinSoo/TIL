package day9;

class Book {	
	String title;
	String author;
	private int price;
	
	Book(){
	/*	title = "�ڹ��� ����";
		author = "���ü�";
		price = 30000; */
		this("�ڹ��� ����", "���ü�", 30000);
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
		return "å �̸� : " + title + " å ���� : " + author + " ���� : " + price;
	}

}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("�ڹ�������","���ü�",-30000);
		//b1.price = -30000;
		System.out.println(b1.getBookInfo());
		
	}
}
