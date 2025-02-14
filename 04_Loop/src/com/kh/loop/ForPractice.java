package com.kh.loop;

import java.util.Scanner;

public class ForPractice {

	public static void main(String[] args) {
		/** 반복문
		 * 프로그램 흐름을 제어하는 제어문 중 하나로 특정 코드를 반복적으로 수행하는 문법
		 * 
		 * for문
		 * [표현식]
		 * for(초기식; 조건식; 증감식;) {
		 * 		// 반복적으로 수행할 코드
		 * }
		 * 
		 * 초기식 : 반복문이 수행될 때 최초 한번만 실행되는 구문
		 * 조건식 : 반복문이 수행될 조건을 작성하는 구문 (조건식의 결과가 true일 경우 수행)
		 * 증감식 : 반복문을 제어하는 변수의 값을 증감시키는 구문
		 * 
		 * [for문 실행 순서]
		 * 초기식 -> 조건식 검사 -> true인 경우 반복할 코드 수행 -> 증감식
		 * 		  -> 조건식 검사 -> true인 경우 반복할 코드 수행 -> 증감식
		 * 			----------------- 계속 반복 -----------------
		 * 		  -> 조건식 검사 -> false인 경우 반복문 종료
		 * 
		 * 참고 : 초기식, 조건식, 증감식 생략 가능!
		 * 			=> 세미콜론(;)은 필수!
		 */
		
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
		method8();
	}

	private static void method8() {
		// TODO 가로세로 구구단
		
		// 세로 출력
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println("========================================");
		// 가로 출력
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %s\t", j, i, 
						(i * j < 10) ? (" " + i * j) 
								: (i * j + ""));
			}
			System.out.println();
		}
	}

	private static void method7() {
		// TODO 사용자에게 2 ~ 9 사이의 정수를 입력받아 해당 구구단을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 ~ 9 사이의 정수 입력 : ");
		int n = sc.nextInt();
		
		if(n >= 2 && n <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", n, i, n * i);
			}
		} else {
			System.out.println("2 ~ 9 사이의 정수를 입력하세요");
			method7();
		}
		sc.close();
	}

	private static void method6() {
		// TODO 상수 문자열의 각 인덱스 별 문자를 한 줄씩 출력
		final String STR = "Stroy";
		
		// charAt() 사용
		for(int i = 0; i < STR.length(); i++) {
			System.out.println(STR.charAt(i));
		}
		
		System.out.println("===========");
		// toCharArray() 사용
		char[] charArr = STR.toCharArray();
		for(int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
	}

	private static void method5() {
		// TODO 랜덤값을 생성하여 1부터 랜덤값까지의 총 합
		int sum = 0;
		int randomNum = (int)(Math.random() * 10) + 1;
		/** Math.floor()
		 * 소수점을 내리고 정수.0 형태로 반환함
		 * 1.0, 10.0, 13.0 등
		 */
		
		/** 정수형 형변환
		 * Integer.parseInt()는 문자열을 정수형으로 변환할 때 사용하고
		 * 
		 * (int)는 이미 숫자형일때 int형으로 형변환할 때 사용한다
		 */
		
		for(int i = 1; i <= randomNum; i++) {
			sum += i;
		}
		
		System.out.printf("랜덤값은 %d이고 1부터 랜덤값까지의 총합은 %d이다.", randomNum, sum);
	}

	private static void method4() {
		// TODO 사용자로부터 1부터 10사이의 정수를 입력받고 1부터 입력받은 값까지의 총합출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		if(n >= 1 && n <= 10) {
			for(int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("1부터 " + n + "까지의 합 : " + sum);
		} else {
			System.out.println("1~10사이의 정수가 아닙니다.");
			method4();
		}
		sc.close();
	}

	private static void method3() {
		// TODO 1 ~ 10까지의 합
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 10까지의 합 : " + sum);
	}

	private static void method2() {
		// TODO for문을 사용하여 10 ~ 1 출력
		System.out.print("출력 결과 : ");
		for(int i = 10; i >= 1; i--) {
			if(i == 1) System.out.print(i);
			else System.out.print(i + " ");
		}
	}

	private static void method1() {
		// TODO "Happy" 5번 출력
//		System.out.println("Happy");
//		System.out.println("Happy");
//		System.out.println("Happy");
//		System.out.println("Happy");
//		System.out.println("Happy");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Happy");
		}
	}

}
