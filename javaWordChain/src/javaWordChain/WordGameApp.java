package javaWordChain;

import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {

		run();
	}

	public static void run() {

		Scanner sc = new Scanner(System.in);

		String word = "puppy";
		
		System.out.print("Let's start the word chain game...");

		System.out.print("how many member are in? >>");

		int member = sc.nextInt();

		Player[] player = new Player[member];

		for (int i = 0; i < member; i++) {
			System.out.print("input the member's name >>");

			player[i] = new Player();
			player[i].name = sc.next();

		}
		System.out.println("The first word is 'puppy'");

		int i = 0;
		int j = 0;

		while (true) {

			j = i % member;
			
			int lastIndex = word.length() - 1;
			char lastChar = word.charAt(lastIndex);
			char firstChar = word.charAt(0);
			
			System.out.println(player[j].name + " >>");
			
			player[j].getWordFromUser();
			
			boolean iscontinued = player[j].checkSuccess(lastChar);
			
			if(iscontinued == false) {
				System.out.println(player[j].name + " lose.");
				break;
			}
			word = player[j].word;
			i++;
		}

	}
}
