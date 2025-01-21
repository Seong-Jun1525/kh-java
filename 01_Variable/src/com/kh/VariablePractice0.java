package com.kh;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VariablePractice0 {

	// 현재년도 구하기
	public static int currentYear() {
		LocalDateTime localDate = LocalDateTime.now();
//		System.out.println(localDate);
		
		// 날짜 포맷
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
		String formattedNow = localDate.format(formatter);
//		System.out.println(formattedNow);
		
		return Integer.parseInt(formattedNow);
	}

	
	public static void main(String[] args) {
		/**
		 * 아래 코드를 변수를 사용하여 실행
		 */
		final int MY_BIRTH_YEAR = 2000;
		int year = currentYear();
		int age = year - MY_BIRTH_YEAR;
		
		System.out.println("현재 2025년이고 올해 20살입니다.");
		System.out.println("현재 " + year + "년이고 올해 " + age + "살입니다.");
		System.out.printf("현재 %s년이고 올해 %d살입니다.\n", year, age); // %d %s %f ... <= 지시어
		
		System.out.println();
		
		final int WEIGHT = 80;
		System.out.println("몸무게가 80kg 이상인 경우 탑승하지 못합니다.");
		System.out.println("몸무게가 " + WEIGHT + "kg 이상인 경우 탑승하지 못합니다.");
		System.out.printf("몸무게가 %dkg 이상인 경우 탑승하지 못합니다.\n", WEIGHT);
		System.out.println("=============================================================");
		/**
		 * 입력을 받기 위한 클래스 : Scanner
		 * 
		 * 연결 : import java.util.Scanner;
		 * 
		 * 생성 : new Scanner(System.in);
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("나이 : ");
		int userAge = sc.nextInt();
		
		// nextInt()는 버퍼에서 \n을 제외하고 값만 가져옴
		sc.nextLine(); // 버퍼비우기
		
		System.out.print("하고싶은 말 : ");
		String temp = sc.nextLine();
		
		System.out.println(userName + "님 반갑습니다.");
		System.out.println(userAge + "살 입니다.");
		System.out.println(temp);
	}

}