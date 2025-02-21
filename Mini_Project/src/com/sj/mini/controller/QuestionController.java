package com.sj.mini.controller;

import java.util.ArrayList;
import java.util.List;

import com.sj.mini.model.vo.Developer.TestLevel;
import com.sj.mini.model.vo.Question;

public class QuestionController {
	
	List<Question> qList = new ArrayList<>();

	public QuestionController() {}

	public QuestionController(TestLevel tl) {
		if(tl == TestLevel.BASIC) {
			
		}
	}
	
	/**
	 * 개발자 정보와 테스트 레벨 정보를 넘겨받고 해당 레벨에 맞는 테스트를 진행
	 * 
	 * 파일에 테스트 질문과 답을 넣고 "/"를 구분자로 해서 질문과 답을 Question 객체 리스트배열에 저장
	 * 
	 * 질문을 출력하고 사용자로부터 답을 입력받고 입력받은 답은 배열에 저장
	 * 
	 * 채점 기능을 통해 입력받은 답 배열과 리스트배열의 정답과 일치하는지 비교 후 일치하면 count증가
	 * 
	 * 후에 count * 5 해서 점수 출력
	 */

	public void openTest(TestLevel tl) {
		if(tl == TestLevel.BASIC) {
			
		}
	}
	
}
