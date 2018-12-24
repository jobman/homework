package home.work7;

public class Shape {
  private String color;
  private String name;
  private double perimetr;
  private double area;

  Shape(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPerimetr() {
    return perimetr;
  }

  public void setPerimetr(double perimetr) {
    this.perimetr = perimetr;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public void getInfo() {
    System.out.print(
        "Name: " + name + ", Color: " + color + ", Perimetr: " + perimetr + ", Area: " + area);
  }

  protected double calcArea() {
    return 0;
  }
  
  protected double calcPerim() {
    return 0;
  }

}
