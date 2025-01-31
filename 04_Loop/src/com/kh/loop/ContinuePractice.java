package com.kh.loop;

public class ContinuePractice {

	public static void main(String[] args) {
		/** continue (분기문)
		 * 뒤에 구문들을 무시하고
		 * for문일 경우 증감식으로 while문일 경우 조건식으로 이동
		 */
		
//		method1();
		method2();
	}

	private static void method2() {
		// TODO 1 ~ 100 3의 배수이거나 5의 배수인 경우를 제외한 총 합 구하기
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 || i % 5 == 0) continue;
			sum += i;
			
			 // if(i % 3 != 0 && i % 5 != 0) sum += i;
		}
		
		System.out.println("3의 배수이거나 5의 배수인 경우를 제외한 1 ~ 100 총 합 : " + sum);
	}
	
	private static void method1() {
		// TODO 1 ~ 10 정수 중에 짝수만 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
			
			// if(i % 2 == 0) System.out.println(i);
		}
	}

}
