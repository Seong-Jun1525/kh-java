package com.kh.operator;

public class InDecrease {

	public static void main(String[] args) {
		/**
		 * 증감연산자 (단항연산자)
		 * 
		 * ++ : 값을 1씩 증가
		 * -- : 값을 1씩 감소
		 * 
		 * 처리순서 (다른 연산자가 있을 경우 적용)
		 * 전위연산 : 선증감 후처리 
		 * 후위연산 : 후증감 선처리
		 */
		
//		method1();
//		method2();
		method3();
	}
	
	public static void method1() {
		int num1 = 10;
		
		System.out.println("num1 : " + num1); // 10
		System.out.println("전위 연산 1회 : " + ++num1); // 11
		System.out.println("후위 연산 1회 : " + num1++); // 11
		System.out.println("최종 num1 : " + num1); // 12
	}
	
	public static void method2() {
		int num1 = 20;
		int result1 = ++num1 * 3; // 63
		
		System.out.printf("num1 : %d, result1 : %d\n", num1, result1); // 21, 63
		
		int num2 = 20;
		int result2 = num2++ * 3;
		System.out.printf("num2 : %d, result2 : %d\n", num2, result2); // 21, 60
	}
	
	public static void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int r1 = a++; // r1 = 10
		System.out.printf("a : %d b : %d c : %d r1 : %d\n", a, b, c, r1); // 11, 20, 30, 10
		
		int r2, r3;
		r2 = (++a) + (b++); // r2 = 12 + 20 = 32
		r3 = (a++) + (--b) + (--c); // 12 + 20 + 29 = 61
		
		System.out.println(r2); // 32
		System.out.println(r3); // 61
		
		System.out.printf("a : %d, b: %d, c : %d\n", a, b, c); // 13, 20, 29
	}

}
