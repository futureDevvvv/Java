package loopNarray;

import java.util.Scanner;

public class ArrayEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers?>>");
		int var = sc.nextInt();

		int[] arr = new int[var];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
		}
	}
}
