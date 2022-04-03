package inheritance;

public class ColorPoint extends Point {
	private String color;

	public void setColor(int x, int y, String color) {
		//super(x, y);
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
