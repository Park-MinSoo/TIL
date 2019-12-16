package mobile;

 class Ltab extends Mobile {
	public Ltab(){}
	public Ltab(String moblieName, int batterySize, String osType ){		
	super(moblieName, batterySize, osType);	
	
}
	public void operate(int time) {	
	batterySize-=10*time;		
	}
	
	public void charge(int time) {
	batterySize+=10*time;		
	}
}