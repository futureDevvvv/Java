package classNobject;

import java.util.Scanner;

public class DicApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//boolean iscontinued = true;
		// String searchWord = null;
		Dictionary dic = new Dictionary();

		System.out.println("단어 검색 프로그램입니다.");

		while (true) {

			System.out.print("한글 단어?>>");
			String searchWord = sc.next();

			if (searchWord.equals("그만")) {
				return;
			}

			if (dic.korEng(searchWord) == null) {
				System.out.println(searchWord + "는 저의 사전에 없습니다.");
				System.out.println();
			} else {
				System.out.print(searchWord + "(은)는 ");
				System.out.println(dic.korEng(searchWord));
				
				System.out.println();
			}
		}
	}
}
