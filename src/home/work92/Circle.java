package home.work92;

public class Circle extends Shape {
  int radius;

  public Circle(int radius) {
    super("Circle", "Black");
    this.radius = radius;
    this.setArea(Math.PI * radius * radius);
    this.setPerimetr(Math.PI * 2 * radius);
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println(", Radius: " + radius);
  }

  @Override
  protected double calcArea() {
    return Math.PI * radius * radius;
  }

  @Override
  protected double calcPerim() {
    return Math.PI * 2 * radius;
  }
}
