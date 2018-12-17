package home.work7;

public class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		super("Circle","Black");
		this.radius = radius;
		this.setArea(Math.PI*radius*radius);
		this.setPerimetr(Math.PI*2*radius);
	}
	public void getInfo() {
		super.getInfo();
		System.out.println(", Radius: "+radius);
	}
}
