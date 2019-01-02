package home.work102;

public abstract class Shape {
  private String color;
  private String name;
  private double perimetr;
  private double area;
  
  private static class ColorSeter{
    
    private static String ColorsArr[] = {"Red", "Orange","Yellow","Green","Blue","Ochra","Ultramarine","Brown","Violet","Olive"};
    
    public static String makeColor(){
      int rnd = (int)(Math.random()*ColorsArr.length);
      String color = ColorsArr[rnd];      
      return color;
    }
  }

  Shape(String name, String color) {
    this.name = name;
    this.color = ColorSeter.makeColor();
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
