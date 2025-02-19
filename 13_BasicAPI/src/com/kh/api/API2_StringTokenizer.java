package com.kh.api;

import java.util.StringTokenizer;

public class API2_StringTokenizer {
	
	/**
	 * java.util.StringTokenizer => import!!
	 * 문자열 내의 특정 구분자로 나눠주는 클래스 (토큰화) 
	 * 구분자가 여러개 일수 있음
	 * 		=> 여러개일경우 new StringTokenizer(str, "|,") 이런식으로 구분자를 나열해주면 됨
	 */

	public static void main(String[] args) {
		String str1 = "Winter is coming";
		String str2 = "Hello, My name is SeongJun";
		String str3 = "안녕하세요? 반갑습니다. 임성준입니다. 중간입니다. 임성준입니다. 임성준입니다. 임성준입니다.";
		StringTokenizer stk = new StringTokenizer(str1);
		
		String[] strArr1 = str1.split(" ");
		String[] strArr2 = str2.split(" ");
		
		// nextElement()는 객체를 토큰으로 구분할 때 사용하는 메서드
		// nextToken()은 문자열을 토큰으로 구분할 때 사용하는 메서드
		
		for(int i = 0; i < strArr1.length; i++) {
			System.out.print(stk.nextElement() + " "); // nextElement는 Object 타입을 반환
		}
		System.out.println();
		System.out.println("-".repeat(30));

		stk = new StringTokenizer(str2);
		for(int i = 0; i < strArr2.length; i++) {
			System.out.print(stk.nextToken() + " "); // nextToken은 String 타입을 반환
		}
		System.out.println();
		System.out.println("-".repeat(30));

		stk = new StringTokenizer(str3);
		// 중간까지 출력함
		for(int i = 0; i < stk.countTokens(); i++) {
			System.out.print(stk.nextToken() + " ");
		}
		System.out.println();
		System.out.println("-".repeat(30));
		
		
		String data = "안녕하세요|나는임성준입니다.|반갑습니다.";
		stk = new StringTokenizer(data, "|");
		
		// 변수명.hasMoreTokens():boolean => 토큰화 가능 여부 체크
		// 변수명.nextToken():String => 분리된(토큰화된) 문자열을 반환
		
		String[] strArr3 = new String[3];
		int idx = 0;
		
		while(stk.hasMoreTokens()) {
			strArr3[idx] = stk.nextToken();
			System.out.println(strArr3[idx++]);
		}
		
	}

}
