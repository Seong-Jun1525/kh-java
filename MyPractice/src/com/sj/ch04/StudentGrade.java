package com.sj.ch04;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// 성적에 따라 학점 부여하기 p.100
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score <= 100 && score >= 90) {
			grade = 'A';
		} else if(score < 90 && score >= 80) {
			grade = 'B';
		} else if(score < 80 && score >= 70) {
			grade = 'C';
		} else if(score < 70 && score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("성적은 %c입니다.\n", grade);
	}

}
