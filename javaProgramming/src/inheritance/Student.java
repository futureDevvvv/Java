package inheritance;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 176;
		//weight = 99;
		setWeight(99);
	}
}