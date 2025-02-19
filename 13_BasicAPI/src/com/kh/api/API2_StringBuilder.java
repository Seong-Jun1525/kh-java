package com.kh.api;

public class API2_StringBuilder {

	/**
	 * java.lang.StringBuilder 클래스
	 * 
	 *  문자열 값을 변경할 수 있다
	 *  => 같은 메모리 공간에서 값을 변경할 수 있다
	 */
	
	public static void main(String[] args) {
		String str = "Winter";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		int hasCodeV = System.identityHashCode(sb);
		System.out.println(hasCodeV);
		
		// 값 변경
		sb.append(" is");
		sb.append(" coming..");
		
		System.out.println(sb);
		

		int hasCodeVV = System.identityHashCode(sb);
		System.out.println(hasCodeVV); // 첫 번쩨 값이랑 동일
	}

}
