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

public class GameController {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public GameController() {}

	public Developer createDeveloper(int n) throws MyException {
		// 개발자 생성
		String name = null;
		try {
			System.out.print("이름 : ");
			name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(!(1 <= n && n <= 3)) {
			throw new MyException("메뉴에 없는 번호입니다.!");
		}
		
		switch(n) {
			case 1:
				return new FrontendDeveloper(name, "프론트엔드 개발자");
			case 2:
				return new BackendDeveloper(name, "백엔드 개발자");
			case 3:
				return new FullStackDeveloper(name, "풀스택 개발자");
		}
		
		return null;
	}
	
	public void myInfo(Developer developer) {
		// 나의 정보 보기
		System.out.println("\n======= 개발자 정보 =======");
		System.out.println(developer.showStatus());
		System.out.println("===========================");
	}

	public void studySkill(Developer developer, String name) throws IOException {
		Skill mySkill = developer.getMySkill(name);
		
		if(mySkill != null) {
			developer.study(mySkill);
			System.out.println(developer.getMySkill(name).toString());
		} else {
			System.out.println("=== 해당 기술이 존재하지 않습니다. ===");
			System.out.print("기술을 추가하시겠습니까? (y / n) : ");
			char answer = br.readLine().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
				developer.addSkill(name);
				System.out.println("기술을 추가했습니다!");
			}
		}
	}
	
	public void participateTest(Developer developer, TestLevel tl) throws MyException {
		
	}
}
