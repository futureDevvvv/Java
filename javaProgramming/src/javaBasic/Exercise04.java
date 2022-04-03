package javaBasic;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();

		int num1 = money / 50000;
		int num2 = (money - 50000 * num1) / 10000;
		int num3 = (money - 50000 * num1 - 10000 * num2) / 1000;
		int num4 = (money - 50000 * num1 - 10000 * num2 - 1000 * num3) / 100;
		int num5 = (money - 50000 * num1 - 10000 * num2 - 1000 * num3 - 100 * num4) / 50;
		int num6 = (money - 50000 * num1 - 10000 * num2 - 1000 * num3 - 100 * num4 - 50 * num5) / 10;
		int num7 = (money - 50000 * num1 - 10000 * num2 - 1000 * num3 - 100 * num4 - 50 * num5) % 10;

		System.out.println("오만원권" + num1);
		System.out.println("만원권" + num2);
		System.out.println("천원권" + num3);
		System.out.println("백원" + num4);
		System.out.println("오십원" + num5);
		System.out.println("십원" + num6);
		System.out.println("일원" + num7);
	}
}
