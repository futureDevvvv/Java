package classNobject;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = "아버지";

		System.out.println("끝말잇기 게임을 시작합니다. . . ");
		System.out.print("게임에 참가하는 인원은 몇 명입니까?");
		int participants = sc.nextInt();

		Player[] player = new Player[participants];

		for (int i = 0; i < participants; i++) {
			System.out.print("참가자의 이름을 입력하세요 >>");
			player[i] = new Player();
			player[i].name = sc.next();
		}

		System.out.println("시작하는 단어는 아버지입니다.");

		int i = 0, j = 0;

		while (true) {

			j = i % participants;

			int lastIndex = word.length() - 1;
			char lastChar = word.charAt(lastIndex);

			System.out.println(player[j].name + ">>");

			player[j].getWordFromUser();

			boolean ifcontinue = player[j].checkSucess(lastChar);

			if (ifcontinue == false) {
				System.out.println(player[j].name + "이(가) 졌습니다.");
				break;
			}
			word = player[j].wordin;
			i++;

		}

		/*
		 * for (int i = 0; i < participants; i++) { System.out.print(player.name[i] +
		 * ">>"); player.word = sc.next(); }
		 */

	}

	/*
	 * public void run() {
	 * 
	 * }
	 */
}
