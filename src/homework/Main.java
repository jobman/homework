package homework;

public class Main {

	public static void main(String[] args) {
		int total = 600;
		int discount = 0;
		boolean a = total > 400;
		switch (total / 100) {
		case 0:
		case 1:
		case 2:
			discount = 0;
			break;
		case 3:
		case 4:
		case 5:
			discount = 3;
			break;
		default:
			discount = 5;
			break;

		}
		int toPay = total-(total*discount/100);
		System.out.println("Total: " + total + " discount " + discount + "%, to pay " + toPay);
		// comment
	}

}
