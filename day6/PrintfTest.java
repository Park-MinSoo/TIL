package day6;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("�׽�Ʈ�Դϴ�\n");		// %n
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);	// %x�� 16����, %d�� 8����, %c�� ����
		System.out.printf("%#x %#X %#o\n", 100, 100, 100);	// 16������ ������ �� 0x�� �տ� ���δ�. %x ���̿� #�� ���̸� �ȴ�.
		System.out.printf("%c %c %c %c\n", '��', 'A', '!', '3' );
		System.out.printf("%b\n", true);	//boolean ���� ���
		System.out.printf("%f %e\n", 100.0, 100.0);	//%f�� �⺻���� �Ҽ��� 6° �ڸ����� ��Ÿ����. %e�� ��������
		System.out.printf("%.2f\n", 123.5678);
		System.out.printf("|%s|\n", "�ڹ�");	//���ڿ� ������ ����� %s�̴�.
		System.out.printf("|%10s|\n", "�ڹ�");
		System.out.printf("|%-10s|\n", "�ڹ�");	// �̷������� ���ڿ��� ������ ������ �� �ִ�.
		System.out.printf("%,d��\n", 1000000);	// %,d������ 1000���� ���� , �˾Ƽ� ����ش�.
	}
}


