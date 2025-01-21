package com.kh;

public class Variable {

//	자바 실행 시 꼭 필요한 메서드
	public static void main(String[] args) {
//		printVariable();
		declareVariable();
	}
	
	public static void declareVariable() {
		/**
		 * 변수 선언 : 값을 기록하기 위한 변수를 메모리 공간에 할당
		 * 
		 * [표현식]
		 * 자료형 변수명;
		 * - 자료형 : 변수의 크기 및 모양을 지정하는 부분
		 * - 변수명 : 변수의 이름을 부여하는 부분
		 * 
		 * [명명규칙]
		 * - 카멜케이스 표기법
		 * 		=> 클래스명의 경우 대문자로 시작
		 * - 영문은 대소문자로 구분
		 * - 숫자로 시작하면 안됨
		 * - 예약어 사용 불가
		 * - 특수문자 $와 _만 사용 가능
		 * 
		 * [주의사항]
		 * - 같은 영역 안에서는 동일한 변수명으로 선언 불가
		 * - 해당 영역 안에서 선언된 변수는 해당 영역 안에서만 사용 가능
		 * 		=> 다른 영역 안에서는 사용 불가
		 * 
		 */
		
		// 정수형 변수
		int num = 10;
		int num2 = 20;
		
		// 논리형 (boolean) : 논리값. 참, 거짓. true, false
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println("isTrue의 변수 값 : " + isTrue);
		System.out.println("isFalse의 변수 값 : " + isFalse);
		
		isTrue = 1 + 4 > 1; // true
		isFalse = 2 + 5 < 0; // false

		System.out.println("isTrue의 변수 값 : " + isTrue);
		System.out.println("isFalse의 변수 값 : " + isFalse);
		
		// 숫자
		// 2-1 정수형 : 딱 떨어지는 수
		// byte(1B) < short(2B) < ★int(4B)★ < long(8B)
		byte bNum; // -128 ~ 127
//		bNum = 128; // 범위를 벗어나면 오류 발생
		
		// 2-2 실수형 : 소수점 있다
		// float(4B) < ★double(8B)★
		// float형은 소수점 7자리까지 표현 가능함
		// 값 자체(리터럴)를 저장할 때 값 뒤에 f를 붙여줌
		float fNum = 0.0f; // 그냥 0.0은 오류남. f를 붙여서 float형이란 것을 알림
		
		// double 형은 소수점 15자리까지 표현 가능함
		// 실수형의 기본 자료형임
		double dNum = 0; 
		
		// 문자형
		// 3-1 문자형 : char
		char A = 'A';
		char B = 'B';
		System.out.println(A + B); // 131. 65 + 66
		
		// 3-2 문자열 : String (참조자료형)
		String str;
		str = "문자열";
		
		System.out.println("str 변수의 길이 " + str.length());
		
		// 상수 : 변하지 않는 값을 저장하는 공간
		// final 자료형 변수명;
		
		final int AGE = 26;
//		AGE = 20; // 에러. 상수는 재할당 불가
		
		System.out.println(Math.PI);
		
		int sample = 999_999_999; // 가독성을 위한 3자리마다 _ 표시 가능
		System.out.println(sample); // 999999999
		
	}
	
	public static void printVariable() {
		/**
		 * 변수의 목적?
		 * - 데이터를 저장하기 위한 공간
		 * - 가독성 증가 (변수의 이름은 의미있게!), 재사용성 증가(한번 값을 저장하면 필요할 때 마다 변수이름으로 가져다가 사용)
		 * - 유지보수 용이 (한번 저장해놓으면 해당 위치의 값을 변경)
		 */
		
		// 월급 계산 = 시급 x 근무시간 x 근무일수
		// 출력 형식 ---> xxx : 0000원
		System.out.println("임성준 : " + 10030 * 9 * 14 + "원");
		System.out.println("이홍기 : " + 10030 * 8 * 14 + "원");
		System.out.println("에일리 : " + 10030 * 10 * 14 + "원");
		System.out.println("오해원 : " + 10030 * 8 * 14 + "원");
		System.out.println();
		
		// 변수
		int pay = 15000;
		int time = 9;
		int day = 20;
		int month = 12;

		System.out.println("임성준 : " + pay * time * day * month + "원");
		System.out.println("이홍기 : " + pay * time * day * month + "원");
		System.out.println("에일리 : " + pay * time * day * month + "원");
		System.out.println("오해원 : " + pay * time * day * month + "원");
		System.out.println();
	}

}
