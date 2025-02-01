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
		sc.close();
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
		
		sc.close();
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

        if (n < 2) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true; // 각 숫자마다 초기화

                for (int j = 2; j * j <= i; j++) { // 1과 자기 자신 제외
                    if (i % j == 0) {
                        isPrime = false;
                        break; // 나누어 떨어지면 소수가 아님
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                    count++;
                }
            }

            System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.\n", n, count);
        }

        sc.close();
	}
	
	public void practice18() {
		/**
		 * 1부터 사용자에게 입력 받은 수까지 중에서
		 * 
		 * 1) 2와 3의 배수를 모두 출력하고
		 * 
		 * 2) 2와 3의 공배수의 개수를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				if(i % 2 == 0 && i % 3 == 0) count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("count : " + count);
		
		sc.close();
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= n - 1; i++) {
			for(int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i == 1 || i == n) {
				for(int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				
				for(int j = 1; j < n - 1; j++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
