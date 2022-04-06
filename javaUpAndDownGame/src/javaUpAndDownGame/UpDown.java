package javaUpAndDownGame;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean first = true;
		boolean second = true;
		String isContinued;
		int i = 1;

		while (first) {

			System.out.println("Let's start Up&Down Game!");
			int num = (int) (Math.random() * 100);
			System.out.println("1~99");

			while (second) {
				System.out.print(i + ">>");
				int input = sc.nextInt();

				if (input > num) {
					System.out.println("lower");
					i++;
				} else if (input < num) {
					System.out.println("higher");
					i++;
				} else {
					System.out.println("You win!");
					second = false;

				}
			}
		}
		System.out.print("Wanna continue?(y/n)");
		isContinued = sc.next();
		if (isContinued.equals("n")) {
			first = false;
		}
	}
}
