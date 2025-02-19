package com.kh.api;

public class API1_Math {

	/**
	 * Math 클래스
	 * - java.lang.Math
	 * - 모든 필드가 상수 필드
	 * - 모든 메서드가 static
	 */
	
	public static void main(String[] args) {
		// 상수 필드
		// - PI : 파이값을 저장하고 있는 필드
		System.out.println(Math.PI);
		System.out.println(Math.E); // 자연대수의 밑인 double에 가장 가까운 값입니다
		
		// static 메서드
		System.out.println(Math.random());
		System.out.println(Math.abs(-324));
		System.out.println(Math.abs(256));
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.ceil(5.4));
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.round(3.16)); // 반올림은 소수점 첫 번째 자리에서 진행함. 따로 지정 불가
		System.out.println(Math.round(3.6));
		System.out.println(Math.floor(5.1));
		System.out.println(Math.floor(4.6));
	}

}
