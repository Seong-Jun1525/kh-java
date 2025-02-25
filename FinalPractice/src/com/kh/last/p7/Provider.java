package com.kh.last.p7;

import com.kh.last.p6.Data;

public class Provider extends Thread {
	private Data data;

	public Provider(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			int r = (int)(Math.random() * 100 + 1);
			System.out.println("값이 입력되었습니다.");
			data.setValue(r);
			System.out.println("put value : " + r);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
