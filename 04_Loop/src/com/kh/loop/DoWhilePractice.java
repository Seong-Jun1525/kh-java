package com.kh.loop;

import java.util.Scanner;

public class DoWhilePractice {

	public static void main(String[] args) {
		/** do while()문
		 * 처음 무조건 한번 실행 후 조건식 검사
		 * 
		 * [표현식]
		 * do {
		 * 		// 반복적으로 수행할 코드
		 * } while(조건식);
		 * 
		 * 실행순서
		 * {} 안의 코드 수행 -> 조건식 검사 -> 조건식 결과가 true인 경우 {} 안의 코드 수행
		 * 					  -> 조건식 검사 -> 조건식 결과가 true인 경우 {} 안의 코드 수행
		 *						 ----------------- 계속 반복 -----------------
		 * 					  -> 조건식 검사 -> 조건식 결과가 false인 경우 반복문 종료
		 * 
		 */
		
		// TODO 사용자에게 입력받은 정수를 계속해서 더하는 프로그램
		// 단, 사용자가 0을 입력하면 종료
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		do {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			sum += n;
		} while(n != 0);
		
		System.out.println("입력받은 값들의 총 합 : " + sum);
	}

}
