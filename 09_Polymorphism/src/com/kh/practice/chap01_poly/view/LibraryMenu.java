package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryController의 insertMember() 메소드에 전달
		// ==== 메뉴 ==== // 무한 반복 실행
		// 1. 마이페이지 // LibraryController의 myInfo() 호출하여 출력
		// 2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
		// 3. 도서 검색 // LibraryMenu의 searchBook() 호출
		// 4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
		// 9. 프로그램 종료하기
		// 메뉴 번호 :
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		
		lc.insertMember(new Member(name, age, gender));
		
		System.out.println();
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
			int n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:
					System.out.println(lc.myInfo().toString());
					System.out.println();
					break;
				case 2:
					selectAll();
					System.out.println();
					break;
				case 3:
					searchBook();
					System.out.println();
					break;
				case 4:
					rentBook();
					System.out.println();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
	}
	public void selectAll() {
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		for(int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i + "번 도서 : " + lc.selectAll()[i].toString());
		}
	}
	
	public void searchBook() {
		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		// LibraryController의 searchBook() 에 전달
		// 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] == null) break;
			System.out.println(searchList[i].toString());
		}
	}
	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		// LibraryController의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우 → “성공적으로 대여되었습니다.” 출력
		// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요” 출력
		System.out.println();
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		switch(result) {
			case 0:
				System.out.println("성공적으로 대여되었습니다.");
				break;
			case 1:
				System.out.println("나이 제한으로 대여 불가능입니다.");
				break;
			case 2:
				System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
				break;
		}
	}
}
