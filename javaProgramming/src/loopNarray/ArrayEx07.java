package loopNarray;

public class ArrayEx07 {
	public static void main(String[] args) {

		int sum = 0;
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int j = (int) (Math.random() * 10 + 1);

			arr[i] = j;
		}

		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println();

		double avg = (double) sum / arr.length;
		System.out.println("평균은 " + avg);
	}
}
