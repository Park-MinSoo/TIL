package day7;

class MemberTest1 {
	String name;
	String account;
	String passwd;
	int birthyear;

	MemberTest1(String p1, String p2, String p3, int p4) {
		name = p1;
		account = p2;
		passwd = p3;
		birthyear = p4;
	}

	void printMemberInfo1() {
		System.out.println("ȸ��1 : " + name + "(" + account + "," + passwd + "," + birthyear + ")");
	}

	void printMemberInfo2() {
		System.out.println("ȸ��2 : " + name + "(" + account + "," + passwd + "," + birthyear + ")");
	}

	void printMemberInfo3() {
		System.out.println("ȸ��3 : " + name + "(" + account + "," + passwd + "," + birthyear + ")");
	}

}

public class MemberTest {
	public static void main(String[] args) {
		MemberTest1 mb1 = new MemberTest1("�ڹμ�", "6332", "9867", 1995);
		mb1.printMemberInfo1();

		MemberTest1 mb2 = new MemberTest1("�����", "1234", "5678", 2015);
		mb2.printMemberInfo2();

		MemberTest1 mb3 = new MemberTest1("�ϼ���", "9876", "5432", 2005);
		mb3.printMemberInfo3();

	}
}
