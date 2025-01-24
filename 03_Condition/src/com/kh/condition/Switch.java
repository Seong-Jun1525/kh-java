package com.kh.condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/**
		 * switch문
		 * if문과 동일한 조건문이지만, 동등비교를 통해 흐름을 제어
		 * 실행할 코드만 실행하고 자동으로 종료되지 않음 => break문을 추가해야함
		 * 
		 * switch(비교대상) { // 비교 대상(변수 / 식) => 정수, 문자, 문자열
		 * 		case 값1: // 비교대상 == 값1
		 * 			...
		 * 			[break;]
		 * 		case 값2: // 비교대상 == 값2
		 * 			...
		 * 		
		 * 		...
		 * 
		 * 		default: // 모든 case에 해당되지 않을 때 
		 * 			...
		 * }
		 */
//		method1();
		method2();
	}

	private static void method2() {
		// 과일을 구매하는 프로그램
		// 사용자가 구매하고자 하는 과일을 입력하면 해당 가격 출력
		// {과일이름}의 가격은 {과일가격}원입니다.
		// 사과 : 15000
		// 포도 : 30000
		// 귤  : 8000
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 과일을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		if(fruit.equals("사과")) {
			System.out.printf("%s의 가격은 %d원입니다.\n", fruit, 15000);
		} else if(fruit.equals("포도")) {
			System.out.printf("%s의 가격은 %d원입니다.\n", fruit, 30000);
		} else if(fruit.equals("귤")) {
			System.out.printf("%s의 가격은 %d원입니다.\n", fruit, 8000);
		} else {
			System.out.println("없는 과일입니다.");
		}
	}

	private static void method1() {
		// 정수를 입력 받아, 아래 조건에 따라 출력
		// 1 : 빨간색
		// 2 : 파란색
		// 3 : 초록색
		// 그외 잘못입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3을 입력하세요 : ");
		int colorValue = sc.nextInt();
		
		switch(colorValue) {
			case 1:
				System.out.println("빨간색");
				break;
			case 2:
				System.out.println("파란색");
				break;
			case 3:
				System.out.println("초록색");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
		}
		
		// if문으로 변경
		if(colorValue == 1) {
			System.out.println("빨간색");
		} else if(colorValue == 2) {
			System.out.println("파란색");
		} else if(colorValue == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

}
