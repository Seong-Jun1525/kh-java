package com.sj.mini.model.vo;

public class Question {
	private String question;
	private String hint;
	private int answer;
	
	public Question() {}

	public Question(String question, String hint, int answer) {
		this.question = question;
		this.hint = hint;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
}
