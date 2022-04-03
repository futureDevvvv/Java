package classNobject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Circle pizza = new Circle(10, "자바피자");
		 * 
		 * //pizza.radius = 10; //pizza.name = "피자스쿨";
		 * 
		 * double area = pizza.getArea(); System.out.println(pizza.name + "의 면적은 " +
		 * area);
		 * 
		 * Rectangle rec = new Rectangle();
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("높이를 입력하시오"); rec.height = sc.nextInt();
		 * 
		 * System.out.println("면적을 입력하시오"); rec.width = sc.nextInt();
		 * 
		 * int area2 = rec.getArea(); System.out.println("사각형의 면적은 : " + area2);
		 */

		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >>>");
		 * 
		 * int math = sc.nextInt(); int science = sc.nextInt(); int english =
		 * sc.nextInt();
		 * 
		 * Grade me = new Grade(math, science, english); System.out.println("평균은 " +
		 * me.average());
		 */

		sc.close();

		int year = 1978;
		String country = "스웨덴";
		String artist = "ABBA";
		String title = "Dancing Queen";

		Song song = new Song(year, country, artist, title);
		song.show();

		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은" + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s를 포함합니다.");

	}
}
