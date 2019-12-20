package day14;

import java.util.HashSet;

class Member3 {
	private int id;
	private String name;
	private String password;
	Member3(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public boolean equals(Object o) {
		if (o != null && o instanceof Member3) {
			Member3 m = (Member3) o;			
			if (id ==  m.id && 
					name.equals(m.name) && 
							password.equals(m.password))
				return true;
		}
		return false;
	}	
	public int hashCode() {
		return id+name.hashCode()+password.hashCode();	//	숫자값은 같으면 같은거기 때문에 id는 그냥 덧셈 처리 했다.
		//똑같은 문자열 내용일때 똑같은 통에담기도록 하기위함-> equals와 hashCode를 오버라이딩 해줘야한다
	}
	
	public String toString() {	// toString : 어떤 객체의 정보를 하나의 문자열로 return 해주는 메서드이다.
		return "("+id+":"+name+":"+password+")";
	}
}
public class ObjectTest3 {
	public static void main(String args[]) {
		Member3 obj1 = new Member3(10, "자바", "duke");
		Member3 obj2 = new Member3(10, "자바", "duke");
		Member3 obj3 = new Member3(20, "자바", "duke");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());	
		System.out.println(obj3.hashCode());	
		HashSet<Member3> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		System.out.println("저장된 데이터의 갯수 : " + set.size()); //	 최종적으론 저장된 데이터의 갯수는 2개가 된다.
		//obj1과 obj2가 같은 내용이기 때문(중복을 판단한것이다.=> hashCode와 equals를 오버라이딩했기 떄문)
		System.out.println(set);
	}
}




