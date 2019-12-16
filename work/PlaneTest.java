package work;

public class PlaneTest {
    public static void main(String args[]) {
    	// 2개의 원소를 갖는 plane 타입의 배열객체를 생성
    	Plane[]p= new Plane[2]; 
    	      
    	//Airplane과 Cargoplane 객체 생성하여 각 원소로 저장
    	p[0]= new Airplane("L747",1000);
    	p[1]= new Cargoplane("C40",1000);
        // 생성된 객체의 정보 출력
    	printInfo(p);
        // Airplane과 Cargoplane 객체에 100씩 운항 후 객체 정보 출력
    	p[0].flight(100);
    	p[1].flight(100);
    	printInfo(p);
        // Airplane과 Cargoplane 객체에 200 주유 후 객체 정보 출력
    	p[0].refuel(200);
    	p[1].refuel(200);
    	printInfo(p);
    }
public static void printInfo(Plane[] list) {
        // 타이틀 출력
   	System.out.println("Plane      "+"fuelSize      ");   	
	System.out.println(" ---------------------------");

	for (int i=0; i<list.length; i++) {
	System.out.print(list[i].getPlaneName()+"      "+list[i].getFuelSize());
	System.out.println();}
        // Plane 객체들의 데이터 출력(출력 결과 참조)
		// 배열객체
    }
}
