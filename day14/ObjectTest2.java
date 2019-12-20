package day14;

class Member2 {
	private int id;
	private String name;
	private String password;

	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Member2) {	//	member2 객체가 제대로 왔는지 확인!
			Member2 m = (Member2) o;	// 형변환해서 접근해야 한다.
			if (id == m.id && 	//	id는 id 끼리 비교
					name.equals(m.name) && 	// name은 name 끼리 비교
							password.equals(m.password))	// password는 password 끼리 비교
				return true;
		}
		return false;
	}
}

public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "자바", "duke");
		Member2 obj2 = new Member2(10, "자바", "duke");
		Member2 obj3 = new Member2(20, "자바", "duke");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);		
		System.out.println(obj1.equals(null));
		System.out.println(obj1.equals(new java.util.Date()));
		System.out.println(obj1.equals(obj3));
	}
}
