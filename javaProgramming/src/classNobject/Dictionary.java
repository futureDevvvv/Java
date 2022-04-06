package classNobject;

public class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public String korEng(String word) {

		String foundWord = null;

		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)) {
				foundWord = eng[i];
				//System.out.println(eng[i]);
			}
		}
		return foundWord;

	}
}
