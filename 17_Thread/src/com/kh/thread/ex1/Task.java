package com.kh.thread.ex1;

// Thread 클래스 상속
public class Task extends Thread {

	// 메인메서드 처럼 독립적으로 실행될 수 있는 메서드 => run 메서드 오버라이딩해야함
	@Override
	public void run() {
		int n1 = 20;
		int n2 = 50;
		
		// 현재 스레드 정보 : Thread.currentThread()
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
	
}
