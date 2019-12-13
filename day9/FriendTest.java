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
	
	public String getInfo()	{	// -----> '다형성'!!!! 조상이 public이면 자손도 반드시 public이여아한다. 더 좁아질수는 없다.
		return super.getInfo() + phoneNum + email;
	}
}

public class FriendTest {
	public static void main(String[] args) {

		Person f1 = new Friend("박민수	","010-6332-9867	","js616zz@naver.com");
		Person f2 = new Friend("박보검	","010-1232-8489	","bogum12@naver.com");
		Person f3 = new Friend("김희철	","010-5132-2747	","Star777@gmail.com");
		Person f4 = new Friend("장동건	","010-7672-1236	","DDonggg@naver.com");
		Person f5 = new Friend("강동원	","010-6352-9745	","tuna111@gmail.com");
		
		System.out.printf(" 이름 	        전화번호                         메일주소\n");
		System.out.println("---------------------------------------");
		System.out.println(f1.getInfo());
		System.out.println(f2.getInfo());
		System.out.println(f3.getInfo());
		System.out.println(f4.getInfo());
		System.out.println(f5.getInfo());
	
		}
	}

