package home.work102;

public class Triangle extends Shape {
  private int side1;
  private int side2;
  private int side3;



  public Triangle(int side1, int side2, int side3) throws IllegalArgumentException {
    super("Triangle", "Red");
    if (side1 >= side2 && side1 >= side3) {
      if (side1 >= (side2 + side3)) {
        throw new IllegalArgumentException();
      }
    } else if (side2 >= side1 && side2 >= side3) {
      if (side2 >= (side1 + side3)) {
        throw new IllegalArgumentException();
      }

    } else if (side3 >= side1 && side3 >= side2) {
      if (side3 >= (side2 + side1)) {
        throw new IllegalArgumentException();
      }
    }
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.setPerimetr(side1 + side2 + side3);
    int p = (int) super.getPerimetr() / 2;
    this.setArea(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println(", Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3);
  }

  @Override
  protected double calcArea() {
    int p = (int) super.getPerimetr() / 2;
    return (Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
  }

  @Override
  protected double calcPerim() {
    return this.side1 + this.side2 + this.side3;
  }
}
