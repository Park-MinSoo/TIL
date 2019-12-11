package day7;

class Product {	
	String name;
	int balance;
	int price;
	
	Product(){
	/*	name = "��ũ����";
		balance = 5;
		price = 10000; */
		this("��ũ���� ",5,10000);
	}
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;	
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	int getPrice() {
		return price;
	}

}
public class ProductTest {

	public static void main(String[] args) {
		Product z1 = new Product();
		System.out.print(z1.getName());
		System.out.print(z1.getBalance());
		System.out.printf(" %,d��\n",z1.getPrice());

		Product z2 = new Product("�峭�� ", 12, 12000);
		System.out.print(z2.getName());
		System.out.print(z2.getBalance());
		System.out.printf(" %,d��\n",z2.getPrice());
		
		Product z3 = new Product("��ũ��Ʈ ", 1, 13332000);
		System.out.print(z3.getName());
		System.out.print(z3.getBalance());
		System.out.printf(" %,d��\n",z3.getPrice());
		
		Product z4 = new Product("��Ƽ�� ", 60, 1000);
		System.out.print(z4.getName());
		System.out.print(z4.getBalance());
		System.out.printf(" %,d��\n",z4.getPrice());
		
		Product z5 = new Product("�Һ� ", 12, 6000);
		System.out.print(z5.getName());
		System.out.print(z5.getBalance());
		System.out.printf(" %,d��\n",z5.getPrice());
		
	}

}
