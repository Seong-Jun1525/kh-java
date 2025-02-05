package com.kh.object;

public class Method01 {

	public static void main(String[] args) {
		/** Method
		 * 클래스 내부에 있는 함수. (기능)
		 * 
		 * [표현법]
		 * 		접근제한자 예약어 반환형 메소드명([매개변수 정보]) {
		 * 			// 함수에서 실행할 코드
		 * 		}
		 */
		
		System.out.println("======프로그램 시작======");
		
		hiEveryOne(26);

		System.out.println("======프로그램 종료======");
	}
	
	public static void hiEveryOne(int age) {
		// 반환형 : void(=> 결과값이 없음을 의미!)
		// 메서드명 : hiEveryOne
		// 매개변수 정보 : 1개
		
		System.out.println("======hiEveryOne======");
		System.out.println("나이 : " + age);
	}

}
