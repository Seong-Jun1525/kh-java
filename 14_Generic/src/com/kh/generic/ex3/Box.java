package com.kh.generic.ex3;

/**
 * 타입 제한하기
 * <T extends 클래스 또는 인터페이스>
 * => 클래스 또는 인터페이스를 상속 혹은 구현하는 타입으로 제한!
 * => 클래스인 경우 해당 클래스도 포함됨!
 */
public class Box <T extends Number> {
	private T ob;
	
	public Box() {}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
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