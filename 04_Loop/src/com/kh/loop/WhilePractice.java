package com.kh.loop;

public class WhilePractice {

	public static void main(String[] args) {
		/** while문
		 * [표현식]
		 * // [초기식]
		 * while(조건식) {
		 * 		// 반복적으로 수행할 코드
		 * 
		 * 		// [증감식]
		 * }
		 * 
		 * 실행순서
		 * 조건식 검사 -> 조건식의 결과가 true인 경우 중괄호 안의 코드 수행
		 * -> 조건식 검사 -> 조건식의 결과가 true인 경우 중괄호 안의 코드 수행
		 * ----------------- 계속 반복 -----------------
		 * -> 조건식 검사 -> 조건식의 결과가 false인 경우 반복문 종료
		 */
		
		method1();
		method2();
	}

	private static void method2() {
		// TODO For 클래스의 method5 예제를 while문으로 변경
		// 랜덤값을 생성하여 1부터 랜덤값까지의 총 합
		int randomNum = (int)(Math.random() * 10) + 1;
		
		// Math.random()은 0 1 미만까지의 수 반환.
		// Math.random() * 10을 ()로 묶지 않으면 0.x * 10이 되므로 계속 0 반환함
		
		int i = 1;
		int sum = 0;
		System.out.println(randomNum);
		while(i <= randomNum) {
			sum += i++;
		}
		
		System.out.println(sum);
	}

	private static void method1() {
		// TODO Happy 5번 출력
		int i = 10;
		while(i > 5) {
			System.out.println("Happy");
			i--;
		}
	}

}
