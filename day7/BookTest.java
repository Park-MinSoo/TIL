package day7;

class BookTest1 {	
	String title;
	String author;
	int price;
	
	BookTest1(){
	/*	title = "�ڹ��� ����";
		author = "���ü�";
		price = 30000; */
		this("�ڹ��� ����", "���ü�", 30000);
	}
	BookTest1(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;	
	}
	String getBookInfo() {
		return "å �̸� : " + title + "å ���� : " + author + "���� : " + price;
	}

}
public class BookTest {
	public static void main(String[] args) {
		BookTest1 b1 = new BookTest1();
		System.out.println(b1.getBookInfo());
		
		BookTest1 b2 = new BookTest1("������ ����", "������", 15000);
		System.out.println(b2.getBookInfo());
		
		BookTest1 b3 = new BookTest1("������ ����", "��ö��", 23000);
		System.out.println(b3.getBookInfo());
		
		BookTest1 b4 = new BookTest1("������ ����", "¯��", 17000);
		System.out.println(b4.getBookInfo());
		
		BookTest1 b5 = new BookTest1("��ġ�� ����", "�����", 35000);
		System.out.println(b5.getBookInfo());
		
	}
}
