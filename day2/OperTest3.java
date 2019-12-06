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
		
		ivalue = cvalue;	// -> 허용된다. int(4byte), char(2) 이기 때문
		System.out.println(ivalue);	// -> 문자데이터를 int에 담으면 알아서 문자 데이터값을 십진수로 바꾸어서 나타낸다.
		
		//ivalue = dvalue; -> 허용되지 않는다. int(4), double(8)이기 떄문
		ivalue = (int)dvalue;	//-> 값이 손실 되지만 기어코 int형으로 강제 형변환 하겠다는 뜻. 항의 앞에만 올 수 있다. 반올림 같은것 없이 소수점 이하는 무조건 짜르게 된다.
		System.out.println(ivalue);

		// ivalue = (int)bvalue; -> boolean형은 형변환도 되지 않는다.
		
		
	}
}
