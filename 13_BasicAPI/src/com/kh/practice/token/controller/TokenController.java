package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {}
	
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
//		String result = "";
//		StringTokenizer stk = new StringTokenizer(str);
//		int n = stk.countTokens();
//		for(int i = 0; i < n; i++) result += stk.nextToken();
//		return result;
		StringTokenizer stk = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		
		while(stk.hasMoreTokens()) {
			sb.append(stk.nextToken());
		}
		
		return sb.toString();
	}
	
	public String firstCap(String input){
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		if(input.length() == 0) return input;
		StringBuilder sb = new StringBuilder(input);
		char firstC = input.toUpperCase().charAt(0);
		sb.setCharAt(0, firstC);
		return sb.toString();
		
		// => 간단하게 변경
//		if(input.length() <= 1) return input;
//		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	
	public int findChar(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		if(input.length() == 0 || input.indexOf(one) == -1) return 0;
		char[] cArr = input.toCharArray();
		int count = 0;
		
//		for(int i = 0; i < cArr.length; i++) {
//			if(cArr[i] == one) count++; 
//		}
		
		// => forEach 문으로 변경
		for(char c : cArr) {
			if(c == one) count++;
		}
		
		return count;
	}

}
