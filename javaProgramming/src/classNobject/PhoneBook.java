package classNobject;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("인원수를 입력하세요.");
		int member = sc.nextInt();

		Phone[] phone = new Phone[member];

		for (int i = 0; i < member; i++) {
			phone[i] = new Phone();
		}

		for (int i = 0; i < member; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >>");
			String name = sc.next();
			phone[i].name = name;

			String tel = sc.next();
			phone[i].tel = tel;

			/*
			 * System.out.println(name); System.out.println(tel);
			 */
		}

		System.out.println("저장되었습니다...");

		boolean run = true;
		
		while (run) {
			System.out.print("검색할 이름 >>");
			String findName = sc.next();
			
			if(findName.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			for (int i = 0; i < member; i++) {
				if (phone[i].search(findName) == true) {
					System.out.println(findName + "의 번호는 " + phone[i].tel);
					break;
				} else if(phone[i].search(findName) == false && i == member - 1) {
					System.out.println(findName + "이(가) 없습니다.");
				}
					
			}
		}

	}

}
