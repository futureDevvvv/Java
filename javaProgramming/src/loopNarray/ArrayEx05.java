package loopNarray;

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 10개를 입력하시오.");

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
