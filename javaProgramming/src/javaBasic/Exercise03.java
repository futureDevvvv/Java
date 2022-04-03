package javaBasic;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 자리수 정수 입력(10~99)>>");
		int num = sc.nextInt();
		int mod = num % 10;
		int result = num / 10;

		if (num < 10 || num > 100) {
			System.out.println("두 자리수 정수가 아닙니다.");
		} else if (mod == result) {
			System.out.println("Yes! 10의 자리가 1의 자리와 같습니다.");
		} else if (mod != result) {
			System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
		}

	}

}
