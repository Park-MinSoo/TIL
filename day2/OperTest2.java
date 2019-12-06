package day2;
public class OperTest2 {
	public static void main(String[] args) {
		// 증감연산자 : 증가연산자(++), 감소연산자(--)
		int su1, su2, su3, su4;
		su1 = 10;
		System.out.println(su1);	//10
		System.out.println(++su1);	//11
		System.out.println(++su1);	//12
		System.out.println(++su1);	//13
		System.out.println(--su1);	//12
		
		su2 = 10;
		System.out.println(su2);	//10
		System.out.println(su2++);	//10 -> 먼저 전달(출력)하고 그 다음에  증가시키는것이다.
		System.out.println(su2++);	//11
		System.out.println(su2++);	//12
		System.out.println(su2--);	//13 -> 먼저 전달(출력)하고 그 다음에 감소시키는것이다. + 앞하고 뒤 동시에 쓸 수는 없다.
		System.out.println(su2);	//12

		su3 = 10;
		System.out.println(su3);	//10
		System.out.println(su3++);	//10
		System.out.println(++su3);	//12
		System.out.println(su3++);	//12
		System.out.println(--su3);	//12
		System.out.println(--su3);	//11
		
		su4 = 10;
		System.out.println(su4);	//10
		++su4;
		System.out.println(su4);	//11
		su4++;	// -> 단독으로 수행 된 경우 앞,뒤 상관 없이 똑같다~~
		System.out.println(su4);	//12
		//++10
		//10 = 10 + 1 -> 이런것들은 허용 되지 않는다 증감연산자는 변수에 할당 되어야한다.
	}
}
