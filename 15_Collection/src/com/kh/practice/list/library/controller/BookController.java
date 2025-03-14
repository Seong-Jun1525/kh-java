package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

//class SortBookList implements Comparator<Book> {
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		
//		return o1.getTitle().charAt(0) > o2.getTitle().charAt(0) ? 1 : -1;
//	}
//	
//}

public class BookController {
	List<Book> bookList = new ArrayList<>();

	public BookController() {
		// 기본생성자를 활용하여 bookList를 초기화 
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}

	public void insertBook(Book book) {
		bookList.add(book);
	}

	public ArrayList<Book> selectList() {
//		ArrayList<Book> selectList = (ArrayList<Book>) bookList; List타입의 bookList를 다운캐스팅하여 대입
		ArrayList<Book> selectList = new ArrayList<Book>();
		selectList.addAll(bookList); // ArrayList 타입의 addAll() 메서드를 사용하여 전체복사
		return selectList;
	}

	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchBook = new ArrayList<>(); 
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchBook.add(bookList.get(i));
			}
		}
		return searchBook;
	}

	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				removeBook = bookList.get(i);
				bookList.remove(i);
			}
		}
		return removeBook;
	}

	public int ascBook() {
//		Collections.sort(bookList, new SortBookList());
		Collections.sort(bookList);
		return 1;
	}

}
