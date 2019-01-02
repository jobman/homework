package home.work92;

public class Triangle extends Shape {
  private int side1;
  private int side2;
  private int angle;

  public Triangle(int side1, int side2, int angle) {
    super("Triangle", "Red");
    this.side1 = side1;
    this.side2 = side2;
    this.angle = angle % 360;
    this.setArea(Math.sin(Math.toRadians(this.angle)) * 0.5 * this.side1 * this.side2);
    this.setPerimetr(
        this.side1 + this.side2 + (Math.sqrt(this.side1 * this.side1 + this.side2 * this.side2
            - 2 * this.side1 * this.side2 * Math.cos(Math.toDegrees(this.angle)))));
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println(", Side1: " + side1 + ", Side2: " + side2 + ", Angle: " + angle);
  }

  @Override
  protected double calcArea() {
    return Math.sin(Math.toRadians(this.angle)) * 0.5 * this.side1 * this.side2;
  }

  @Override
  protected double calcPerim() {
    return this.side1 + this.side2 + (Math.sqrt(this.side1 * this.side1 + this.side2 * this.side2
        - 2 * this.side1 * this.side2 * Math.cos(Math.toDegrees(this.angle))));
  }
}
