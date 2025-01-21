package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void userInfo() {
		Scanner sc = new Scanner(System.in);
		String name;
		String gender;
		char g;
		int age;
		double height;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.next();
		g = gender.charAt(0);
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		
//		System.out.println(name + gender + age + height);

		// 소수점은 반올림 해서 출력해줌
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다.^^\n", height, age, gender, name);
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다.^^\n", height, age, g, name);
	}
	
}
