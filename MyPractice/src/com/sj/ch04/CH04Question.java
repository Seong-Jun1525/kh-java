package com.sj.ch04;

public class CH04Question {

	public static void main(String[] args) {
		// 연습문제 p.123
//		q1();
		q2();
	}
	
	public static void q1() {
		// 구구단 짝수단만 출력
		for(int i = 2; i < 10; i++) {
			if(i % 2 != 0) continue;
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			
			// 위의 코드와 비교했을 때 차이가 있는지..
//			if(i % 2 == 0) {
//				for(int j = 1; j <= 9; j++) {
//					System.out.println(i + " x " + j + " = " + i * j);
//				}
//			}
			System.out.println();
		}
	}
	
	public static void q2() {
		// 구구단 단보다 곱하는 수가 작거나 같은 경우만 출력
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j > i) break;
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
	
	public static void q3() {
		// 피라미드 찍기
		
	}

}
