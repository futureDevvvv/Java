package classNobject;

import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {

		Book[] b = new Book[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println("제목 >>");
			String title = sc.nextLine();
			System.out.println("저자 >>");
			String author = sc.nextLine();

			b[i] = new Book(title, author);
		}

		for (int i = 0; i < b.length; i++)
			System.out.println("(" + b[i].title + ", " + b[i].author + ")");
	}

}
