package com.kh.generic.ex5;

/**
 * 제네릭 메서드
 * - 특정 메서드 내에서 타입을 전달받아 적용
 * 
 * - 타입 매개변수 선언 <T>
 * 접근제한자 [예약어] <T> 반환형 메서드명(매개변수정보) {}
 * => T라는 변수를 사용해서 매개변수타입, 반환타입, 지역변수타입으로 사용 가능
 */

public class Run {

	public static void main(String[] args) {
		GenericMethod.<Integer>test(777);
		GenericMethod.<Double>test(77.7);
	}
}

class GenericMethod {
	public static <T> void test(T n) {
		// public static <T extends Number> void test(T n)
		// => Number 클래스 타입과 상속관계인 타입만 전달할 수 있도록 제한!
		System.out.println(n);
	}
}