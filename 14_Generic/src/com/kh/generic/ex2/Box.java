package com.kh.generic.ex2;

/** 제네릭 적용!
 * 타입을 의미하는 T를 제네릭에 타입매개변수로 설정한다
 * 
 * <T>의 의미는 Box 클래스 내에서 타입매개변수 T를 사용하는 곳은
 * 
 * 전부 참조변수 T가 참조하는 클래스로 바뀐다.
 * 
 * 즉 데이터의 타입을 일반화시켜준다.
 * 
 * T의 타입은 여기서 지정하지 않고 객체를 생성할 때 정해준다
 */
public class Box <T> {
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