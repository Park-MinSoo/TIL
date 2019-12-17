package day11;

public class RentalTV extends TV implements Rentable{
	int price;
	RentalTV(){}
	RentalTV(int price,String model, int size, int channel){
		super(model,size,channel);
		this.price=price;
	}
	public void play() {
		System.out.println("대여 TV 채널"+channel+"번의 프로를 플레이 합니다.");
	}
	public void rent() {
		System.out.println(model+"모델의 상품을 대여합니다."+price+"을 지불해 주세요.");
	}
	public String toString() {
		return "대여상품정보: 모델명("+model+"), "+"가격("+price+"), "+"크기("+size+")";
	}
}