package com.kh.generic.ex3;

public class Run {

	public static void main(String[] args) {
		// Box<Apple> aBox = new Box<>();
		// => Number 클래스를 상속하고 있는 클래스가 아니므로 에러 발생!
		
		Box<Number> nBox = new Box<>(); // Number도 포함되므로 오류X
		Box<Integer> iBox = new Box<>();
		Box<Double> dBox = new Box<>();
		// => Number 또는 Number 타입을 상속 받는 클래스이기 때문에 가능!
	}

}
