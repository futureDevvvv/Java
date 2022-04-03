package classNobject;

public class Grade {

	// 필드
	int sub1, sub2, sub3;

	// 생성자
	public Grade(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	// 메소드
	public double average() {

		double result = (sub1 + sub2 + sub3) / 3;

		return result;
	}

}
