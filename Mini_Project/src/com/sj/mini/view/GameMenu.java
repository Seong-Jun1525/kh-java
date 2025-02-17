package com.sj.mini.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.sj.mini.controller.GameController;

public class GameMenu {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public GameMenu() {}
	
	public void mainMenu() {
		System.out.println("====== 개발자 키우기 ======");
		System.out.println("1. 프론트엔드 개발자 생성");
		System.out.println("2. 백엔드 개발자 생성");
		System.out.println("3. 풀스택 개발자 생성");
		System.out.println("9. 종료하기");
		System.out.println("===========================");
		System.out.print("=> 입력 : ");
		try {
			new GameController().createDeveloper(Integer.parseInt(br.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
