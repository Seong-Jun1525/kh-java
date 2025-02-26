package com.kh.last.p7;

public class MultiThreadTest {

	public static void main(String[] args) {
		Data data = new Data(); //공유데이터
		Thread putThread = null;
		Thread getThread = null;
		// data 를 공유하는 Provider 와 Customer 객체 생성 : Thread 객체 생성함
		// 쓰래드 구동
		putThread = new Provider(data);
		getThread = new Customer(data);
		putThread.start();
		getThread.start();
	}

}
