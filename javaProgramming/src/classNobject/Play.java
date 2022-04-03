package classNobject;

import java.util.Scanner;

public class Play {
	String name;
	String word;

	Scanner sc = new Scanner(System.in);

	public String getWordFromUser(String word) {

		this.word = sc.next();

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
