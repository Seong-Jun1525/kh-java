package com.kh.practice2.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		/**
		 * 연도가 윤년이면 true, 평년이면
		 * false 리턴
		 * 
		 * (윤년: 연도가 4의 배수이면서,
		 * 100의 배수가 아니거나 400의 배수가 되는 해)
		*/
		
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
		
	}
	
	public long leapDate(Calendar c) {
		/**
		 * 1년 1월 1일부터 오늘까지의 총날 수를 계산
		 * 1년부터 현재 연도까지 각 연도가
		 * 윤년이면 총 날수에 366일을, 평년이면 365일을 더함
		 * 
		 * 해당 현재 연도가 윤년이면 2월을
		 * 29일로 평년이면 28일로 더함
		 * 
		 * 월의 날짜 수를 더함
		 * (31일: 1, 3, 5, 7, 8, 10, 12월/
		 * 30일: 4, 6, 9, 11월)
		 */
		
		int currentYear = c.get(Calendar.YEAR);
		long a = 0;
		
		for(int i = 1; i < currentYear; i++) {
			if(isLeapYear(i)) {
				a += 366;
			} else {
				a += 365;
			}
		}
		
		int cMonth = c.get(Calendar.MONTH);
		System.out.println(cMonth);
		
//		switch(cMonth) {
//		case 1:case 3: case 5: case 7: case 8: case 10: case 12:
//			a += 31;
//			break;
//		case 4: case 6: case 9: case 11:
//			a += 30;
//			break;
//		case 2:
//			a += isLeapYear(currentYear) ? 29 : 28;
//			break;
//		}
		
		for(int i = 0; i < cMonth; i++) {
			switch(i) {
			case 0:case 2: case 4: case 6: case 7: case 9: case 11:
				a += 31;
				break;
			case 3: case 5: case 8: case 10:
				a += 30;
				break;
			case 1:
				a += isLeapYear(currentYear) ? 29 : 28;
				break;
			}
		}
		
		// 현재 날짜 까지 더하기
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
//		return a + c.get(Calendar.DAY_OF_YEAR);
		
		// 현재 월에 맞게 더하기
		return a + c.get(Calendar.DAY_OF_MONTH);
//		return a;
	}
}
