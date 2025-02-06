package com.kh.object.ex3;

public class Book {
	/**
	 * - 클래스에 사용 가능한 접근 제한자 : 2가지
	 * 		- public, default(생략. 작성하면 오류남)
	 * 
	 * - 클래스 내 멤버에 사용할 수 있는 접근제한자 : 4가지
	 * 		public, protected, default, private
	 */
	
	// 멤버 변수
	private String bookTitle;
	private String category;
	private String author;
	private int pageCount;
	
	// 생성자
	// 정의한 현재 클래스를 생성할 때 사용되는 메서드
	// 객체를 생성할 때 데이터를 초기화하기 위한 목적으로 생성자를 정의함
	
	/**
	 * 생성자 명 == 클래스명
	 * 반환형, 반환값 x
	 */
	public Book() {} // 기본 생성자 : 생성자를 따로 정의하지 않으면 컴파일러를 통해 기본 생성자를 만듬

	public Book(String bookTitle, String category, String author) {
//		this.bookTitle = bookTitle;
//		this.category = category;
//		this.author = author;
		
		this(bookTitle, category, author, 0); // this()를 사용하면 클래스 내의 다른 생성자를 호출할 수 있음
	}

	public Book(String bookTitle, String category, String author, int pageCount) {
		this.bookTitle = bookTitle;
		this.category = category;
		this.author = author;
		this.pageCount = pageCount;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "제목 : " + bookTitle + "\n"
				+ "장르 : " + category + "\n"
						+ "저자 : " + author + "\n"
								+ "페이지수 : " + pageCount;
	}
}
