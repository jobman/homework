package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		char[][] mas = new char[10][10];
		
		for (int i =0;i<mas.length;i++) {
			int rndA = (int)(Math.random()*9.99);
			int rnda = (int)(Math.random()*9.99);
			int rndB = (int)(Math.random()*9.99);
			int rndb = (int)(Math.random()*9.99);
			for (int j =0;j<mas.length;j++) {
				mas[i][j]='-';
				if(j==rndA)
					mas[i][j]='A';
				if(j==rnda)
					mas[i][j]='a';
				if(j==rndB)
					mas[i][j]='B';
				if(j==rndb)
					mas[i][j]='b';
			}
		}
				
		int positionX = 0;
		int positionY = 0;
		mas[positionY][positionX]='@';
		int health =100;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++)
				System.out.print(mas[i][j] + " ");
			System.out.println();
			}
		System.out.println("Здоровье "+health);
		
		Scanner in = new Scanner(System.in);
		
		boolean notEnd = true;
		
		do {

			System.out.println("Введите w/a/s/d для движения ввер/влево/вниз/вправо ");
			String command = in.nextLine();

			command.toLowerCase();
			switch (command) {
			case "a": {
				if (positionX == 0)
					notEnd = false;
				else {
					
					mas[positionY][positionX] = '-';
					if(mas[positionY][positionX - 1]=='A') {
						health+=40;
					} else if (mas[positionY][positionX - 1]=='a') {
						health+=20;
					} else if (mas[positionY][positionX - 1]=='B') {
						health-=40;
					} else if (mas[positionY][positionX - 1]=='b') {
						health-=20;
					}
					mas[positionY][positionX - 1] = '@';
					positionX = positionX - 1;
				}
				break;
			}

			case "d": {
				if (positionX == (mas.length - 1))
					notEnd = false;
				else {
					mas[positionY][positionX] = '-';
					if(mas[positionY][positionX + 1]=='A') {
						health+=40;
					} else if (mas[positionY][positionX + 1]=='a') {
						health+=20;
					} else if (mas[positionY][positionX + 1]=='B') {
						health-=40;
					} else if (mas[positionY][positionX + 1]=='b') {
						health-=20;
					}
					mas[positionY][positionX + 1] = '@';
					positionX = positionX + 1;
					
				}
				break;
			}

			case "w": {
				if (positionY == 0)
					notEnd = false;
				else {
					mas[positionY][positionX] = '-';
					if(mas[positionY - 1][positionX]=='A') {
						health+=40;
					} else if (mas[positionY - 1][positionX]=='a') {
						health+=20;
					} else if (mas[positionY - 1][positionX]=='B') {
						health-=40;
					} else if (mas[positionY - 1][positionX]=='b') {
						health-=20;
					}
					mas[positionY - 1][positionX] = '@';
					positionY = positionY - 1;
					
				}
				break;
			}

			case "s": {
				if (positionY == (mas.length - 1))
					notEnd = false;
				else {
					mas[positionY][positionX] = '-';
					if(mas[positionY + 1][positionX]=='A') {
						health+=40;
					} else if (mas[positionY + 1][positionX]=='a') {
						health+=20;
					} else if (mas[positionY + 1][positionX]=='B') {
						health-=40;
					} else if (mas[positionY + 1][positionX]=='b') {
						health-=20;
					}
					mas[positionY + 1][positionX] = '@';
					positionY = positionY + 1;
					
				}
				break;
			}

			default:
				System.out.println("Не верный ввод");
				break;
			}
			
			health-=5;

			if (notEnd&&(health>0)) {
				for (int i = 0; i < mas.length; i++) {
					for (int j = 0; j < mas.length; j++)
						System.out.print(mas[i][j] + " ");
					System.out.println();
				}
				System.out.println("Здоровье "+health);
				System.out.println();
			} else {
				notEnd=false;
				System.out.println("Конец выход, за границы или кончилось здоровье");
				}

		} while (notEnd);

	}

}
