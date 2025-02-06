package com.kh.object.ex4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
//		Student std1 = new Student("임성준", 26, 100, 100, 100);
//		Student std2 = new Student("홍길동", 30, 50, 100);
//		Student std3 = new Student("김유신", 80, 67, 100);
//		Student std4 = new Student("계백", 34, 23, 76);
//		
//		System.out.println(std1.toString());
//		System.out.println("학생평균 : " + std1.getAverage() + "/100점");
//		System.out.println("======================");
//		System.out.println("======================");
//		System.out.println(std2.toString());
//		System.out.println("학생평균 : " + std2.getAverage() + "/100점");
//		System.out.println("======================");
//		System.out.println("======================");
//		System.out.println(std3.toString());
//		System.out.println("학생평균 : " + std3.getAverage() + "/100점");
//		System.out.println("======================");
//		System.out.println("======================");
//		System.out.println(std4.toString());
//		System.out.println("학생평균 : " + std4.getAverage() + "/100점");
//		System.out.println("======================");
//		System.out.println("======================");
		
		
		Scanner sc = new Scanner(System.in);
		char exit;
		while(true) {
			System.out.print("이름 : ");
			String studentName = sc.nextLine();
			System.out.print("나이 : ");
			int studentAge = sc.nextInt();
			
			System.out.print("수학 : ");
			int studentMath = sc.nextInt();
			if((studentMath > 100) || (studentMath < 0)) {
				System.out.println("점수는 0 ~ 100점 입니다.");
				sc.nextLine();
				continue;
			}
			
			System.out.print("영어 : ");
			int studentEng = sc.nextInt();
			if((studentEng > 100) || (studentEng < 0)) {
				System.out.println("점수는 0 ~ 100점 입니다.");
				sc.nextLine();
				continue;
			}
			
			System.out.print("국어 : ");
			int studentKor = sc.nextInt();
			if((studentKor > 100) || (studentKor < 0)) {
				System.out.println("점수는 0 ~ 100점 입니다.");
				sc.nextLine();
				continue;
			}
			
			sc.nextLine();
			
			Student std = new Student(studentName, studentAge, studentMath, studentEng, studentKor);

			System.out.println(std.toString());
			System.out.println(std.getStudentName() + "학생의 평균 : " + std.getAverage() + "/100점");
			System.out.println("======================");
			System.out.println("======================");

			System.out.print("종료하시려면 N 혹은 n을 입력하시고 계속하시려면 아무거나 입력하세요 : ");
			exit = sc.nextLine().charAt(0);
			if(exit == 'N' || exit == 'n') {
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
		
		sc.close();
	}

}
