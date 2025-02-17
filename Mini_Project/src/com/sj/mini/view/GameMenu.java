package com.sj.mini.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.sj.mini.controller.GameController;
import com.sj.mini.exception.MyException;
import com.sj.mini.model.vo.BackendDeveloper;
import com.sj.mini.model.vo.Developer;
import com.sj.mini.model.vo.FrontendDeveloper;
import com.sj.mini.model.vo.FullStackDeveloper;

public class GameMenu {
	private GameController gc = new GameController();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private FrontendDeveloper fd = new FrontendDeveloper();
	private BackendDeveloper bd = new BackendDeveloper();
	private FullStackDeveloper fsd = new FullStackDeveloper();
	
	public GameMenu() {}
	
	public void mainMenu() {
		System.out.println("====== 개발자 키우기 ======");
		if(fd.getName().equals(Developer.DEFAULT_NAME)
				&& bd.getName().equals(Developer.DEFAULT_NAME)
				&& fsd.getName().equals(Developer.DEFAULT_NAME)) {
			System.out.println("1. 프론트엔드 개발자 생성");
			System.out.println("2. 백엔드 개발자 생성");
			System.out.println("3. 풀스택 개발자 생성");
		} else {
			System.out.println("이미 캐릭터를 생성하였습니다.");
		}
		System.out.println("9. 종료하기");
		System.out.println("===========================");
		System.out.print("=> 입력 : ");
		
		try {
			try {
				Developer developer = gc.createDeveloper(Integer.parseInt(br.readLine()));
				
				if(developer != null) {
					if(developer instanceof FrontendDeveloper) {
						fd = ((FrontendDeveloper)(developer));
					} else if(developer instanceof BackendDeveloper) {
						bd = ((BackendDeveloper)(developer));
					} else if(developer instanceof FullStackDeveloper) {
						fsd = ((FullStackDeveloper)(developer));
					}
				}

				gameMenu(developer);
			} catch (MyException e) {
				e.getMessage();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private void gameMenu(Developer developer) {
		do {
			gc.myInfo(developer);
			System.out.println("\n======== 게임 메뉴 ========");
			System.out.println("1. 공부하기");
			System.out.println("2. 대회 참가 하기");
			System.out.println("3. 휴식하기");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			
			try {
				int n = Integer.parseInt(br.readLine());

				switch(n) {
					case 1:
						// 공부하기
						studySkillMenu(developer);
						break;
					case 2:
						// 대회참여
						joinContestMenu();
						break;
					case 3:
						// 휴식하기
						developer.rest();
						System.out.println("휴식했습니다.");
						break;
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(true);
	}

	private void joinContestMenu() {
		// 대회참여 메뉴
	}

	private void studySkillMenu(Developer developer) {
		System.out.println("\n======== 공부 하기 ========");
		System.out.println("공부할 기술을 입력하세요");
		System.out.println(developer.mySkillList());
		System.out.println("===========================");
		System.out.print("=> 입력 : ");
		
		try {
			gc.studySkill(developer, br.readLine());
			developer.decreaseExp((int)(Math.random() * 5 + 2));
			System.out.println("기술 공부 성공!\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
