package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("¬ведите фамилию им€ отчество");
		String str = in.nextLine();
		String surname = str.substring(0, str.indexOf(" "));
		surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);

		String name = str.substring(str.indexOf(" ") + 1, str.indexOf(" ") + 2).toUpperCase() + ".";
		String patron = str.substring(str.lastIndexOf(" ") + 1, str.lastIndexOf(" ") + 2).toUpperCase() + ".";

		System.out.println(surname + " " + name + " " + patron);

	}

}
