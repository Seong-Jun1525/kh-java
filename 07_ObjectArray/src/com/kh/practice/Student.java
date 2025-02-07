package com.kh.practice;

public class Student {
	private String stdName;
	private int stdAge;
	private char stdGender;
	
	public Student() {}
	
	public Student(String stdName, int stdAge, char stdGender) {
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdGender = stdGender;
	}
	
	public void studentInfo() {
		System.out.println("학생정보 : " + stdName + ", " + stdAge + ", " + stdGender);
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public char getStdGender() {
		return stdGender;
	}

	public void setStdGender(char stdGender) {
		this.stdGender = stdGender;
	}
}
