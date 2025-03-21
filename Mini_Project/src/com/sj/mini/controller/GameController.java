package com.sj.mini.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sj.mini.exception.MyException;
import com.sj.mini.model.vo.BackendDeveloper;
import com.sj.mini.model.vo.Developer;
import com.sj.mini.model.vo.Developer.TestLevel;
import com.sj.mini.model.vo.FrontendDeveloper;
import com.sj.mini.model.vo.FullStackDeveloper;
import com.sj.mini.model.vo.Skill;
import com.sj.mini.service.GameService;

public class GameController {
	GameService gs = new GameService();
	QuestionController qc = new QuestionController();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public GameController() {}

	// 개발자 생성
	public Developer createDeveloper(int n) throws MyException {
		Developer dev = null;
		
		String name = null;
		try {
			System.out.print("이름 : ");
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(!(1 <= n && n <= 3)) throw new MyException("메뉴에 없는 번호입니다!");
		
//		switch(n) {
//			case 1:
//				return new FrontendDeveloper(name, "프론트엔드 개발자");
//			case 2:
//				return new BackendDeveloper(name, "백엔드 개발자");
//			case 3:
//				return new FullStackDeveloper(name, "풀스택 개발자");
//		}
		
		switch(n) {
			case 1:
				dev = new FrontendDeveloper(name, "프론트엔드 개발자");
			case 2:
				dev = new BackendDeveloper(name, "백엔드 개발자");
			case 3:
				dev = new FullStackDeveloper(name, "풀스택 개발자");
		}
		
		int result = gs.insertDeveloper(dev);
		
		if(result > 0) {
			System.out.println("개발자 생성 성공!");
			return dev;
		} else {
			System.out.println("개발자 생성 실패!");
		}
		
		return null;
	}

	// 나의 정보 보기
	public void myInfo(Developer developer) {
		System.out.println();
		System.out.println("=".repeat(9) + " 개발자 정보 " + "=".repeat(9));
		System.out.println(developer.showStatus());
		System.out.println("=".repeat(31));
	}

	// 공부하기
	public void studySkill(Developer developer, String name) throws IOException {
		Skill mySkill = developer.getMySkill(name);
		
		if(mySkill != null) {
			developer.study(mySkill);
			System.out.println(developer.getMySkill(name).toString());
		} else System.out.println("잘못 입력했습니다.");
	}
	
	// 스킬 추가
	public void addSkill(Developer developer, String name) throws IOException {
		System.out.print("기술을 추가하시겠습니까? (y / n) : ");
		char answer = br.readLine().charAt(0);
		
		if(answer == 'y' || answer == 'Y') {
			developer.addSkill(name);
			System.out.println("기술을 추가했습니다!");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	// 대회 참가
	public int participateTest(String job, TestLevel tl) throws MyException {
		return qc.openTest(job, tl);
	}

	// 체력 감소
	public boolean isDischarge(int currentHp, Developer developer) {
//		System.out.println("현재 체력 : " + currentHp);
//		System.out.println("개발자 체력 : " + developer.getHp());
		/**
		 * currentHp : 공부하기 기능을 시작했을 때의 체력
		 * 
		 * currentHp와 공부하기 기능을 동작한 후의 변화되는 체력의 차가 10보다 크면 피로 누적으로 인한 종료
		 */
		if(currentHp - developer.getHp() > 10) {
			System.out.println("너무 많은 공부로 인해 피로가 쌓였습니다..ㅠ");
			return true;
		}
		return false;
	}
}
