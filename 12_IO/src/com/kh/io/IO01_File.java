package com.kh.io;

import java.io.File;
import java.io.IOException;

public class IO01_File {

	public static void main(String[] args) {
		/**
		 * 파일을 통해 입출력하기
		 * >> File 클래스 사용 (java.util.File)
		 */
//		fileTest1();
		fileTest2();
	}
	
	private static void fileTest2() {
		// sample 폴더를생성한 후 myDiary.txt 파일 만들기

		File f1_folder = new File("sample");
		File f1 = new File("sample//myDiary.txt");
		
		if(!f1_folder.exists()) {
			f1_folder.mkdir(); // 폴더 생성
		}

		try {
			// 존재하는지 체크 후 생성하는 방법을 많이 사용함
			if(!f1.exists()) {
				f1.createNewFile();
			}
			
			// 파일 객체로부터 파일 정보 얻기
			System.out.println("파일명 : " + f1.getName());
			System.out.println("파일절대경로 : " + f1.getAbsolutePath());
			System.out.println("파일상대경로 : " + f1.getPath());
			System.out.println("파일용량 : " + f1.length()); // 바이트 단위
			System.out.println("파일의 상위 폴더 : " + f1.getParent());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void fileTest1() {
		// File 객체 생성 => new File("파일명");
		// => 파일 객체 생성. 실제 파일은 생성되지 않음.
		
		// [1] 파일명만 전달하여 생성
		File f1 = new File("test1.txt");
		
		// [2] 실제로 존재하는 폴더 경로+파일명 전달하여 생성
		File f2 = new File("D:\\test2.txt");
		
		// [3] 존재하지 않는 폴더 경로+파일명 전달하여 생성
		// File f3 = new File("D:\\tmp\\test3.txt"); // 존재하지 않는 폴더에는 파일 생성 불가
		
		File f3_folder = new File("D:\\tmp");
		File f3 = new File("D:\\tmp\\test3.txt");
		
		// 파일 존재 유무 확인
		File f4 = new File("test4.txt");
		
		// File 객체명.createNewFile(); // => 실제 파일을 만들어주는 메서드
		try {
			f1.createNewFile();
			f2.createNewFile();
			f3_folder.mkdir(); // 폴더 생성
			f3.createNewFile();
			
			// 파일이 존재하는지 확인하는 메섣 : exists()
			System.out.println("f1 파일이 존재하는지 : " + f1.exists());
			System.out.println("f4 파일이 존재하는지 : " + f4.exists() + "\n");
			
			// 파일인지 확인하는 메서드 : isFile
			System.out.println("f1은 파일인가?" + f1.isFile());
			System.out.println("f3_folder은 파일인가?" + f3_folder.isFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
