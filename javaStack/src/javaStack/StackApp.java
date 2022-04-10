package javaStack;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input the capacity of the stack>>");
		int capacity = sc.nextInt();
		StringStack stack = new StringStack(capacity);

		while (true) {

			System.out.print("Input String>>");
			String val = sc.next();

			if (val.equals("stop")) {
				break;
			}
			boolean res = stack.push(val);
			if (res == false) {
				System.out.println("Stack is full!");
			}
		}

		// stack.push(val);

		System.out.print("Pop : ");
		int leng = stack.length();

		for (int i = 0; i < leng; i++) {
			System.out.print(stack.pop() + " ");
		}

	}

}
