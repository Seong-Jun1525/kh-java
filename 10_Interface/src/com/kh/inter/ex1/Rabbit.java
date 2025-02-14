package com.kh.inter.ex1;

public class Rabbit implements Animal, Baby {
	// Rabbit 클래스는 Animal, Baby 인터페이스를 상속받는다(구현한다)

	// shift+alt+s > v
	@Override
	public void move() {
		// Baby라.. 기능없음....
	}

	@Override
	public void eat() {
		System.out.println("Rabbit이 풀을 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("-----??@@@");
	}

}
