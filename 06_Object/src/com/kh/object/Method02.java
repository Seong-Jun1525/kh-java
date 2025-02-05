package com.kh.object;

public class Method02 {

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		divide(50, 7);
		divide(50, 0);
	}
	
	/**
	 * 오버로딩
	 * - 메서드명은 같고 매개변수 정보는 다른 메서드를 여러개 생성!
	 */
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static int add(int n1) {
		return n1 + 10;
	}
	
	// 반환형이 다르더라도 메소드명과 매개변수 정보가 같은 경우 오버로딩이 적용되지 않음
//	public static double add(int num) {
//		return num;
//	}

	// -----------------------------------------------------------------------------------------
	/**
	 * return의 의미
	 * - 반환 값을 돌려줌
	 * - 메서드 종료
	 */
	
	public static void divide(int n1, int n2) {
		// n2 변수의 값이 0인 경우 메서드 종료
		if(n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("n1 / n2 = " + (n1 / n2));
	}
}
