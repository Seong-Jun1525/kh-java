package com.kh.operator;

import java.util.Scanner;

public class Triple {

	public static void main(String[] args) {
		/**
		 * 삼항 연산자 (조건식 ? 조건식이 참일 경우 결과값 : 조건식이 거짓일 경우 결과값)
		 */
//		method1();
//		method2();
		method21();
	}
	
	public static void method1() {
		// 입력한 값이 x인 경우 "종료합니다" 출력 그렇지 않은 경우 "계속 진행합니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("종료를 원할 경우 x를 입력하세요 : ");
		String str = sc.next();
		String rMessage = (str.equals("X") || str.equals("x")) ? "종료합니다." : "계속 진행합니다."; // String은 참조형이라서 == 이거 안먹힘
		
//		while(true) {
//			System.out.print("종료를 원할 경우 x를 입력하세요 : ");
//			String str = sc.next();
//		}
		
		System.out.println(rMessage);
		sc.close();
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아래와 같이 입력 시 연산 결과를 확인할 수 있습니다.");
		System.out.println(("10 20 +"));
		
		String str = sc.nextLine();
		int result = 0;
		
		String[] strArr = str.split(" ");
		
		if(strArr[2].equals("+")) {
			result = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
		} else if(strArr[2].equals("-")) {
			result = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[1]);
		}
		
		System.out.println(result);
		sc.close();
	}
	
	public static void method21() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아래와 같이 입력 시 연산 결과를 확인할 수 있습니다.");
		System.out.println(("10 20 +"));
		
		// nextLine() 이외에는 공백을 기준으로 한다
		// nextLine()은 '\n'을 기준으로 한다
		int a = sc.nextInt();
		int b = sc.nextInt();
		char o = sc.next().charAt(0);
//		char o = (char)System.in.read(); // <= 이 방법도 문자를 입력받을 수 있음 하지만 여기서는 사용 불가
		
		sc.nextLine();
		
		if(o == '+') {
			System.out.println(a + b);
		} else if(o == '-') {
			System.out.println(a - b);
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
//		String result = ((o == '+') ? a + b : (o == '-' ? a - b : "잘못입력하였습니다.")) + "";
//		System.out.printf("%d %c %d = %s\n", a, o, b, result);
		sc.close();
	}

}
