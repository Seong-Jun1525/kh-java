package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String str = sc.nextLine();
		char c = str.charAt(0);
		
		System.out.printf("%c unicode : %d\n", c, (int)c);
		sc.close();
	}
}
