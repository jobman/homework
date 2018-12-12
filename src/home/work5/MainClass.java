package home.work5;

public class MainClass {

	public static void main(String[] args) {
		PowerSupply ps = new PowerSupply();
		ps.energize(110);
		ps.printInfo();
		System.out.println();
		ps.energize(220);
		ps.printInfo();
		System.out.println();
		ps.energize(380);
		ps.printInfo();

	}

}
