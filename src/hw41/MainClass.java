package hw41;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter row");
		System.out.println("Example row:");
		System.out.println("Rust 37 Louisiana;Charlie 20 Dunkirk;Ray 32 Brugge");
		String str = in.nextLine();
		int row = str.split(";").length;
		int columns = str.split(";")[0].split(" ").length;

		String[][] db = new String[row][columns];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++) {
				db[i][j] = str.split(";")[i].split(" ")[j];
			}
		}

		do {
			System.out.println("Enter word to search, 'exit' to exit");

			String search = in.nextLine();
			if (search.contains("exit")) {
				break;
			}

			for (int i = 0; i < db.length; i++) {
				for (int j = 0; j < db[i].length; j++) {
					if (db[i][j].contains(search)) {
						System.out.println(Arrays.toString(db[i]));
						break;
					}
				}
			}

		} while (true);
		
		in.close();

	}

}
