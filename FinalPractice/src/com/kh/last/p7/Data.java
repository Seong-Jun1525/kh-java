package com.kh.last.p7;

public class Data {
	int value;
	boolean isEmpty = true;

	public Data() {}

	public synchronized int getValue() throws EmptyException {
		
		try {
			if(this.value == 0) throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오…");
			
			while(this.isEmpty) wait();
			isEmpty = true;
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}

	public synchronized void setValue(int value) {
		
		try {
			while(!this.isEmpty) wait();
			this.value = value;
			isEmpty = false;
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
