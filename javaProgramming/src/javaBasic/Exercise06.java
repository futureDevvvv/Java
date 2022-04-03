package javaBasic;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		int var3 = sc.nextInt();
		
		if(var1+var2 > var3 || var2+var3 > var1 || var1+var3 > var2) {
			System.out.println("삼각형이 됩니다");
		} else {
			System.out.println("삼각형이 되지 않습니다.");
		}
	}
}
