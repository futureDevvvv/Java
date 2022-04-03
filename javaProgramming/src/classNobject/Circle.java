package classNobject;

public class Circle {
	int radius;
	String name;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void set(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public Circle() {
		radius = 1;
		name = "";
	}

	public Circle(int r, String n) {
		radius = r;
		name = n;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle ob3 = new Circle(3);

		ob1.set(4);
		ob1.set(5);
		ob1.set(6);
	}

}
