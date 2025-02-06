package com.kh.object.practice1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void changeName(String name) {
		this.memberName = name; // 지금처럼 매개변수 명이랑 멤버변수명이랑 이름이 다를 경우 this를 생략할 수도 있다
	}
	
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
}
