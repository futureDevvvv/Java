package javaBasic;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		int var3 = sc.nextInt();
		
		if(var1 > var2 && var1 < var3) {
			System.out.println("중간값은" + var1);
		} else if(var1 > var3 && var1 < var2) {
			System.out.println("중간값은" + var1);
		} else if(var2 < var1 && var2 > var3) {
			System.out.println("중간값은" + var2);
		} else if(var2 > var1 && var2 < var3) {
			System.out.println("중간값은" + var3);
		} else if(var3 < var1 && var3 > var2) {
			System.out.println("중간값은" + var3);
		} else if(var3 > var1 && var3 < var2) {
			System.out.println("중간값은" + var3);
		}
	}
}
