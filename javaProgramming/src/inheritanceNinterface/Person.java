package inheritanceNinterface;

public class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	//getter, setter : private 멤버인 weight를 접근하기 위한 get set 메소드
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}
