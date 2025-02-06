package com.kh.object.ex2;

public class Student {
	// 변수부 (사용할 데이터를 선언하는 영역) -> 필드부라고도 함
	private String userName;
	private int userAge;
	private double userHeight;
	
	// 생성자부 (데이터를 초기화하기 위한 특수한 목적으로 메서드를 정의하는 영역)
	public Student() {}
	public Student(String userName, int userAge, double userHeight) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userHeight = userHeight;
	}
	
	// 메서드부 (기능을 정의하는 영역)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public double getUserHeight() {
		return userHeight;
	}
	public void setUserHeight(double userHeight) {
		this.userHeight = userHeight;
	}
	
	// 출력
	public void print() {
		System.out.println("==========================================");
		System.out.printf("이름 : %s\n나이 : %d살\n키 : %.2fcm\n", userName, userAge, userHeight);
		System.out.println("==========================================");
	}
}
