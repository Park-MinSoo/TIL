package day2;
public class OperTest3 {
	public static void main(String[] args) {
		int ivalue;
		char cvalue;
		double dvalue;
		boolean bvalue;
		
		ivalue = 100;
		cvalue = 'A';
		dvalue = 3.14;
		bvalue = true;
		
		System.out.println(ivalue);
		System.out.println(cvalue);
		System.out.println(dvalue);
		System.out.println(bvalue);
		
		ivalue = cvalue;	// -> ���ȴ�. int(4byte), char(2) �̱� ����
		System.out.println(ivalue);	// -> ���ڵ����͸� int�� ������ �˾Ƽ� ���� �����Ͱ��� �������� �ٲپ ��Ÿ����.
		
		//ivalue = dvalue; -> ������ �ʴ´�. int(4), double(8)�̱� ����
		ivalue = (int)dvalue;	//-> ���� �ս� ������ ����� int������ ���� ����ȯ �ϰڴٴ� ��. ���� �տ��� �� �� �ִ�. �ݿø� ������ ���� �Ҽ��� ���ϴ� ������ ¥���� �ȴ�.
		System.out.println(ivalue);

		// ivalue = (int)bvalue; -> boolean���� ����ȯ�� ���� �ʴ´�.
		
		
	}
}
