package home.work5;

public class PowerSupply {
	boolean isEnable;
	int inVoltage;
	int outVoltage1;
	int outVoltage2;
	
	public void printInfo() {
		System.out.println("Power supply is "+(isEnable?"ON":"OFF"));
		System.out.println("Incomming voltage "+inVoltage+" V");
		System.out.println("Out 1 voltage "+outVoltage1+" V");
		System.out.println("Out 2 voltage "+outVoltage2+" V");
	}
	
	public void energize(int volts) {
		if(volts>250) {
			isEnable=false;
			inVoltage=volts;
			outVoltage1=0;
			outVoltage2=0;
			System.out.println("High Voltage");
		} else if(volts>200) {
			isEnable=true;
			inVoltage=volts;
			outVoltage1=12;
			outVoltage2=5;
		} else {
			isEnable=false;
			inVoltage=volts;
			outVoltage1=0;
			outVoltage2=0;
			System.out.println("Low Voltage");
		}
	}

}
