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
import com.sj.mini.model.vo.Developer.TestLevel;
import com.sj.mini.model.vo.FrontendDeveloper;
import com.sj.mini.model.vo.FullStackDeveloper;

public class GameMenu {
	public static int turn = 0;
	private GameController gc = new GameController();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private FrontendDeveloper fd = new FrontendDeveloper();
	private BackendDeveloper bd = new BackendDeveloper();
	private FullStackDeveloper fsd = new FullStackDeveloper();
	
	public GameMenu() {}
	
	public void mainMenu() {
		Developer developer = null;
		int n = 0;
		while(turn < 10) {
			System.out.println("====== 개발자 키우기 ======");
			if(fd.getName().equals(Developer.DEFAULT_NAME)
					&& bd.getName().equals(Developer.DEFAULT_NAME)
					&& fsd.getName().equals(Developer.DEFAULT_NAME)) {
				System.out.println("1. 프론트엔드 개발자 생성");
				System.out.println("2. 백엔드 개발자 생성");
				System.out.println("3. 풀스택 개발자 생성");
			} else {
				System.out.println("이미 캐릭터를 생성하였습니다.");
				System.out.println("4. 게임 메뉴로 가기");
			}
			System.out.println("9. 종료하기");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			try {
				n = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(n == 9) break;
			if(1 <= n && n <= 3) {
				// 개발자 생성
				try {
					try {
						developer = gc.createDeveloper(n);
						
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
					e.getMessage();
				}
			} else if(n == 4) {
				// 이미 생성되었을 경우
				gameMenu(developer);
			}
		}
		System.out.println("프로그램 종료합니다.");
	}

	private void gameMenu(Developer developer) {
		int n = 0;
		int count = 0;
		do {
			// 개발자 정보출력
			gc.myInfo(developer);
			
			System.out.println("\n======== 게임 메뉴 ========");
			System.out.println("1. 공부하기");
			System.out.println("2. 시험보기");
			System.out.println("3. 휴식하기");
			System.out.println("9. 뒤로가기");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			
			try {
				n = Integer.parseInt(br.readLine());

				switch(n) {
					case 1:
						// 공부하기
						studySkillMenu(developer);
						break;
					case 2:
						// 대회참여
						testMenu(developer);
						break;
					case 3:
						// 휴식하기
						developer.rest();
						break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			count++;
			if(count % 3 == 0) {
				turn++;
				developer.nextTurn();
			}
		} while(n != 9);
		System.out.println("메인 메뉴로 돌아갑니다.\n");
	}

	private void testMenu(Developer developer) {
		// 대회참여 메뉴
		int n = 0;
		do {
			System.out.println("\n========= 시험보기 ==========");
			System.out.println("1. 기초");
			System.out.println("2. 중급");
			System.out.println("3. 고급");
			System.out.println("9. 뒤로가기");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			try {
				n = Integer.parseInt(br.readLine());
				TestLevel tl = developer.participate(developer, n);
				gc.participateTest(developer, tl);
			} catch (NumberFormatException e) {
				e.getMessage();
			} catch (IOException e) {
				e.getMessage();
			}catch (MyException e) {
				e.getMessage();
			}
		} while(n != 9);
		System.out.println("게임 메뉴로 돌아갑니다.\n");
	}
	
	public void testBasic() {
		// 초급 테스트
		System.out.println("현재 미구현 입니다.");
	}
	
	public void testMiddle() {
		// 중급 테스트			
		System.out.println("현재 미구현 입니다.");
	}
	
	public void testHard() {
		// 상급 테스트
		System.out.println("현재 미구현 입니다.");
	}

	private void studySkillMenu(Developer developer) {
		String answer = null;
		while (true) {
			if(developer.getHp() < 70) {
				System.out.println("너무 많은 공부로 인해 피로가 쌓였습니다..ㅠ");
				break;
			}
			System.out.println("\n======== 공부 하기 ========");
			System.out.println("공부할 기술을 입력하세요");
			System.out.println(developer.mySkillList());
			System.out.println("뒤로가시려면 \"exit\"를 입력하세요");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			try {
				answer = br.readLine();
				if(answer.equals("exit")) break;
				gc.studySkill(developer, answer);
				developer.decreaseExp((int)(Math.random() * 5 + 2));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
