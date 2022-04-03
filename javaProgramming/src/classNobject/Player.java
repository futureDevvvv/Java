package classNobject;

import java.util.Scanner;

public class Player {

	Scanner inputword = new Scanner(System.in);

	public String name;
	public String wordin;

	public String getWordFromUser() {
		wordin = inputword.next();
		return wordin;
	}

	public boolean checkSucess(char lastChar) {
		if (lastChar == wordin.charAt(0)) {
			return true;
		} else {
			return false;
		}
	}
}
