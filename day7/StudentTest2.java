package day7;

class StudentNew {
	String name;
	int age;
	String subject;
	StudentNew(String p1, int p2, String p3){
		name = p1;
		age = p2;
		subject = p3;
	}
	void printStudentInfo() {
		System.out.println(name + "�л��� ���̰� " + age + " �Դϴ�.");
	}
	void study() {
		System.out.println(name + "�л��� " + subject + " ������ �н��մϴ�.");
	}
	void study(int hour) {
		System.out.println(name + "�л��� " + subject + " ������ " + hour + "�ð� ���� �н��մϴ�.");
	}
}
public class StudentTest2 {
	public static void main(String[] args) {
		StudentNew st1 = new StudentNew("��ũ", 24, "JavaScript");
		System.out.println(st1);
		st1.study(2);
		
		StudentNew st2 = new StudentNew("�Ѹ�", 100, "Scalar");
		System.out.println(st2);
		st2.study(2);
	}
}
