package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void Rectangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double w = sc.nextDouble();
		System.out.print("세로 : ");
		double h = sc.nextDouble();
		
		System.out.printf("면적 : %.2f\n", (w * h));
		System.out.printf("둘레 : %.1f\n", (w + h) * 2);
	}
}
