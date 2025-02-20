package com.kh.api.review;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Review {

	public static void main(String[] args) {
		// TODO: 주어진 조건에 맞게 LocalDate 객체를 생성해보자.
		LocalDate date1 = LocalDate.now();   // 현재 날짜 정보로 객체 생성
		LocalDate date2 = LocalDate.parse("2024/12/31", DateTimeFormatter.ofPattern("yyyy/MM/dd"));   // 개강일(2024/12/31) 정보로 객체 생성
		LocalDate date3 = LocalDate.parse("2025/06/18", DateTimeFormatter.ofPattern("yyyy/MM/dd"));   // 종강일(2025/06/18) 정보로 객체 생성

		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		System.out.println("date3 : " + date3);
		
		// TODO: 주어진 조건에 맞게 LocalTime 객체를 생성해보자.
		LocalTime time1 = LocalTime.now();   // 현재 시간 정보로 객체 생성
		LocalTime time2 = LocalTime.parse("09:00", DateTimeFormatter.ofPattern("HH:mm"));   // 수업 시작 시간(09:00) 정보로 객체 생성
		LocalTime time3 = LocalTime.parse("18:00", DateTimeFormatter.ofPattern("HH:mm"));  // 수업 종료 시간(18:00) 정보로 객체 생성

		System.out.println("time1 : " + time1);
		System.out.println("time2 : " + time2);
		System.out.println("time3 : " + time3);
		
		// TODO: 주어진 조건에 맞게 LocalDateTime 객체를 생성해보자.
		LocalDateTime datetime1 = LocalDateTime.now();    // 현재 날짜,시간 정보로 객체 생성
		LocalDateTime datetime2 = LocalDateTime.of(2025, 2, 26, 9, 10);    // 자바 평가일(2025/02/26 09:10) 정보로 객체 생성

		System.out.println("datetime1 : " + datetime1);
		System.out.println("datetime2 : " + datetime2.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")));
		
		// * 추가 문제: 다음 코드의 결과를 예상해보자.
		System.out.println(date2.isBefore(date3));  // true
		System.out.println(time2.isAfter(time3));   // false
		System.out.println(datetime1.isEqual(datetime2));  // false
	}

}
