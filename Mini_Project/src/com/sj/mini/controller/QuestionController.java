package com.sj.mini.controller;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.sj.mini.model.dao.TestFileDAO;
import com.sj.mini.model.vo.Developer;
import com.sj.mini.model.vo.Developer.TestLevel;
import com.sj.mini.model.vo.Question;

public class QuestionController {
	private TestFileDAO fileDAO = new TestFileDAO();
	private Scanner sc = new Scanner(System.in);

	public QuestionController() {}
	
	/**
	 * 개발자 정보와 테스트 레벨 정보를 넘겨받고 해당 레벨에 맞는 테스트를 진행
	 * 
	 * 파일에 테스트 질문과 답을 넣고 "/"를 구분자로 해서 질문과 답을 Question 객체 리스트배열에 저장
	 * 
	 * 질문을 출력하고 사용자로부터 답을 입력받고 입력받은 답은 배열에 저장
	 * 
	 * 채점 기능을 통해 입력받은 답 배열과 리스트배열의 정답과 일치하는지 비교 후 일치하면 count 증가
	 * 
	 * 후에 count * 5 해서 점수 출력
	 */

	// 초급 테스트
	public int openBasicTest(Developer delveoper, TestLevel tl) {
		int score = 0;
		if(tl == TestLevel.BASIC) {
			System.out.println("초급 시험\n" + "-".repeat(30));
			
			score = basicTest(delveoper, tl) * 10;
			
			System.out.println("결과는 " + score + "점 입니다.");
		} else System.out.println("난이도가 일치하지 않습니다.");
		
		return score;
	}
	
	public int basicTest(Developer delveoper, TestLevel tl) {
		char[] myAnsArr = new char[10];
		int count = 0;
		if(fileDAO.checkBaiscFolder(tl)) {
			List<Question> result = fileDAO.fileOpen(tl, "question_java.txt");
			for(int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i).getQuestion());
				StringTokenizer stk = new StringTokenizer(result.get(i).getHint(), "$");
				
				while(stk.hasMoreTokens()) {
					System.out.println(stk.nextToken());
				}
				System.out.print("정답 입력 : ");
				int answer = sc.nextInt();
				
				if(answer == result.get(i).getAnswer()) myAnsArr[i] = 'O';
				else myAnsArr[i] = 'X';
				System.out.println("\n" + "-".repeat(30));
			}
		}
		
		for(int i = 0; i < myAnsArr.length; i++) {
			if(myAnsArr[i] == 'O') {
				count++;
			}
		}
		
		return count;
	}
	
	// 중급 테스트
	public void openMiddleTest(Developer delveoper, TestLevel tl) {
		if(tl == TestLevel.MIDDLE) {
			System.out.println("중급 시험");
		} else System.out.println("난이도가 일치하지 않습니다.");
	}
	
	// 상급 테스트
	public void openHardTest(Developer delveoper, TestLevel tl) {
		if(tl == TestLevel.HARD) {
			System.out.println("상급 시험");
		} else System.out.println("난이도가 일치하지 않습니다.");
	}
}
