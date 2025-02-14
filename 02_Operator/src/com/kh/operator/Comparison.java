package com.kh.operator;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		/**
		 * 비교 연산자 (이항 연산자)
		 * 두 값을 비교하는 연산자
		 * 조건을 만족하는 결과가 true, 그렇지 않으면 false
		 * 
		 * 종류
		 * 	- 대소 비교 : < > <= >=
		 *  - 동등비교 :  == !=
		 */
		
		// 입력받은 두 정수의 값을 비교
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("정수 A : ");
		a = sc.nextInt();
		
		System.out.print("정수 B : ");
		b = sc.nextInt();
		
		System.out.println("첫 번째 숫자와 두 번째 숫자는 같은 값인가? : " + (a == b));
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 큰 값인가? : " + (a > b));
		System.out.println("두 번째 숫자는 짝수인가? : " + (b % 2 == 0));
		System.out.println("두 번째 값은 'A'의 유니코드인가 ? : " + (b == 'A'));
		sc.close();
	}

}
