package home.work102;

public class Square extends Shape {
  private int side;

  public Square(int side) {
    super("Square", "White");
    this.side = side;
    this.setArea(side * side);
    this.setPerimetr(4 * side);
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println(" Side: " + side);
  }


  @Override
  protected double calcArea() {
    return side * side;
  }

  @Override
  protected double calcPerim() {
    return 4 * side;
  }

}
