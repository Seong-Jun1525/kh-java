package com.sj.mini.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.sj.mini.controller.GameController;
import com.sj.mini.exception.MyException;
import com.sj.mini.model.vo.Developer;
import com.sj.mini.model.vo.Developer.TestLevel;

public class GameMenu {
	public static int turn = 0;
	private GameController gc = new GameController();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private boolean studyFlag = true; // false가 되면 체력이 방전된 상태 휴식해야함
	
	public GameMenu() {}
	
	public void mainMenu() {
		Developer developer = null;
		int n = 0;
		while(turn < 10) {
			System.out.println("====== 개발자 키우기 ======");
			if(developer == null) {
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
				e.getMessage();
			} catch (IOException e) {
				e.getMessage();
			}
			if(n == 9) break;
			if(1 <= n && n <= 3) {
				// 개발자 생성
				try {
					try {
						developer = gc.createDeveloper(n);

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
		while(turn < 10) {
			// 개발자 정보출력
			gc.myInfo(developer);
			
			System.out.println("\n======== 게임 메뉴 ========");
			System.out.println("1. 공부하기");
			System.out.println("2. 시험보기");
			System.out.println("3. 휴식하기");
			System.out.println("4. 스킬관리");
			System.out.println("9. 뒤로가기");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			
			try {
				n = Integer.parseInt(br.readLine());
				if(n == 9) break;

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
					case 4:
						// 스킬관
						skillManage(developer);
						break;
				}
			} catch (NumberFormatException e) {
				e.getMessage();
			} catch (IOException e) {
				e.getMessage();
			}
			count++;
			if(count % 3 == 0) {
				turn++;
				developer.nextTurn();
			}
		}
		System.out.println("턴이 종료되었습니다.");
		System.out.println("메인 메뉴로 돌아갑니다.\n");
	}

	private void skillManage(Developer developer) {
		// 스킬 관리
		String answer = null;
		while (true) {
			System.out.println("\n======== 공부 하기 ========");
			System.out.println("제거할 스킬 번호를 입력하세요");
			StringTokenizer stk = new StringTokenizer(developer.mySkillList());
			int len = stk.countTokens();
			for(int i = 1; i <= len; i++) {
				System.out.println(stk.nextToken());
			}
			System.out.println("뒤로가시려면 \"exit\"를 입력하세요");
			System.out.println("===========================");
			System.out.print("=> 입력 : ");
			try {
				answer = br.readLine();
				if(answer.equals("exit")) break;
				developer.removeSkill(answer);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void testMenu(Developer developer) {
		// 대회참여 메뉴
		int n = 0;
		do {
			System.out.println("\n========= 시험보기 ==========");
			System.out.println("1. 초급");
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
		System.out.println("\n========= 초급시험 ==========");
	}
	
	public void testMiddle() {
		// 중급 테스트			
		System.out.println("\n========= 중급시험 ==========");
	}
	
	public void testHard() {
		// 상급 테스트
		System.out.println("\n========= 고급시험 ==========");
	}

	private void studySkillMenu(Developer developer) {
		String answer = null;
		int currentHp = developer.getHp();
		while (true) {
			if(currentHp - developer.getHp() > 10 || !studyFlag) {
				System.out.println("너무 많은 공부로 인해 피로가 쌓였습니다..ㅠ");
				studyFlag = true; // studyFlag값을 true로
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
				e.getMessage();
			}
		}
	}

}
