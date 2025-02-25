package com.kh.last.p3;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하시오");
		System.out.print("년 : ");
		int year = sc.nextInt();
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		System.out.println("입력된 날짜에 대한 정보는 아래와 같습니다.");

		GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일 E요일"); // E는 컴퓨터의 언어 설정을 따라간다. 혹은 지역정보를 추가한다.
		System.out.println(sdf.format(gc.getTime()));
		System.out.println(year + "년은 " + (gc.isLeapYear(year) ? "윤년" : "평년") + "이다.");
		
		sc.close();
	}

}
