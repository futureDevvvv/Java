package javaBasic;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int var = sc.nextInt();

		int tens = var / 10;
		int unit = var % 10;

		/* System.out.println(tens + "," + unit); */
		if (var < 1 || var > 100) {
			System.out.println("1~99 사이의 정수가 아닙니다.");
		} else if (tens % 3 == 0 && unit % 3 != 0) {
			System.out.println("박수 짝");
		} else if (tens % 3 != 0 && unit % 3 == 0) {
			System.out.println("박수 짝");
		} else if (tens % 3 == 0 && unit % 3 == 0) {
			System.out.println("박수 짝짝");
		} else {
			System.out.println("pass");
		}
	}
}
