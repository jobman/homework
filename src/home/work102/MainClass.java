package home.work102;

import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    Shape[] arr = new Shape[5];
    int count = 0;
    Scanner in = new Scanner(System.in);
    int input;
    boolean isEnd = false;
    while ((count < arr.length) || (isEnd)) {
      System.out.println("enter 1 to make CIRCLE, 2 - SQUARE, 3 - TRIANGLE");
      if (in.hasNextInt()) {
        input = in.nextInt();
      } else {
        System.out.println("Error");
        continue;
      }
      switch (input) {
        case 0:
          isEnd = true;
          break;
        case 1:
          int radius;
          System.out.println("Enter radius");
          radius = in.nextInt();
          arr[count] = new Circle(radius);
          count++;
          break;
        case 2:
          int side;
          System.out.println("Enter side");
          side = in.nextInt();
          arr[count] = new Square(side);
          count++;
          break;
        case 3:
          int side1;
          int side2;
          int side3;
          System.out.println("Enter side1");
          side1 = in.nextInt();
          System.out.println("Enter side2");
          side2 = in.nextInt();
          System.out.println("Enter side3");
          side3 = in.nextInt();
          try {
            arr[count] = new Triangle(side1, side2, side3);
            count++;
          } catch (IllegalArgumentException e) {
            System.out.println("Not correct sides, triangle cant exist");
          }
          break;
        default:
          System.out.println("Not correct number");
          break;
      }
    }
    in.close();

    for (int i = 0; i < arr.length; i++) {
      arr[i].getInfo();
    }
  }

}
