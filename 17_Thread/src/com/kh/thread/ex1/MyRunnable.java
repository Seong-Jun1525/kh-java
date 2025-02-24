package com.kh.thread.ex1;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int n1 = 5;
		int n2 = 12;
		
		System.out.println(Thread.currentThread().getName() + " : " + (n1 + n2));
	}

}
