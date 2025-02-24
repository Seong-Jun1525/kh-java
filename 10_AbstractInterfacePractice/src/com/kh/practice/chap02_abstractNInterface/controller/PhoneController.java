package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		Phone[] phone = new Phone[2];
		
		// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// for 문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
		// 반환 값을 String 배열에 담아 반환 
		for(int i = 0; i < phone.length; i++) {
			if(phone[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)phone[i]).printInformation();
			} else if(phone[i] instanceof V40) {
				result[i] = ((V40)phone[i]).printInformation();
			}
		}
		
		return result;
	}
}
