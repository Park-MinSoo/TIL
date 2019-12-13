package day9;

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;
	Friend(String name, String phoneNum, String email) {		
		super(name);	
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo()	{	// -----> '������'!!!! ������ public�̸� �ڼյ� �ݵ�� public�̿����Ѵ�. �� ���������� ����.
		return super.getInfo() + phoneNum + email;
	}
}

public class FriendTest {
	public static void main(String[] args) {

		Person f1 = new Friend("�ڹμ�	","010-6332-9867	","js616zz@naver.com");
		Person f2 = new Friend("�ں���	","010-1232-8489	","bogum12@naver.com");
		Person f3 = new Friend("����ö	","010-5132-2747	","Star777@gmail.com");
		Person f4 = new Friend("�嵿��	","010-7672-1236	","DDonggg@naver.com");
		Person f5 = new Friend("������	","010-6352-9745	","tuna111@gmail.com");
		
		System.out.printf(" �̸� 	        ��ȭ��ȣ                         �����ּ�\n");
		System.out.println("---------------------------------------");
		System.out.println(f1.getInfo());
		System.out.println(f2.getInfo());
		System.out.println(f3.getInfo());
		System.out.println(f4.getInfo());
		System.out.println(f5.getInfo());
	
		}
	}

