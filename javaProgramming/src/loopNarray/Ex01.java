package loopNarray;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i<=10; i++) {
			sum += i;
			System.out.println(i);
			
			if(i<=9)
				System.out.println("+");
			else {
				System.out.println("=");
				System.out.println(sum);
			}
		}
	}
}
