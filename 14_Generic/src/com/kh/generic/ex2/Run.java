package com.kh.generic.ex2;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();
		
		aBox.setOb(new Apple()); // 다형성 적용!
		Apple apple = aBox.getOb();

		System.out.println(aBox.getOb().toString());
		System.out.println(apple);
		
		Box<Orange> oBox = new Box<>();
		oBox.setOb(new Orange());
//		oBox.setOb("Orange"); // 타입을 Orange로 지정했으므로 String은 타입이 맞지 않아 오류발생!
		Orange orange = oBox.getOb();

		System.out.println(oBox.getOb().toString());
		System.out.println(orange);
	}

}
