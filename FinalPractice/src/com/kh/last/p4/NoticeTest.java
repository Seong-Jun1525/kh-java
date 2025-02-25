package com.kh.last.p4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NoticeTest {

	public static void main(String[] args) {
		NoticeTest nt = new NoticeTest();
		Object[] obArray = new Object[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("등록할 공지사항을 입력하시오.(3번 반복 입력 처리함)");
		// 키보드로 Notice 객체의 초기값을 입력받아, 생성자로 초기화한다. – for 사용
		for(int i = 0; i < 3; i++) {
			// no 는 인덱스 + 1
			// date 는 직접 값 지정 처리함
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("작성자 : ");
			String writer = sc.nextLine();
			
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			obArray[i] = new Notice(i + 1, title.replaceAll(" ", "&"), new Date(), writer, content.replaceAll(" ", "&"));
		}
		
		// fileSave() 메소드 실행
		nt.fileSave(obArray);
		
		// fileRead() 메소드 실행
		ArrayList<Notice> list = nt.fileRead();
		
		// 리턴된 리스트 정보 출력 처리 – for each 문 사용
		for(Notice n : list) {
			System.out.println(n);
		} //toString() 사용 출력 
	}

	public void fileSave(Object[] array) {
		File f = new File("notice.dat");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			for(Object n : array) {
				bw.write(n + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Notice> fileRead() {
		ArrayList<Notice> nList = new ArrayList<Notice>();
		
		File f = new File("notice.dat");
		String data = null;
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
			while((data = br.readLine()) != null) {
				StringTokenizer stk = new StringTokenizer(data);
				int no = Integer.parseInt(stk.nextToken());
				String title = stk.nextToken().replaceAll("&", " ");
				String dateStr = stk.nextToken();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = formatter.parse(dateStr);
				String writer = stk.nextToken();
				String content = stk.nextToken().replaceAll("&", " ");
				
				nList.add(new Notice(no, title, date, writer, content));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return nList;
	}
}
