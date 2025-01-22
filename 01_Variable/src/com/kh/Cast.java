package com.kh;

public class Cast {

	public static void main(String[] args) {
		/**
		 * 값의 자료형을 바꾸는 것 : 형변환!
		 * 
		 * 바꾸는 이유 : 컴퓨터에서 값 처리 규칙(형변환이 필요한 시점/상황)
		 * 1) 대입 연산자 : 왼쪽과 오른쪽이 같은 자료형이어야 한다
		 * 					=> 다른 자료형의 값을 대입하고자 할 때 형변환이 필수!
		 * 
		 * 자료형 변수명 = (자료형)값;
		 * 
		 * 2) 같은 자료형 끼리만 연산 가능
		 * 		결과값 = 값1 + 값2;
		 * 		=> 값1, 값2 모두 같은 자료형이어야 함
		 * 		=> 결과값도 같은 자료형이어야 함
		 */
		
		// 자동 형변환
//		autoCasting();
		forceCasting();
	}
	
	public static void forceCasting() {
		/**
		 * 강제 형변환
		 * 자동 형변환이 되지 않는 경우 직접 형변환을 해주는 것.
		 * 큰 범위의 자료형에서 작은 범위의 자료형으로 변환이 필요할 때
		 * 
		 * (변환할 자료형)변환할 대상
		 * => 변환대상 : 값, 변수, ...
		 */
		
		// 실수형 d1에 4.0 대입
		double d1 = 4.0;
		
		// 정수형 i1에 50;
		int i1 = 50;
		
		int result = (int)(i1 + d1);
		
		System.out.println(result);
		
		int i2 = 290;
		byte i3 = (byte)i2;
		System.out.println(i3);
	}
	
	public static void autoCasting() {
		/**
		 * 자동 형변환
		 * 값의 범위가 작은 자료형에서 큰 자료형으로 자동 형변환
		 * 
		 * byte - short	- int - long - float(부동소수점) - double
		 * 		  char
		 */
		
		// 정수형 변수 i1에 12 대입
		int i1 = 12;
		
		// 실수형 변수 d1에 i1 대입
		double d1 = i1; // int => double
		
		System.out.println(d1);
		
		int i2 = 15;
		double d2 = 3.3;
		double result = i2 + d2; // i2 => int -> double.  int + double => double + double
		System.out.println(result);
	}

}
