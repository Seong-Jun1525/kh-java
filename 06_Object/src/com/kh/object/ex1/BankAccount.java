package com.kh.object.ex1;

public class BankAccount {
	private int balance = 0; // 예금잔액
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	/**
	 * 기능 (메서드)
	 * 접근 제한자 [예약어] 반환형 메서드명(매개변수정보) {
	 * 
	 * }
	 */
	
	// 입금기능 (예금 잔액에 값을 더함)
	public void deposit(int money) {
		this.balance += money;
	}
	
	// 출금기능 (예금잔액에서 값을 뺌)
	public int withdraw(int money) {
		// 예금잔액에서 전달된 금액을 뺌
		this.balance -= money;
		return this.balance;
	}
	
	// 조회기능(예금잔액정보 출력)
	public int check() {
		return this.balance;
	}
}
