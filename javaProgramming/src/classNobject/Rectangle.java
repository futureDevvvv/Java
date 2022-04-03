package classNobject;

public class Rectangle {
	private int height;
	private int width;
	private int x;
	private int y;

	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public int square() {

		int result = height * width;

		return result;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + height + "x" + width + "인 사각형");
	}

	public boolean contains(Rectangle r) {

		if (r.x <= this.x && r.y <= this.y) {
			if ((r.x + r.width < this.x + this.width) && (r.y + r.height < this.y + this.height)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * public int getArea() { return height * width; }
	 */
}
