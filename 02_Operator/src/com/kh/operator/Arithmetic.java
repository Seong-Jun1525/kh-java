package com.kh.operator;

public class Arithmetic {

	public static void main(String[] args) {
		/**
		 * 산술연산자(이항연산자)
		 * => + - * / %
		 * 
		 * 우선순위 : * / % + -
		 */
//		method1();
		method2();
	}

	public static void method1() {
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		System.out.printf("n1의 값은 짝수인가? %b\n", (n1 % 2 == 0));
		System.out.printf("n2의 값은 짝수인가? %b\n", (n2 % 2 == 0));
	}
	
	public static void method2() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // c => 16 a => 6
		int d = c / a; // d => 2
		int e = c % a; // e => 4
		int f = e++; // f => 4
		int g = (--b) + (d--); // g => 11 e => 5 b => 9
		int h = 2; // d => 1
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		// 6 + 9 / (3) * (10) % (8)
		// 6 + 6
		// 12
		
		System.out.printf("a : %d, b : %d, c : %d, d : %d\ne : %d, f : %d, g : %d, h : %d, i : %d\n", a, b, c, d, e, f, g, h, i);
		// 7 9 15 1 6 4 10 2 12
	}
}
