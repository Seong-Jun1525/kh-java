package com.kh.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		/** TODO practice1
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for(int i = 1; i <= n; i++) {
				if(i == n) System.out.print(i);
				else System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
	
	public void practice2() {
		/** TODO practice2
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * 조건 => do while() 사용하기
		 */
		
		// do while 사용
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			n = sc.nextInt();
			
			if(n < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
			else {
				for(int i = 1; i <= n; i++) {
					if(i == n) System.out.print(i);
					else System.out.print(i + " ");
				}
				break;
			}
		} while(n < 1);
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int n = sc.nextInt();
		
//		if(n < 1) {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//			practice2();
//		}
//		else {
//			for(int i = 1; i <= n; i++) {
//				if(i == n) System.out.print(i);
//				else System.out.print(i + " ");
//			}
//		}
		
		// 반복문 사용
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			int n = sc.nextInt();
//			
//			if(n < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
//			else {
//				for(int i = 1; i <= n; i++) {
//					if(i == n) System.out.print(i);
//					else System.out.print(i + " ");
//				}
//				break;
//			}
//		}
		sc.close();
	}
	
	public void practice3() {
		/** TODO practice3
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
		for(int i = n; i >= 1; i--) {
			if(i == 1) System.out.print(i);
			else System.out.print(i + " ");
		}
		sc.close();
	}
	
	public void practice4() {
		/** TODO practice4
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		 */

		Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int n = sc.nextInt();
			
			if(n < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
			else {
				for(int i = n; i >= 1; i--) {
					if(i == 1) System.out.print(i);
					else System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}
	
	public void practice5() {
		/** TODO practice5
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수를 하나 입력하세요 : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i == n) System.out.print(i + " = " + sum);
			else System.out.print(i + " + ");
		}
		sc.close();
	}
	
	public void practice6() {
		/** TODO
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = sc.nextInt();
		
		if(a < 1 || b < 1) System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for(int i = (a > b) ? b : a; i <= ((a > b) ? a : b); i++) {
				if(i == (a > b ? a : b)) System.out.println(i);
				else System.out.print(i + " ");
			}
		}
		sc.close();
	}
	
	public void practice7() {
		/** TODO practice7
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int a = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int b = sc.nextInt();
			
			if(a < 1 || b < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			else {
				for(int i = (a > b) ? b : a; i <= ((a > b) ? a : b); i++) {
					if(i == (a > b ? a : b)) System.out.println(i);
					else System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}
	
	public void practice8() {
		/** TODO practice8
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		System.out.printf("===== %d단 =====\n", n);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
		sc.close();
	}
	
	public void practice9() {
		/** TODO practice9
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int n = sc.nextInt();
		
		if(n > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for(int j = n; j <= 9; j++) {
				System.out.printf("===== %d단 =====\n", j);
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", j, i, j * i);
				}
			}
		}
		sc.close();
	}
	
	public void practice10() {
		/** TODO practice10
		 * 위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면
		 * “9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int n = sc.nextInt();
			
			if(n > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else {
				for(int j = n; j <= 9; j++) {
					System.out.printf("===== %d단 =====\n", j);
					for(int i = 1; i <= 9; i++) {
						System.out.printf("%d * %d = %d\n", j, i, j * i);
					}
				}
				break;
			}
		}
		sc.close();
	}
	
	public void practice11() {
		/** TODO practice11
		 * 사용자로부터 시작 숫자와 공차를 입력 받아
		 * 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		 * 단, 출력되는 숫자는 총 10개입니다.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			if(i == 1) System.out.print(startNum + " ");
			else System.out.print((startNum += n) + " ");
		}
		sc.close();
	}
	
	public void practice12() {
		/** TODO practice12
		 * 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		 * 단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		 * exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		 * 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		 * “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		 * 없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		 */

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.print("정수1 : ");
				int n1 = sc.nextInt();
				System.out.print("정수2 : ");
				int n2 = sc.nextInt();
				
				sc.nextLine();
				
				int result = 0;

				if(op.equals("/") && n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				} else if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%")) {
					System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
				} else {
					switch(op) {
						case "+":
							result = n1 + n2;
							break;
						case "-":
							result = n1 - n2;
							break;
						case "*":
							result = n1 * n2;
							break;
						case "/":
							result = n1 / n2;
							break;
						case "%":
							result = n1 % n2;
							break;
					}
					System.out.printf("%d %s %d = %d\n\n", n1, op, n2, result);
				}
			}
		}
		sc.close();
	}
	
	public void practice13() {
		/** TODO practice13
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public void practice14() {
		/** TODO practice14
		 * 다음과 같은 실행 예제를 구현하세요.
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
