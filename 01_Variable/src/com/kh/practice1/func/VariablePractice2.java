package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void calc() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int x = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int y = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (x+y));
		System.out.println("빼기 결과 : " + (x-y));
		System.out.println("곱하기 결과 : " + (x*y));
		System.out.println("나누기 몫 결과 : " + (x/y));
	}
}
