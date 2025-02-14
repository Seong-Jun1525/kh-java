package com.sj.ch04;

import java.util.Scanner;

public class PracticeSwitchCase {

	public static void main(String[] args) {
		// switch - case문 연습
		Scanner sc = new Scanner(System.in);
		
		System.out.print("층 수를 입력해주세요 : ");
		int floor = sc.nextInt();
		
		switch(floor) {
			case 1:
				System.out.printf("%d층은 약국입니다.\n", floor);
				break;
			case 2:
				System.out.printf("%d층은 정형외과입니다.\n", floor);
				break;
			case 3:
				System.out.printf("%d층은 피부과입니다.\n", floor);
				break;
			case 4:
				System.out.printf("%d층은 치과입니다.\n", floor);
				break;
			case 5:
				System.out.printf("%d층은 헬스 클럽입니다.\n", floor);
				break;
			default:
				System.out.printf("%d층은 없는 층입니다.\n", floor);
				break;
		}
		sc.close();
	}

}
