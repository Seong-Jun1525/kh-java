package com.kh.generic.ex2;

public class Run {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<>();
		
		aBox.setOb(new Apple()); // 다형성 적용!
		Apple apple = aBox.getOb();

		System.out.println(aBox.getOb().toString());
		System.out.println(apple);
		
		Box<Orange> oBox = new Box<>();
		// Box 클래스는 제네릭이 적용되었고 타입을 Orange로 설정하였기 때문에
		// Orange 타입 혹은 Orange 클래스가 상속받는 클래스가 아닌 이상 오류가 발생한다
		oBox.setOb(new Orange());
//		oBox.setOb("Orange"); // 타입을 Orange로 지정했으므로 String은 타입이 맞지 않아 오류발생!
		Orange orange = oBox.getOb();

		System.out.println(oBox.getOb().toString());
		System.out.println(orange);
	}

}
