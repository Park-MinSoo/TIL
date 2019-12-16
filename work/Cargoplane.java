package work;

class Cargoplane extends Plane{
	public Cargoplane(){}
	public Cargoplane(String planeName,int fuelSize){
		super(planeName,fuelSize);
		}
	 public void flight(int distance) {	
	 fuelSize=getFuelSize()-(5*distance);
	 }
}