package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		// ******* 메인 메뉴 *******
		// 1. 새 도서 추가 // insertBook () 실행
		// 2. 도서 전체 조회 // selectList ()
		// 3. 도서 검색 조회 // searchBook ()
		// 4. 도서 삭제 // deleteBook ()
		// 5. 도서 명 오름차순 정렬 // ascBook()
		// 9. 종료 // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
		// 메뉴 번호 선택 : >> 입력 받음
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		int n = 0;
		
		do {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 번호 입력 : ");
			n = sc.nextInt();
			sc.nextLine();
			
			switch(n) {
				case 1:
					insertBook();
					break;
				case 2:
					selectList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 5:
					ascBook();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					break;
			}
			
		} while(n != 9);
		System.out.println("프로그램을 종료합니다.");
	}
	
	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
		// 1. 도서명 입력받기 (String title)
		// 2. 저자명 입력받기 (String author)
		// 3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
		// 4. 가격 입력받기 (int price)
		// 5. 매개변수 생성자를 이용하여 Book 객체 생성
		// (객체 생성 시 장르 번호 별로 조건식 이용해 장르번호가 아닌 장르 명으로 값 넘겨야 함)
		// 6. bc(BookController)의 insertBook으로 위의 Book 객체 전달
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		String bookCategory = null;
		
		System.out.print("도서 명 : ");
		String bookTitle = sc.nextLine();
		
		System.out.print("저자 명 : ");
		String bookAuthor = sc.nextLine();
		
		do {
			System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
			int bookCategoryNum = sc.nextInt();
			
			switch(bookCategoryNum) {
				case 1:
					bookCategory = "인문";
					break;
				case 2:
					bookCategory = "자연과학";
					break;
				case 3:
					bookCategory = "의료";
					break;
				case 4:
					bookCategory = "기타";
					break;
				default:
					System.out.println("장르 번호를 다시 입력해주세요.");
			}
		} while(bookCategory == null);
		
		System.out.print("가격 : ");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		
		bc.insertBook(new Book(bookTitle, bookAuthor, bookCategory, bookPrice));
	}
	
	// 2. 도서 전체용 view 메소드
	public void selectList() {
		// 1. bc(BookController)의 selectList() 메소드를 호출 후
		//  --> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입
		// 2. 조건식 이용해서
		//  2_1. bookList가 "비어있는 경우" --> "존재하는 도서가 없습니다." 라는 알람 문구 출력
		//  2_2. bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
		System.out.println();
	}
	
	// 3. 도서 검색용 view 메소드
	public void searchBook() {
		// 1. 검색할 도서명 키워드로 입력 받기 (String keyword)
		// 2. bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 후
		//  --> 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
		//  ** 결과 값이 한 도서의 Book 객체가 아니라 리스트인 이유
		//  보통 프로그램에서 검색 할 때 풀 네임을 쳐서 검색하지 않고 키워드로 검색
		//  즉, 키워드를 포함한 결과가 하나가 아닌 여러 개일 수 있기 때문에 리스트로 받기
		// 3. 조건식 이용해서
		//  3_1. searchList가 "비어있는 경우" --> "검색 결과가 없습니다."라는 알람 문구 출력
		//  3_2. searchList가 "비어있지 않은 경우" --> 반복문으로 searchList 안의 Book 객체들 출력
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book s : searchList) {
				System.out.println(s);
			}
		}
		System.out.println();
	}
	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {
		// 1. 삭제할 도서명 입력 받기 (String title)
		// 2. 삭제할 저자명 입력 받기 (String author)
		// ** 도서명과 저자명을 같이 입력 받는 이유
		//  --> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
		// 3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
		// --> 결과 값을 임의의 Book(Book remove)에 대입
		// 4. 조건식 이용해서
		//  4_1. remove가 존재하는 경우 --> "성공적으로 삭제되었습니다."라는 문구 출력
		//  4_2. remove가 존재하지 않은 경우 --> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
		System.out.println("===== 도서 삭제 =====");
		
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		System.out.println();
	}

	// 5. 도서 명 오름차순 정렬용 view 메소드
	public void ascBook() {
		// bc(BookController)의 ascBook() 메소드 값에 따라
		// 성공 시 “정렬에 성공하였습니다.”, 실패 시 “정렬에 실패하였습니다.” 출력
		int result = bc.ascBook();
		
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		System.out.println();
	}
}
