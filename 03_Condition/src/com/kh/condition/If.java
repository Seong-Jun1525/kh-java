package com.kh.condition;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		/**
		 * 조건문 if
		 * - 기본적으로 프로그램은 순차적으로 진행 (위 -> 아래, 좌 -> 우)
		 * - 순차적인 흐름을 바꿀 때 제어문 사용(조건문, 반복문, ...)을 사용하여 제어 가능
		 * 
		 * - 조건문
		 * 		- 조건에 따라 선택적으로 실행할 때
		 * - 반복문
		 * 		- 반복적으로 실행할 때
		 * 
		 * 
		 * 조건식을 통해 참인지 거짓인지 판단하여 그에 해당하는 코드를 실행
		 * => 조건식 결과 : 논리값
		 * => 연산자 : 비교연산자, 논리연산자
		 * 
		 * 조건문의 종류 : if, switch
		 * - if
		 * 		- 단독 if문
		 * 			if(조건식) { ... }
		 * 		- if-else
		 * 			if(조건식) { ... }
		 * 			  else { ... }
		 * 		- if-else if-else
		 * 			if(조건식1) { ... }
		 * 			else if(조건식2) { ... }
		 * 			else { ... }
		 */
		
//		method1();
//		method2();
		method3();
	}

	private static void method3() {
		// TODO 주민번호 입력받아서 남자인지, 여자인지 출력
		// (단, - 포함해서 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다" 출력)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민 번호를 입력하세요 (- 포함): ");
		String num = sc.nextLine();
		int count = 0;
		int idx = 0;
		
		for(int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if(c == '-') {
				if(i == 6) idx = 1;
				count++;
				break;
			}
		}

		if(num.length() == 14 && count == 1 && idx == 1) {
			String[] strArr = num.split("-");
			char gender = strArr[1].charAt(0);
			if(gender == '1' || gender == '3') {
				System.out.println("남자");
			} else if(gender == '2' || gender == '4') {
				System.out.println("여자");
			} else {
				System.out.println("잘못입력되었습니다.");
			}
		} else {
			System.out.println("잘못입력되었습니다.");
		}
	}

	private static void method2() {
		// TODO 문자를 입력받아서 소문자인 경우 "{입력받은값}는 소문자입니다." 출력
		// 대문자인 경우 "{입력받은값}는 대문자입니다." 출력
		// 그렇지 않으면 "알파벳이 아닙니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		char c = sc.nextLine().charAt(0);
		
		if(c >= 'a' && c <= 'z') {
			System.out.printf("{%c}는 소문자입니다.", c);
		} else if(c >= 'A' && c <= 'Z') {
			System.out.printf("{%c}는 대문자입니다.", c);
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
	}

	private static void method1() {
		// TODO 사용자의 입력 값이 1 ~ 10 사이의 값인지 확인하여
		// 범위를 벗어난 경우 "범위를 벗어났습니다." 출력
		// 범위 내에 있는 경우 입력 값을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 10 사이 정수 입력 : ");
		int n = sc.nextInt();
		
		if(n >= 1 && n <= 10) {
			System.out.println(n);
		} else {
			System.out.println("범위를 벗어났습니다.");
		}
		
//		if(n > 1 && n < 10) {
//			System.out.println(n);
//		} else {
//			System.out.println("범위를 벗어났습니다.");
//		}
		
	}

}
