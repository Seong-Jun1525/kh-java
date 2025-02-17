package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception {
	private static final long serialVersionUID = 1L; // 따로 검색해보기. 웹 개발할 때는 거의? 안쓰인다
	
	public CharCheckException() {}
	public CharCheckException(String msg) {
		super(msg);
	}
}
