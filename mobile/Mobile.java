package mobile;

abstract class Mobile {
	String mobileName;
	int batterySize;
	String osType;
	
	public Mobile(){}
	
	public Mobile(String moblieName, int batterySize, String osType ){		
	this.mobileName = moblieName;
	this.batterySize = batterySize ;
	this.osType = osType ;	
}
	abstract public void operate(int time);
	abstract public void charge(int time);

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
}