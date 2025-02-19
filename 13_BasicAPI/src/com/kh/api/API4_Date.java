package com.kh.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class API4_Date {
	
	/**
	 * java.util.Date
	 * - 날짜, 시간 관련 클래스 
	 */

	public static void main(String[] args) {
		Date date = new Date();
		Date startDate = new Date(2024-1900, 11, 31);
		
		System.out.println(date);
		System.out.println(date.getDate());
		
		System.out.println(date.getDay());
		
		System.out.println(startDate);
		
		String format = "yyyy년 MM월 dd일 hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		System.out.println(sdf.format(startDate));
		
		// java.time.LocalDateTime
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		System.out.println(date3.getMonth());
		System.out.println(date3.getMonthValue());
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getDayOfYear());
		
		// 올해 며칠남았는지?
		// 올해 총 일수 - 현재까지의 일수
		LocalDateTime ldt = LocalDateTime.of(2025, 12, 31, 0, 0);
		System.out.println(ldt.getDayOfYear() - date3.getDayOfYear());
	}

}
