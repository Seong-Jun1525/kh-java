package com.kh.operator;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		/**
		 * 논리연산자 (이항 연산자)
		 * 두 개의 논리값을 연산
		 * 
		 * 종류 : &&, ||
		 * && : A && b => A B 모두 true이어야 true
		 * || : A || B => A B 둘중 하나라도 true이면 true
		 * 
		 * 주의사항 (단락 회로 검사 SCE (Short Circuit Evaluation))
		 * && : 앞의 조건이 false일 경우 뒤의 조건은 검사하지 않는다
		 * || : 앞의 조건이 true일 경우 뒤의 조건은 검사하지 않는다
		 */
//		method1();
		method2();
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int a = sc.nextInt();
		
		if(a >= 1 && a <= 10) System.out.println("입력받은 값은 1~10사이의 값이다 : " + (a >= 1 && a <= 10));
		else System.out.println("1~10사이의 값이 아니다");
	}
	
	public static void method2() {
		// 입력받은 문자가 소문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		if(c >= 'a' && c <= 'z') System.out.println("소문자다");
		else System.out.println("소문자가 아니다");
	}

}
