package com.kh.chap02;

import java.util.Scanner;

public class LoopPractice {
	public void practice015() {
		/** TODO practice015
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		if(n < 2) System.out.println("잘못 입력하셨습니다.");
		else {
			for(int i = 1; i <= n; i++) {
				if((i != 1 && i != n) && n % i == 0) {
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}
		}
		
	}
	
	public void practice16() {
		/**
		 * 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		 * “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean flag = true;
			
			System.out.print("숫자 : ");
			int n = sc.nextInt();
			
			if(n < 2) System.out.println("잘못 입력하셨습니다.");
			else {
				for(int i = 1; i <= n; i++) {
					if((i != 1 && i != n) && n % i == 0) {
						flag = false;
					}
				}
				
				if(flag) {
					System.out.println("소수입니다.");
				} else {
					System.out.println("소수가 아닙니다.");
				}
				break;
			}
		}
	}
	
	public void practice17() {
		/**
		 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		if(n < 2) System.out.println("잘못 입력하셨습니다.");
		else {
			for(int i = 1; i <= n; i++) {
				// 이어서 작업하기...
				System.out.print(i + " ");
				count++;
			}
			
			System.out.printf("2부터 %d까지 소수의 개수는 %d개입니다.", n, count);
		}
	}
}
