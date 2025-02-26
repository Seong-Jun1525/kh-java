package com.kh.last.p7;

public class Customer extends Thread {
	private Data data;

	public Customer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println("get value : " + data.getValue());
			} catch (EmptyException e1) {
				// TODO Auto-generated catch block
				e1.getMessage();
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
