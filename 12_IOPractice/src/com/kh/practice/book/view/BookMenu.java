package com.kh.practice.book.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.dao.Book;

public class BookMenu {
	// 필드
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	Book[] bArr;
	
	public BookMenu() {
		// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu(){
		// 1. 도서 추가 저장 ➔ fileSave()
		// 2. 저장 도서 출력 ➔ fileRead()
		// 9. 프로그램 끝내기 ➔ “프로그램 종료” 출력 후 종료
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		int n;
		do {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:
					fileSave();
					break;
				case 2:
					fileRead();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		} while(n != 9);
		System.out.println("프로그램 종료");
	}
	public void fileSave() {
		// 도서 명 :
		// 저자 명 :
		// 도서 가격 :
		// 출판 날짜(yyyy-mm-dd) :
		// 할인율 :
		// 입력받은 값을 Book 객체에 담고
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		sc.nextLine();
		for(int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null) {
				bArr[i] = new Book(title, author, price, date, discount);
				break;
			}
		}
		bc.fileSave(bArr);
	}
	public void fileRead(){
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		Book[] bookArr = bc.fileRead();
		
		for(int i = 0; i < bookArr.length; i++) {
			System.out.println(bookArr[i]);
			if(bookArr[i + 1] == null) break;
		}
	}
}
