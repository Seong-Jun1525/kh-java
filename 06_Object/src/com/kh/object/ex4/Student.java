package com.kh.object.ex4;

public class Student {
	// 멤버변수
	private String studentName;
	private int studentAge;
	private int mathScore;
	private int engScore;
	private int korScore;

	// 생성자
	public Student() {}
	public Student(String studentName, int mathScore, int engScore, int korScore) {
		this(studentName, 0, mathScore, engScore, korScore);
	}
	public Student(String studentName, int studentAge, int mathScore, int engScore, int korScore) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	
	// 메서드
	
	// 평균 계산
	public int getAverage() {
		return (mathScore + engScore + korScore) / 3;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}
	
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public String toString() {
		return "학생이름 : " + studentName + "\n"
				+ "학생나이 : " + (studentAge == 0 ? "나이 미상" : studentAge + "살") + "\n"
				+ "수학점수 : " + mathScore + "점\n"
				+ "영어점수 : " + engScore + "점\n"
				+ "국어점수 : " + korScore + "점";
	}
}
