package com.kh.object.practice6.run;

import com.kh.object.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Do it! 자바프로그래밍 입문", "이지스퍼블리싱", "박은종");
		Book b3 = new Book("Do it! HTML+CSS+자바스크립트 웹 표준의 정석", "이지스퍼블리싱", "고경희", 27000, 0);
		
		b1.inform();
		System.out.println("===============");
		b2.inform();
		System.out.println("===============");
		b3.inform();
	}

}
