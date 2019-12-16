package mobile;

class Otab extends Mobile {
	public Otab(){}
	public Otab(String moblieName, int batterySize, String osType ){		
	super(moblieName, batterySize, osType);
}
	public void operate(int time) {
	batterySize-=12*time;	
		
	}
	public void charge(int time) {
	batterySize+=8*time;	
		
	}

}
