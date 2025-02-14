package com.kh.exception;

import java.util.Scanner;

public class Run {
	/**
	 * 에러 종류
	 * - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러
	 * 					=> 코드로 해결할 수 없는 오류
	 * 
	 * - 컴파일 에러 : 문법 상의 오류
	 * 					=> 실행 전에 알 수 있는 오류
	 * 					=> 빨간줄로 오류를 파악할 수 있음
	 * 					=> 비교적 쉽게 해결 가능
	 * 
	 * - 런타임 에러 : 코드 상의 문제는 없으나 실행 중 발생할 수 있는 오류
	 * 					=> 사용자의 실수 또는 미처 처리하지 못한 기능을 기준으로 발생될 수 있음
	 * 
	 * - 논리적인 에러 : 문법상 문제 없고, 실행 시에도 문제가 없으나
	 * 						프로그램의 의도와 맞지 않은 동작이나 결과를 나타내는 오류
	 * 
	 * 컴파일 에러, 런타임 에러, 논리적 에러와 같은 개발자가 예측 가능하고
	 * 수정할 수 있는 에러들을 "예외"라고 표현함 => Exception
	 * 
	 * 이러한 예외를 처리하는 방법 => 예외처리
	 * 
	 * 예외처리의 목적
	 * - 예외처리를 하지 않을 경우 프로그램이 비정상적으로 종료 될 수 있기 때문에
	 * 프로그램이 정상적으로 실행될 수 있게 하기 위함 => 비정상적 종료를 막기 위함
	 * 
	 * 예외처리 방법
	 * [1] 직접 처리 방법 : try ~ catch 문 (=> 메소드 구현부에 작성)
	 * [2] 예외처리 미루기 : throws 사용 (=> 메소드 머리부에 작성)
	 */

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		// main은 static 키워드가 사용되었으므로 method1도 static으로 선언해야한다
		// static은 프로그램이 실행될 때 메모리에 미리 적재를 해놓는데
		// method1이 static으로 선언되어 있지 않으면 해당 메소드가 없을 수 있기 때문에 컴파일 에러가 발생한다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a / b ... a?");
		int a = sc.nextInt();

		try {
			System.out.print("a / b ... b?");
			int b = sc.nextInt();
			
			System.out.printf("%d / %d = %d\n", a, b, a / b);
		} catch(Exception e) {
			e.getMessage();
		}
		
		System.out.println("=== method1 종료 ===");
		sc.close();
	}

}
