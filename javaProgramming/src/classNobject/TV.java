package classNobject;

public class TV {

	// 필드(멤버변수)
	private String manufacturer;
	private int year;
	private int size;

	/*
	 * public TV() { this.manufacturer = manufacturer; this.year = year; this.size =
	 * size;
	 * 
	 * }
	 */

	// 생성자
	public TV(String manufacturer, int year, int size) {
		// TODO Auto-generated constructor stub
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}

	// 메소드
	public void show() {

		System.out.println(manufacturer + "에서 만든 " + year + "년형 " + size + "인치 TV");

	}
}
