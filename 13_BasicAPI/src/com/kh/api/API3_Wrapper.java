package com.kh.api;

public class API3_Wrapper {

	/**
	 * Wrapper 클래스
	 * - 기본 자료형을 객체화 해주는 클래스
	 * 
	 * 기본 자료형을 객체화하는 이유는
	 * 	- 다형성을 적용
	 *  - 메서드 호출 시 매개변수가 기본자료형이 아닌 객체타입만 요구될 때
	 */
	
	public static void main(String[] args) {
		// Boxing : 기본자료형 -> Wrapper클래스(객체화)
		int n1 = 100;
		int n2 = 200;
		
		// n1.equals(n2) X. 객체가 아니므로 사용 불가
		
		// [1] 객체 생성 구문 사용
		Integer i1 = new Integer(n1);
		Integer i2 = new Integer(n2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교하여 앞의 값이 크면 1 뒤의 값이 크면 -1 같으면 0

		// [2] 객체 생성 구문 없이 사용
		Integer i3 = n1; // 오토박싱
		Integer i4 = n2; // 오토박싱
		System.out.println(i3.equals(i4));
		System.out.println(i4.equals(n2));		// true
		
		// 객체 생성을 통해 반드시 변환해야 하는 경우
		// => 문자열을 Integer 타입으로 변환하고 싶을 때
		Integer i5 = new Integer("300");
		Integer i6 = Integer.parseInt("400");
		
		// UnBoxing : Wrapper -> 기본 자료형
		
		// [1] Wrapper 클래스에서 제공하는 메서드 사용(xxxValue())
		int n3 = i5.intValue();
		int n4 = i6.intValue();
		
		// [2] 메서드 사용하지 않고 바로 대입
		int n5 = i5; // 오토언박싱
		int n6 = i6; // 오토언박싱
		
		// String ---> 기본 자료형
		String str1 = "10";
		String str2 = "33.5";
		System.out.println(str1 + str2);
		
		int n7 = Integer.parseInt(str1);
		double n8 = Double.parseDouble(str2);
		
		System.out.println(n7 + n8);
		
		// 기본자료형 -> 문자열
		System.out.println(n7 + "");
		System.out.println(String.valueOf(n7));
	}

}
