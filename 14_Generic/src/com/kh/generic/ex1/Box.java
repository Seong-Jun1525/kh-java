package com.kh.generic.ex1;

// 제네릭 적용 전!
public class Box {
	private Object ob; // 최상위 객체인 Object를 참조자료형으로 선언하여 모든 객체를 다 받을 수 있다.
	
	public Box() {}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
}

class Apple {
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}