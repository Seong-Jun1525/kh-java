package com.kh.object.ex3;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Do it! 자바프로그래밍 입문", "교육", "박은종", 596);
		
		b1.setBookTitle("자바의 정석");
		String b1Title = b1.getBookTitle();
		
		System.out.println(b1Title);
		System.out.println(b1.toString());
		System.out.println("=====");
		System.out.println(b2.toString());
	}

}
