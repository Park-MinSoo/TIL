package exercise;

class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human() {
	}
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String printInformation() {
		return name + "	" + age + "	"  + height + "	"  + weight;
	}
}

class Student extends Human {
	private String number;
	private String major;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name,age,height,weight);
		this.number = number;
		this.major = major;
	}
	
	
	public String printInformation()	{	
		return super.printInformation() + "	"  + number + "	"  + major;
	}
}

public class studentTest {
	public static void main(String[] args) {

		Student arrays [] = new Student[3];
		arrays[0] = new Student ("ȫ�浿", 20, 171, 81, "201101", "����");
		arrays[1] = new Student("��浿", 21, 183, 72, "201102", "����");
		arrays[2] = new Student("�ڱ浿", 22, 175, 65, "201103", "�İ�");
		

		System.out.println(arrays[0].printInformation());
		System.out.println(arrays[1].printInformation());
		System.out.println(arrays[2].printInformation());

		}
	}

