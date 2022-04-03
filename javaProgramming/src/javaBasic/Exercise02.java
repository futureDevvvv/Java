package javaBasic;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
		double dollar = (double) won / 1100;

		System.out.println(won + "원은 $" + String.format("%.2f", dollar) + "입니다");
	}
}
