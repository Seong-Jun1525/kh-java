package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean = sc.nextDouble();

		System.out.print("영어 : ");
		double english = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		

		System.out.print("총점 : " + (int) (korean + english + math));
		System.out.println();
		System.out.print("평균 : " + (int)((korean + english + math) / 3));
		System.out.println();
	}
}
