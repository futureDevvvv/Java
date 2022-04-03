package classNobject;

import java.util.Scanner;

public class Month {
	// 필드
	private int nDays; // 날짜 수
	private Day[] days; // Day 클래스의 객체 배열
	private Scanner sc; // 스캐너 객체 선언

	// 생성자

	public Month(int nDays) {
		this.nDays = nDays;
		days = new Day[nDays];
		// 배열의 갯수만큼 Day 객체를 생성해준다.
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}

	public void input() {

		System.out.print("날짜(1~30) ? >>");
		int day = sc.nextInt();

		System.out.print("할 일(빈 칸 없이 입력) >>");
		String work = sc.next();

		System.out.println(day + "일에 " + work + " 일정 등록 완료");
		days[day - 1].set(work);
		
		
		
	}

	public void view() {
		System.out.print("날짜(1~30) ? >>");
		int day = sc.nextInt();

		System.out.print(day + "일에 할 일은 ");
		days[day - 1].show();		
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램 2");

		while (true) {
			
			System.out.println("할 일( 입력 : 1, 보기 : 2, 끝내기 : 3) >>");
			int selected = sc.nextInt();

			switch (selected) {
			case 1:
				input();
				break;

			case 2:
				view();
				break;

			case 3:
				finish();
				return;

			default:
				System.out.println("없는 메뉴입니다.");
			}

		}

	}
	
	public static void main(String[] args) {
		
		Month april = new Month(30);
		april.run();
		
	}
}
