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
//		method2();
		method3();
	}

	private static void method3() {
		// TODO 월을 입력받아서 해당 월의 말일이 며칠까지인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
			// case 1, 3, 5 ..: 는 JDK 14버전부터 가능
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.printf("%d월은 31일까지입니다.", month);
				break;
			case 4: case 6: case 9: case 11:
				System.out.printf("%d월은 30일까지입니다.", month);
				break;
			case 2:
				System.out.printf("%d월은 28일까지입니다.", month);
				break;
			default:
				System.out.println("잘못입력했습니다.");
		}
	}

	private static void method2() {
		// TODO 과일을 구매하는 프로그램
		// 사용자가 구매하고자 하는 과일을 입력하면 해당 가격 출력
		// {과일이름}의 가격은 {과일가격}원입니다.
		// 사과 : 15000
		// 포도 : 30000
		// 귤  : 8000
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 과일을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		switch(fruit) {
			case "사과":
				System.out.printf("%s의 가격은 %d원입니다.\n", fruit, 15000);
				break;
			case "포도":
				System.out.printf("%s의 가격은 %d원입니다.\n", fruit, 30000);
				break;
			case "귤":
				System.out.printf("%s의 가격은 %d원입니다.\n", fruit, 8000);
				break;
			default:
				System.out.println("없는 과일입니다.");
		}
		
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
		// TODO 정수를 입력 받아, 아래 조건에 따라 출력
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
