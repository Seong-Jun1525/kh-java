package com.kh.generic.ex1;

public class Run {

	public static void main(String[] args) {
		Box aBox = new Box();
		
		aBox.setOb(new Apple()); // 다형성 적용!
		Apple apple = (Apple)aBox.getOb(); // 다운캐스팅 적용
		
		System.out.println(apple);
		
		Box oBox = new Box();
		oBox.setOb("Orange"); // String도 클래스. 즉, 객체이므로 전달 가능...
		Orange orange = (Orange)oBox.getOb();
		
		System.out.println(orange);
		// ClassCastException 오류 발생!!
		// => 형변환은 상속관계에서만 가능한데 String은 Orange객체와 상속관계가 아니므로 형변환이 불가능하다
	}

}
