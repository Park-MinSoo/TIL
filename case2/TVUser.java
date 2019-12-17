package day11.case2;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();//어떤 객체를 생성할 것인지만 달라지지 구문은 같다.
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}

}
