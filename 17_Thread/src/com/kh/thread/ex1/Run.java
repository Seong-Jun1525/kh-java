package com.kh.thread.ex1;

public class Run {
	/** Thread
	 * 프로그램 내에서 실행 흐름을 가지고 있는 최소 작업 단위이다.
	 * - main 메서드 실행 시 메인스레드가 실행된다.
	 */

	public static void main(String[] args) {
		// 스레드 생성
		// 1) Thread 클래스를 상속 받아 생성
		Task t1 = new Task();
		
		// 2) Runnable 인터페이스를 구현하여 생성
		Runnable mr = new MyRunnable();
		Thread t2 = new Thread(mr); // 별도의 스레드로 분리해줘야함
		
		// 람다식 사용
		Runnable task2 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + "::람다식으로 작성한 스레드");
		};
		
		Thread t3 = new Thread(task2);

		t1.start();
		t2.start();
		t3.start();
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " END" );
	}

}
