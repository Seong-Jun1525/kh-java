package com.kh.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		System.out.println(sdf.format(startDate));
		System.out.println(sdf.format(date));
		
		// java.time.LocalDateTime
		LocalDateTime date3 = LocalDateTime.now();
		System.out.println(date3);
		System.out.println(date3.getMonth());
		System.out.println(date3.getMonthValue());
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getDayOfYear());
		
		// 올해 며칠남았는지?
		// 올해 총 일수 - 현재까지의 일수
		LocalDateTime ldt = LocalDateTime.of(date3.getYear(), 12, 31, 0, 0);
		System.out.println("올해 며칠남았는지? " + (ldt.getDayOfYear() - date3.getDayOfYear()) + "일");
		
		System.out.println(date3.getHour());
		
		// 퇴근까지 몇시간 남았는지?
		System.out.println("퇴근까지 몇시간 남았는지? " + (18 - date3.getHour()) + "시간 남았습니다.");
		
		// LocalDateTime 형식 지정
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		System.out.println(date3.format(dtf));
	}

}
