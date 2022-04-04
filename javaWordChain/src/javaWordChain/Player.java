package javaWordChain;

import java.util.Scanner;

public class Player {

	String name;
	String word;

	public String getWordFromUser() {

		Scanner sc = new Scanner(System.in);

		word = sc.next();

		return word;
	}

	public boolean checkSuccess(char lastChar) {

		if (lastChar == word.charAt(0)) {
			return true;
		} else {
			return false;
		}

	}
}
