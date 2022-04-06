package classNobject;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;

		System.out.print("두 정수와 연산자를 입력하시오>>");
		try {
			a = sc.nextInt();
		} catch(Exception e) {
			System.out.println("정수가 입력되지 않았습니다.");
		}
		
		try {
			b = sc.nextInt();
		} catch(Exception e) {
			System.out.println("정수가 입력되지 않았습니다.");
		}
		
		String operator = sc.next();

		/*
		 * System.out.println(a); System.out.println(b);
		 */
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		switch (operator) {
		case "+":
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;

		case "-":
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;

		case "*":
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
			
		case "/":
			div.setValue(a, b);
			System.out.println(div.calculate());

		default:
			System.out.println("연산자가 잘못 입력되었습니다.");
			return;
		}
	}
}
