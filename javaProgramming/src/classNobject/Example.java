package classNobject;


class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Example {

	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.setAge(17);
	}
}
