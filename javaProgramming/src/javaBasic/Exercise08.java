package javaBasic;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("연산>>");
		int num = sc.nextInt();
		String var = sc.next();
		int num2 = sc.nextInt();

		/* System.out.println(num + "," + var + "," + num2); */

		switch (var) {
		case "+":
			System.out.println(num + num2);
			break;
		case "-":
			System.out.println(num - num2);
			break;
		case "*":
			System.out.println(num * num2);
			break;
		case "/":
			System.out.println((double) num / num2);
			break;
		default:
			System.out.println("연산자가 아닙니다.");
		}

		if (num2 == 0 && var.equals("/")) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}
}
