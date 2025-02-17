package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 영문자가 몇 개 들어있는지 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		int count = 0;
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		} else {
//			for(int i = 0; i < s.length(); i++) {
//				char c = s.charAt(i);
//				if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
//					count++;
//				}
//			}
			s = s.toLowerCase();
			
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if('a' <= c && c <= 'z') {
					count++;
				}
			}
		}
		
		return count;
	}

}
