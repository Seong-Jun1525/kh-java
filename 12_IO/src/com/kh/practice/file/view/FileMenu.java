package com.kh.practice.file.view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		int n;
		do {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			n = sc.nextInt();
			sc.nextLine();
			switch(n) {
				case 1:
					fileSave();
					break;
				case 2:
					fileOpen();
					break;
				case 3:
					fileEdit();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while(n != 9);
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void fileSave() {
		char answer = 0;
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String data = sc.nextLine();
			if(data.equals("ex끝it")) break;
			sb.append(data + "\n");
		}
		String fileName;
		do {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			fileName = sc.nextLine();
			
			if(fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				answer = sc.nextLine().charAt(0);
			} else {
				break;
			}
		} while(answer != 'y');
		File file = new File(fileName);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fc.fileSave(fileName, sb);
	}
	
	public void fileOpen() {
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
		// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String data = sc.nextLine();
				if(data.equals("ex끝it")) break;
				sb.append(data + "\n");
			}
			
			fc.fileEdit(fileName, sb);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}

}
