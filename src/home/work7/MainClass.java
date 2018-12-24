package home.work7;

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
          int angle;
          System.out.println("Enter side1");
          side1 = in.nextInt();
          System.out.println("Enter side2");
          side2 = in.nextInt();
          System.out.println("Enter angle");
          angle = in.nextInt();
          arr[count] = new Triangle(side1, side2, angle);
          count++;
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
