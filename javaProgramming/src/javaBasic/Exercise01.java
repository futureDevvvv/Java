package javaBasic;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수>>");
		String var = sc.next();
		System.out.print("영희>>");
		String var2 = sc.next();
		
		if(var.equals(var2)) {
			System.out.println("비겼습니다.");
		}
		else if(var.equals("가위")) {
			if(var2.equals("바위")) {
				System.out.println("영희");
			} else if(var2.equals("보")) {
				System.out.println("철수");
			}
		}else if(var.equals("바위")){
			if(var2.equals("가위")) {
				System.out.println("철수");
			} else if(var2.equals("보")) {
				System.out.println("영희");
			}
		}else if(var.equals("보")) {
			if(var2.equals("가위")) {
				System.out.println("영희");
			} else if(var2.equals("바위")) {
				System.out.println("철수");
			}
		}
	}
}
