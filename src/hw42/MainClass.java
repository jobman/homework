package hw42;

public class MainClass {

	public static void main(String[] args) {
		double usdRate = 28.4955;
		double eurRate = 34.1198;
		double yenRate = 0.2544;
		int usdNumber = 1;
		int eurNumber = 2;
		int yenNumber = 3;
		String usdName = "USD";
		String eurName = "EUR";
		String yenName = "YEN";
		String usdDescription = "United states dollar";
		String eurDescription = "Currency of 19 countries";
		String yenDescription = "Monetary unit of Japan";
		System.out.println("| # |Currency|-------Description-------|-Rate-|");
		System.out.printf("|%3d|%8s|%25s| %5.2f|\n", usdNumber,usdName,usdDescription,usdRate);
		System.out.printf("|%3d|%8s|%25s| %5.2f|\n", eurNumber,eurName,eurDescription,eurRate);
		System.out.printf("|%3d|%8s|%25s| %5.2f|\n", yenNumber,yenName,yenDescription,yenRate);

	}

}
