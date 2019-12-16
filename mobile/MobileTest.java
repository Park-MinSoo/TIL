package mobile;

public class MobileTest {   
    public static void main(String args[]) {
    	  // 각각의 Mobile 객체를 생성한다.
         // 생성된 객체의 정보를 출력한다.(printMobile() 호출)
         // 각각의 Mobile 객체에 10분씩 충전을 한다. 
         // 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
         // 각각의 Mobile 객체에 5분씩 통화를 한다.
         // 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)
    		Ltab l = new Ltab("Ltab",500,"ABC-01");
    		Otab o = new Otab("Otab",1000,"XYZ-20");
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
    		l.charge(10);
    		o.charge(10);
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
    		l.operate(5);
    		o.operate(5);
    		printTitle(); 
    		printMobile(l);
    		printMobile(o);
			}    
    public static void printMobile(Mobile mobile) {
    	System.out.print(mobile.getMobileName()+"          ");
    	System.out.print(mobile.getBatterySize()+"          ");
    	System.out.print(mobile.getOsType()+"          ");
    	System.out.println();
//프린트모바일 l탑 o탑 모두 정의 가능
    }
    public static void printTitle() {
    	System.out.println("Mobile          "+"Battery          "+"OS          ");
    	System.out.println(" --------------------------------------------------------");
    }
}


