package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		// PhoneController객체 생성하고 method() 호출 후 반환 값을 String 배열에 담고 
		// 반복문을 이용하여 String 배열의 각 인덱스 출력 
		PhoneController pc = new PhoneController();
		
		String[] strArr = pc.method();
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}

}
