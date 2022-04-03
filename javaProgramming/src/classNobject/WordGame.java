package classNobject;

import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		run();
	}

	public static void run() {

		String word = "아버지";

		Scanner sc = new Scanner(System.in);

		System.out.println("끝말잇기 게임을 시작합니다...");

		System.out.print("시작하는 인원은 몇 명입니까?");
		int member = sc.nextInt();

		Play[] play = new Play[member];

		for (int i = 0; i < member; i++) {
			System.out.print("참가자의 이름을 입력하세요 >>");
			play[i] = new Play();
			play[i].name = sc.next();
		}

		int i = 0, j = 0;

		System.out.println("시작하는 단어는 아버지입니다.");
		while (true) {

			j = i % member;

			int lastindex = word.length() - 1;
			char lastChar = word.charAt(lastindex);
			char firstChar = word.charAt(0);

			System.out.print(play[j].name + ">>");

			play[j].getWordFromUser(word);

			boolean ifcontinue = play[j].checkSuccess(lastChar);

			if (ifcontinue == false) {
				System.out.println(play[j].name + "(이)가 졌습니다.");
				break;
			}

			word = play[j].word;
			i++;
		}

	}
}
