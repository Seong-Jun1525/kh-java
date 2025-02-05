package com.kh.object.example;

public class BankAccountRun {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(0);
		BankAccount ba2 = ba1; // ba2변수는 ba1 참조변수가 가지고 있는 인스턴스의 주소를 저장! => 같은 인스턴스를 참조하게 됨!
		
		System.out.println("초기 잔액 : " + ba1.check());
		
		// 500원 입금
		ba1.deposit(500000);

		System.out.println("500000원 입금 후 잔액 : " + ba1.check() + "원");
		
		// 1000원 출금
		ba1.withdraw(10000);
		
		System.out.println("10000원 입금 후 잔액 : " + ba1.check() + "원");
		
		ba2.deposit(3000); // 같은 주소를 저장했기 때문에 값이 변경됨
		System.out.println("ba 3000원 입금 후 잔액 : " + ba1.check() + "원");
		System.out.println("ba2 3000원 입금 후 잔액 : " + ba2.check() + "원");
	}

}