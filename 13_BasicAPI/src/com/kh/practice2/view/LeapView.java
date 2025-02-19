package com.kh.practice2.view;

import java.util.Calendar;

import com.kh.practice2.controller.LeapController;

public class LeapView {

	public LeapView() {
		// 기본생성자로 이 안에 평년인지
		// 윤년인지, 1년 1월 1일부터 
		// 지금까지 며칠이 지났는지 모두 출력
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year + "년도는 " + (new LeapController().isLeapYear(year) ? "윤년" : "평년") + "입니다.");
		System.out.println("총 날짜 수 : " + new LeapController().leapDate(c));
	}

}
