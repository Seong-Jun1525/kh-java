package com.kh.practice;

import java.util.Scanner;

public class ObjectArrayRun {

	/**
	 * 객체 배열
	 * 여려 개의 객체를 관리하는 구조
	 * 
	 * 선언 및 할당
	 * - 클래스명[] 변수명 = new 클래스명[배열크기];
	 * 
	 * 인덱스 위치에 초기화
	 * 변수명[인덱스값] = new 클래스명(); // => 해당 인덱스 위치에 객체를 생성하여 할당
	 */
	
	public static void main(String[] args) {
//		int[][] arr1 = new int[3][3];
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr1[i].length; j++) {
//				arr1[i][j] = i+1;
//			}
//		}
//
//		System.out.println(arr1);
//		System.out.println(arr1[0]);
//		
//		// 객체 배열
//		Student[] stdArr = new Student[2];
//		stdArr[0] = new Student("임성준", 25, '남');
//		stdArr[1] = new Student("홍길동", 12, '남');
//		
//		stdArr[0].studentInfo();
//		stdArr[1].studentInfo();
//		stdArr[1] = null;
//		stdArr[0].studentInfo();
////		stdArr[1].studentInfo();
//		
//		System.out.println(stdArr);
//		System.out.println(stdArr[0]);
		
		Scanner sc = new Scanner(System.in);
		Student[] stdArr2 = new Student[2];

		for(int i = 0; i < stdArr2.length; i++) {
			System.out.print("이름 : ");
			String studentName = sc.nextLine();
			
			System.out.print("나이 : ");
			int studentAge = sc.nextInt();
			sc.nextLine();
			
			System.out.print("성별 : ");
			char studentGender = sc.nextLine().charAt(0);
			
			stdArr2[i] = new Student(studentName, studentAge, studentGender);
		}
		
		for(Student s : stdArr2) s.studentInfo();
		
		sc.close();
	}

}