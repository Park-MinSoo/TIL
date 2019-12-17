package day11;
import java.util.Random;
interface Drawable {
	 void draw();
	 /*draw에는 public이 없어서 아래 자녀부분에 public을 생략하면 에러메세지가 뜬다.
	  * void draw();-> public abstract void draw();와 동일하다.
	  * void draw(){} 인터페이스에는 이런 메소드가 올 수 없다.
	  * interface에서는 abstract와  public 을 생략해도 자동으로 입력 된다.*/
}
class Rect implements Drawable {
	public void draw() {
		//public void draw() 오버라이딩을 해야 한다.
		System.out.println("사각형을 그립니다.");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
class Diamond implements Drawable  {
	public void draw() {
		System.out.println("마름모를 그립니다.");
	}
}
public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Drawable d = null;
		if(num == 0)
			d = new Rect();
		else if(num == 1)
			d = new Circle();		
		else if(num == 2)
			d = new Diamond();		
		output(d);
	}
	public static void output(Drawable d){
		System.out.println("전달된 객체의 클래스명 : "+
	                        d.getClass().getName());
		d.draw();
	}
}



